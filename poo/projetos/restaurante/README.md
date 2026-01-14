# Projeto Restaurante

Este projeto implementa um sistema simples para gerenciamento de um restaurante com até 10 mesas, usando conceitos de **POO em Java**.

## Classes

### Mesa.java
- Representa uma mesa do restaurante.
- Atributos: número da mesa, número de pessoas, número de pedidos e valor total.
- Métodos:
  - `acomodarPessoas(int qtdPessoas)` → define quantas pessoas estão na mesa.
  - `adicionarPedido(double valorPedido)` → adiciona um pedido e atualiza o valor.
  - `fecharConta(...)` → imprime a conta detalhada e reseta os atributos (exceto o número da mesa).

### Restaurante.java
- Representa o restaurante como um todo.
- Atributos: nome, endereço, CNPJ, telefone e 10 mesas (`ArrayList<Mesa>`).
- Métodos:
  - `acomodarPessoas(int numeroMesa, int qtdPessoas)` → acomoda clientes em uma mesa específica.
  - `adicionarPedido(int numeroMesa, double valor)` → adiciona pedido à mesa correspondente.
  - `fecharConta(int numeroMesa)` → fecha a conta da mesa e exibe detalhes do restaurante.

## Como usar

1. Compile todas as classes:
```bash
javac Mesa.java Restaurante.java
