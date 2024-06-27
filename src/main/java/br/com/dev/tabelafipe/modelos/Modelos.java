package br.com.dev.tabelafipe.modelos;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
// EM USO
@JsonIgnoreProperties (ignoreUnknown = true)
public record Modelos (List<Dados> modelos) {
}
