package br.com.dev.tabelafipe.principal;

import br.com.dev.tabelafipe.modelos.DadosVeiculo;
import br.com.dev.tabelafipe.service.ConsumoApi;
import br.com.dev.tabelafipe.service.ConverteDados;

import java.util.Scanner;

public class Principal {
    private final Scanner scanner = new Scanner(System.in);
    private ConsumoApi consumo = new ConsumoApi();
    private final String ENDERECO = "https://parallelum.com.br/fipe/api/v1/";
    private final String API_KEY = "/marcas/";
    private ConverteDados conversor = new ConverteDados();

    public void exibeMenu() {
        System.out.println("""
                *** OPÇÕES ***
                Carros
                Motos
                Caminhões
                Digite uma das opções para consultar valores:
                """);
        var veiculo = scanner.nextLine();
        var json = consumo.obterDados(ENDERECO + veiculo.toLowerCase() + API_KEY);
        DadosVeiculo dadosVeiculo = conversor.obterDados(json, DadosVeiculo.class);
        System.out.println(dadosVeiculo);
    }
}
