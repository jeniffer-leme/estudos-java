# Exercício 02 - Classe Ponto2D

Este exercício implementa uma classe `Ponto2D` em Java para representar pontos no plano cartesiano 2D.

## Funcionalidades

- Atributos encapsulados: `x` e `y`.
- Construtor para inicializar os atributos.
- Métodos `set` e `get` para cada atributo.
- Método `mostrarPonto()` → exibe o ponto no formato `(x,y)`.
- Métodos de comparação com outro ponto:
  - `estaAcimaDe(Ponto2D outro)` → retorna `true` se o ponto atual estiver acima do outro.
  - `estaAbaixoDe(Ponto2D outro)` → retorna `true` se o ponto atual estiver abaixo do outro.
  - `estaAEsquerdaDe(Ponto2D outro)` → retorna `true` se o ponto atual estiver à esquerda do outro.
  - `estaADireitaDe(Ponto2D outro)` → retorna `true` se o ponto atual estiver à direita do outro.

## Como usar

1. Compile a classe:
```bash
javac Ponto2D.java
