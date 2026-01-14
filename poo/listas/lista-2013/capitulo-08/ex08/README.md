# Exercício 08 – Herança: Lâmpada Fluorescente

Este exercício implementa a classe `LampadaFluorescente` como herdeira da classe `Lampada`,
conforme o enunciado da lista 2013 (exercício 2.7).

## 📌 Objetivo
Praticar:
- Herança entre classes
- Reutilização de código
- Uso do construtor da superclasse (`super`)
- Encapsulamento de atributos

## 🧱 Estrutura das Classes

### Classe `Lampada`
Representa uma lâmpada genérica, contendo:
- Estado da lâmpada (acesa ou apagada)
- Métodos para acender, apagar e verificar o estado

### Classe `LampadaFluorescente`
Especialização da classe `Lampada`, adicionando:
- Comprimento da lâmpada em centímetros
- Construtor para inicializar os atributos herdados e próprios
- Método para exibir o tamanho da lâmpada

## 📝 Observação
A classe `LampadaFluorescente` herda todos os comportamentos da classe `Lampada`,
evitando duplicação de código.
