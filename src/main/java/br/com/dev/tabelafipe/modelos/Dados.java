package br.com.dev.tabelafipe.modelos;
// EM USO!
public record Dados (String nome, String codigo){
    @Override
    public String toString() {
        return "Nome: " + nome.toUpperCase() + " - Código: " + codigo;
    }
}
