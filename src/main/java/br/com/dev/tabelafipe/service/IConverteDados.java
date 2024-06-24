package br.com.dev.tabelafipe.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
