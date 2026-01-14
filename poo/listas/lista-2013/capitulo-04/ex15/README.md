# Exercício 15 – Classe Ponto2D

Este exercício implementa uma classe que representa um ponto no plano cartesiano,
utilizando coordenadas do tipo `double`.

## 📌 Objetivo
Praticar:
- Uso de construtores sobrecarregados
- Encapsulamento de atributos
- Criação e comparação de objetos
- Sobrescrita do método `toString`

## 🧱 Estrutura da Classe
A classe `Ponto2D` possui dois atributos privados:
- `x` → coordenada horizontal
- `y` → coordenada vertical

## ⚙️ Construtores
- `Ponto2D()`  
  Inicializa o ponto na origem do plano cartesiano `(0, 0)`.

- `Ponto2D(double x, double y)`  
  Inicializa o ponto com as coordenadas fornecidas.

## 🔁 Métodos Implementados
- `inicializaPonto(double, double)` → redefine as coordenadas do ponto  
- `ehIgual(Ponto2D)` → verifica se dois pontos possuem as mesmas coordenadas  
- `origem()` → retorna um novo ponto localizado na origem  
- `clona()` → retorna uma cópia do ponto atual  
- `toString()` → retorna o ponto no formato `(x, y)`

## 📝 Observação
Os métodos `origem` e `clona` retornam **novas instâncias** de `Ponto2D`,
evitando alterações no objeto original.
