# TABELA FIPE 🚗

Projeto de uma Tabela Fipe, para consultar valores de veículos. Esse projeto foi criado a partir do desafio do Curso "Java: trabalhando com lambdas, streams e Spring Framework", da [Alura](https://www.alura.com.br/).

## **Como rodar o projeto: ✅**
Para esse exemplo, vamos escolher o carro Virtus da Volkswagen, modelo Exclusive 250TSI 1.4 Flex 16v Aut.
```
Digite 1
Digite 59
virt
10411
```
Imprimindo:
```
Veículo com todos os anos existentes na FIPE: 
VW - VOLKSWAGEN - Modelo: VIRTUS Exclusive 250TSI 1.4 Flex 16V Aut - Gasolina - Ano: 2023 - no valor de: R$ 128.657,00
VW - VOLKSWAGEN - Modelo: VIRTUS Exclusive 250TSI 1.4 Flex 16V Aut - Gasolina - Ano: 2024 - no valor de: R$ 134.558,00
VW - VOLKSWAGEN - Modelo: VIRTUS Exclusive 250TSI 1.4 Flex 16V Aut - Gasolina - Ano: 2025 - no valor de: R$ 140.578,00
VW - VOLKSWAGEN - Modelo: VIRTUS Exclusive 250TSI 1.4 Flex 16V Aut - Gasolina - Ano: 32000 - no valor de: R$ 149.552,00
```

## **Para criar o projeto, fiz o seguinte passo a passo:**
📌 criar um menu para o usuário escolher entre Carro - Moto - Caminhão;

📌 imprimir informações de Código e Marca do veículo escolhido e solicitar ao usuário que digite um trecho do nome do veículo para consulta;

📌 imprimir veículos da marca escolhida e solicitar ao usuário que digite o código do modelo para consultar valores;

📌 imprimir o veículo selecionado com todos os valores por todos os anos disponíveis.

Com esse projeto, consolidei meus conhecimentos em **consumo de API**, utilização do método **stream()** e **Spring Framework**. Além de reforçar a aprendizagem de lógica de programação, o uso do próprio GitHub, criação de pacotes e classes em sua proporção necessária para que, por exemplo, uma não fique extensa demais dificultando uma possível manutenção posterior. Pude compreender melhor o uso da **biblioteca Jackson** e algumas de suas ferramentas, como @JsonAlias e @JsonIgnoreProperties, essenciais para a conversão dos dados.

## **Problemas enfrentados** ⚠️

Por ser meu primeiro projeto, e consequentemente também o primeiro projeto utilizando o Spring Framework, a biblioteca Jackson e o método stream(), encontrei algumas dificuldades no meio do caminho, tais como a utilização do:
#### Problema 01:
"List" para acoplar um conjunto de dados, o qual precisei usar três vezes durante o projeto, para criar uma lista de modelos filtrados, uma lista de anos dos modelos e a lista dos veículos em si, depois de filtrados.
#### Problema 02:
stream() para filtrar, ordenar e até criar uma nova lista da forma desejada a partir da lista já existente;
#### Problema 03:
@JsonAlias pois no início do projeto, não havia compreendido que, quando a informação que vem do JSON é exatamente o nome da nossa variável, não preciso utilizar essa ferramenta. rs E quando a utilizo, é necessário verificar o tipo dessa variável para que, quando convertê-la, não ocorra erro de desserialização.

* **Como solucionei:** fiz testes em exercícios diferentes, anotei todo o projeto em um caderno e expliquei, linha a linha, como tudo funciona, porque fazer dessa maneira e não de outra. E o mais importante: depois de tentar várias vezes fazer sozinha algumas implementações e não conseguir, assisti como as instrutoras fizeram o código e, através do que explicaram, implementei da minha maneira, fazendo modificações, para consolidar a explicação e, no final das contas, o projeto também ter a minha cara e o meu código!

A API que eu utilizei para esse projeto foi essa [aqui](https://deividfortuna.github.io/fipe/)!


## **Tecnologias utilizadas:** 
* [Java](https://www.java.com/pt-BR/)
* [Spring Framework](https://spring.io/projects/spring-framework)
* [Jackson](https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-databind)

## ⏭️ Próximos passos:
A partir dessa aplicação, quero criar uma aplicação simples de Calculadora IMC 🧮 e uma aplicação que consuma dados de uma API de conversor de moedas 🪙.
