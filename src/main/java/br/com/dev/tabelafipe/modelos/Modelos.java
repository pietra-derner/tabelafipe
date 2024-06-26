package br.com.dev.tabelafipe.modelos;

public class Modelos {
    private String codigo;
    private String marca;
    private String modelo;
    private Integer ano;
    private Double valor;

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Modelos(String codigo, DadosModelos dadosModelos){
        this.codigo = dadosModelos.codigo();
        this.marca = dadosModelos.marca();
    }

    @Override
    public String toString() {
        return "codigo=" + codigo + '\n' +
                ", marca=" + marca;
    }
}
