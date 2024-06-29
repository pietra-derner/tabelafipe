package br.com.dev.tabelafipe.principal;

import br.com.dev.tabelafipe.modelos.Dados;
import br.com.dev.tabelafipe.modelos.DadosMarcas;
import br.com.dev.tabelafipe.modelos.DadosVeiculo;
import br.com.dev.tabelafipe.modelos.Modelos;
import br.com.dev.tabelafipe.service.ConsumoApi;
import br.com.dev.tabelafipe.service.ConverteDados;

import java.util.*;
import java.util.stream.Collectors;

public class Principal {
    private final Scanner scanner = new Scanner(System.in);
    private ConsumoApi consumo = new ConsumoApi();
    private final String ENDERECO = "https://parallelum.com.br/fipe/api/v1/";
    private ConverteDados conversor = new ConverteDados();

    public void exibeMenu() {
        System.out.println("""
                $ TABELA FIPE $ 
                1) Carros e Utilitários
                2) Motos 
                3) Caminhões e Micro-Ônibus
                Digite qual das opções para consultar:
                """);
        var opcao = scanner.nextInt();
        String endereco;

        switch (opcao){
            case 1:
                endereco = ENDERECO + "carros/marcas/";
                break;
            case 2:
                endereco = ENDERECO + "motos/marcas/";
                break;
            case 3:
                endereco = ENDERECO + "caminhoes/marcas/";
                break;
            default:
                System.out.println("Opção inválida! Até mais!");
                return;
        }

        //converte os dados para transformar em uma url completa da opção escolhida
        var json = consumo.obterDados(endereco);

        // transforma o array de códigos e nomes da api em uma lista
        var marcas = conversor.obterLista(json, Dados.class);
        // usa o stream para ordenar a lista em ordem alfabética dos nomes dos veículos
        // e os imprime nessa ordem
        marcas.stream()
                        .sorted(Comparator.comparing(Dados::nome))
                        .forEach(System.out::println);

        System.out.println("Digite o código da marca para consulta: ");
        var codigoMarca = scanner.nextInt();
        endereco = endereco + codigoMarca + "/modelos/";
        json = consumo.obterDados(endereco);
        var modeloList = conversor.obterDados(json, Modelos.class);
        System.out.println("\n Modelos da marca: ");
        modeloList.modelos().stream()
                        .sorted(Comparator.comparing(Dados::nome))
                        .forEach(System.out::println);

        System.out.println("\nDigite um trecho do nome do veículo para consulta:");
        var trechoModelo = scanner.next();
        List<Dados> modelosFiltrados = modeloList.modelos().stream()
                .filter(v -> v.nome().toLowerCase().contains(trechoModelo.toLowerCase()))
                .collect(Collectors.toList());
        System.out.println("\nModelos filtrados: ");
        modelosFiltrados.forEach(System.out::println);

        System.out.println("Digite o código do modelo desejado:");
        var codigoModelo = scanner.next();
        endereco = endereco + codigoModelo + "/anos/";
        json = consumo.obterDados(endereco);
        List<Dados> anosDoModelo = conversor.obterLista(json, Dados.class);
        List<DadosVeiculo> veiculos = new ArrayList<>();
        for (Dados dados : anosDoModelo) {
            var enderecoAnos = endereco + dados.codigo();
            json = consumo.obterDados(enderecoAnos);
            DadosVeiculo veiculo = conversor.obterDados(json, DadosVeiculo.class);
            veiculos.add(veiculo);
        }

        System.out.println("\nVeículo com todos os anos existentes na FIPE: ");
        veiculos.stream()
                .sorted(Comparator.comparing(DadosVeiculo::ano))
                .forEach(System.out::println);
    }
}
