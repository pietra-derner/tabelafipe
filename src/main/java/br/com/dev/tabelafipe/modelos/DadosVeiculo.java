package br.com.dev.tabelafipe.modelos;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosVeiculo(@JsonAlias("codigo") String codigo,
                           @JsonAlias("nome") String marca) {
}
