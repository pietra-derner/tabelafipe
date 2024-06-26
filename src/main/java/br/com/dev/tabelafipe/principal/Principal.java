package br.com.dev.tabelafipe.principal;

import br.com.dev.tabelafipe.modelos.DadosMarcas;
import br.com.dev.tabelafipe.modelos.Modelos;
import br.com.dev.tabelafipe.service.ConsumoApi;
import br.com.dev.tabelafipe.service.ConverteDados;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class Principal {
    private final Scanner scanner = new Scanner(System.in);
    private ConsumoApi consumo = new ConsumoApi();
    private final String ENDERECO = "https://parallelum.com.br/fipe/api/v1/";
    private ConverteDados conversor = new ConverteDados();

    public void exibeMenu() {
        System.out.println("""
                $ TAPELA FIPE $ 
                1) Carros
                2) Motos
                3) Caminhões
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

        var json = consumo.obterDados(endereco);
        System.out.println(json);

        System.out.println("Digite o código da marca para consulta: ");
        var marca = scanner.nextInt();
        json = consumo.obterDados(endereco + marca + "/modelos/");
        System.out.println(json);

//        System.out.println("Digite um trecho do nome do veículo para consulta:");
//        var trechoModelo = scanner.nextLine();
    }
}
