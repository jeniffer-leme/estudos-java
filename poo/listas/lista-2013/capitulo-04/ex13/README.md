# Exercício 13 – Classe NumeroComplexo

Este exercício aborda a implementação de uma classe que representa números complexos,
com foco no uso de **construtores sobrecarregados** e **operações matemáticas básicas**.

## 📌 Objetivo
Praticar:
- Criação de múltiplos construtores
- Encapsulamento de atributos
- Operações com números complexos

## 🧱 Estrutura da Classe
A classe `NumeroComplexo` possui:
- Parte real (`numero1`)
- Parte imaginária (`numero2`)

Ambos os atributos são privados e acessados apenas dentro da própria classe.

## ⚙️ Construtores
- `NumeroComplexo(int real, int imaginario)`  
  Inicializa o número complexo com valores reais e imaginários informados.

- `NumeroComplexo(int real)`  
  Inicializa apenas a parte real, considerando a parte imaginária como zero.

- `NumeroComplexo()`  
  Inicializa o número complexo como 0 + 0i.

## 🔁 Métodos Implementados
- `inicializaNumero(int, int)` → redefine os valores do número complexo  
- `imprimirNumero()` → imprime o número no formato a + bi  
- `ehIgual(NumeroComplexo)` → verifica se dois números complexos são iguais  
- `soma(NumeroComplexo)` → soma dois números complexos  
- `subtrai(NumeroComplexo)` → subtrai um número complexo de outro  
- `multiplica(NumeroComplexo)` → multiplica números complexos  
- `divide(NumeroComplexo)` → divide números complexos

## 📝 Observação
As operações modificam o próprio objeto (`this`), seguindo o modelo proposto no exercício.
