# Exercício 20 – Classe Retangulo

Este exercício implementa a classe `Retangulo`, que representa um retângulo definido
por dois pontos extremos no plano cartesiano, utilizando a classe `Ponto2D`.

## 📌 Objetivo
Praticar:
- Sobrecarga de construtores
- Composição entre classes
- Inicialização de objetos a partir de diferentes parâmetros

## 🧱 Estrutura da Classe Retangulo
A classe possui dois atributos privados:
- `x` → primeiro ponto extremo do retângulo
- `y` → segundo ponto extremo do retângulo

Ambos são instâncias da classe `Ponto2D`.

## ⚙️ Construtores Implementados

- `Retangulo()`  
  Cria um retângulo cujos dois pontos extremos estão na origem `(0, 0)`.

- `Retangulo(Ponto2D y)`  
  Cria um retângulo onde um ponto extremo está na origem `(0, 0)` e o outro é o ponto
  passado como argumento.

- `Retangulo(Ponto2D x, Ponto2D y)`  
