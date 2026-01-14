# Exercício 03 - Classe Matriz

Este exercício implementa uma classe `Matriz` em Java para representar matrizes 2x2 ou 3x3 de números do tipo `double`.

## Funcionalidades

- Atributo encapsulado: `matriz` (array bidimensional) e `tamanho`.
- Construtores:
  - `Matriz(int tamanho, double valor)` → inicializa todos os elementos com o valor passado.
  - `Matriz(int tamanho)` → inicializa todos os elementos com 0.0.
- Métodos:
  - `getValor(int linha, int coluna)` → retorna o valor de um elemento.
  - `setValor(int linha, int coluna, double valor)` → altera o valor de um elemento.
  - Operações sobre todos os elementos:
    - `somaElementoMatriz(double valor)`  
    - `subtrairElementoMatriz(double valor)`  
    - `multiplicarElementoMatriz(double valor)`  
    - `dividirElementoMatriz(double valor)`  
  - `maiorNumero()` → retorna o maior número da matriz.  
  - `menorNumero()` → retorna o menor número da matriz.  
  - `determinanteDaMatriz()` → calcula o determinante da matriz (2x2 ou 3x3).  
  - `toString()` → imprime a matriz formatada.

## Como usar

1. Compile a classe:
```bash
javac Matriz.java
