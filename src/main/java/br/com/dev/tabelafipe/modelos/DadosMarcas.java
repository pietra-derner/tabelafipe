package br.com.dev.tabelafipe.modelos;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosMarcas(@JsonAlias("codigo") String numero,
                          @JsonAlias("nome") List<DadosModelos> modelos) {
}
