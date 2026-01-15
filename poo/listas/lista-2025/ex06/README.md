# Exercício 06 — Classe Ponto2D

Este exercício implementa a classe `Ponto2D`, que representa um ponto no plano cartesiano bidimensional, utilizando conceitos fundamentais de **Programação Orientada a Objetos em Java**.

## 🎯 Objetivo
Modelar um ponto no plano cartesiano e fornecer métodos para:
- Exibir suas coordenadas
- Comparar a posição de um ponto em relação a outro
- Calcular a distância entre dois pontos

## 🧱 Estrutura da Classe

### Classe `Ponto2D`
A classe encapsula:
- `x` (double) — coordenada horizontal
- `y` (double) — coordenada vertical

Os valores são inicializados por meio do construtor e acessados via métodos `get` e `set`.

## 🔍 Métodos Implementados
- `mostrar()` — retorna as coordenadas do ponto em formato textual
- `estaAcimaDe(Ponto2D p)` — verifica se o ponto está acima de outro
- `estaAbaixoDe(Ponto2D p)` — verifica se o ponto está abaixo de outro
- `estaADireitaDe(Ponto2D p)` — verifica se o ponto está à direita de outro
- `estaAEsquerdaDe(Ponto2D p)` — verifica se o ponto está à esquerda de outro
- `distancia(Ponto2D p)` — calcula a distância entre dois pontos no plano

## 📐 Fórmula Utilizada
A distância entre dois pontos A(x₁, y₁) e B(x₂, y₂) é calculada por:  
√((x₂ − x₁)² + (y₂ − y₁)²)  


## 🧠 Conceitos Trabalhados
- Encapsulamento
- Métodos de comparação entre objetos
- Cálculo matemático
- Uso da classe `Math`
- Programação Orientada a Objetos

## 📌 Observação
Exercício desenvolvido para fins educacionais, como parte de simulados e práticas em Java.


