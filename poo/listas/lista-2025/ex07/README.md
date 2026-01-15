# Exercício 07 — Sistema de Lugares em uma Sala

Este exercício implementa um sistema simples de controle de lugares em uma sala, utilizando **arrays de objetos**, **encapsulamento** e **regras de negócio** em Java.

## 🎯 Objetivo
Modelar uma sala com vários lugares (cadeiras), permitindo:
- Reservar e liberar lugares
- Verificar a quantidade de lugares livres
- Exibir o estado de todos os lugares da sala

## 🧱 Estrutura das Classes

### Classe `Lugar`
Representa um lugar (cadeira) da sala.

#### Atributos:
- `numero` (int) — número da cadeira
- `fila` (int) — número da fila
- `ocupado` (boolean) — indica se o lugar está ocupado

Todos os atributos são encapsulados e validados por métodos `get` e `set`.

---

### Classe `Sala`
Representa a sala e gerencia um conjunto de lugares.

#### Atributos:
- `Lugar[] lugar` — array de lugares da sala

#### Construtor:
- Recebe a quantidade total de lugares
- Inicializa automaticamente:
  - Numeração sequencial das cadeiras
  - Organização por filas (cada 10 cadeiras pertencem à mesma fila)

## 🔍 Métodos Implementados

### `reservar(int pos)`
- Reserva o lugar na posição informada
- Lança exceção se o lugar já estiver ocupado

### `liberar(int pos)`
- Libera o lugar na posição informada
- Lança exceção se o lugar já estiver livre

### `lugaresLivres()`
- Retorna a quantidade total de lugares disponíveis na sala

### `toString()`
- Exibe todos os lugares da sala
- Indica número da cadeira, fila e se está **LIVRE** ou **OCUPADA**

## 🧠 Conceitos Trabalhados
- Programação Orientada a Objetos
- Encapsulamento
- Arrays de objetos
- Validação de dados
- Regras de negócio
- Sobrescrita do método `toString()`

## 📌 Observação
Exercício desenvolvido para fins educacionais, com foco na prática de modelagem de classes e manipulação de objetos em Java.
