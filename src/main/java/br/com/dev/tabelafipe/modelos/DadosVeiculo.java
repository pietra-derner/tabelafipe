package br.com.dev.tabelafipe.modelos;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
// EM USO
@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosVeiculo(@JsonAlias("Valor") String valor,
                           @JsonAlias("Marca") String marca,
                           @JsonAlias("Modelo") String modelo,
                           @JsonAlias("AnoModelo") Integer ano,
                           @JsonAlias("Combustivel") String combustivel){

    @Override
    public String toString() {
        return marca.toUpperCase() +
                " - Modelo: " + modelo +
                " - " + combustivel +
                " - Ano: " + ano +
                " - no valor de: " + valor;
    }
}