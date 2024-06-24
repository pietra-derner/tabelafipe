package br.com.dev.tabelafipe.modelos;

public class Veiculo {
    private String codigo;
    private String marca;
    private String modelo;
    private Integer ano;
    private Double valor;

    public Veiculo (String codigo, DadosVeiculo dadosVeiculo){
        this.codigo = dadosVeiculo.codigo();
        this.marca = dadosVeiculo.marca();
    }
}
