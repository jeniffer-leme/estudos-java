# Projeto Biblioteca

Este projeto implementa um mini-sistema de biblioteca em Java utilizando **interfaces, herança e polimorfismo**.

## Classes e Interface

### Emprestavel.java
- Interface que define métodos para objetos que podem ser emprestados:
  - `String getNomeObjeto()`
  - `boolean emprestar()`
  - `boolean podeEmprestar()`
  - `boolean devolver()`

### MaterialBibliografico.java
- Classe abstrata que implementa `Emprestavel`.
- Atributos: `localizacao`, `titulo`, `autores`, `edicao`, `ano`, `quantidade`.
- Métodos: getters, setters, empréstimo, devolução e verificação de disponibilidade.

### LivroFisico.java
- Herda de `MaterialBibliografico`.
- Inicializa com 5 exemplares disponíveis (pode emprestar 4).

### Revista.java
- Herda de `MaterialBibliografico`.
- Inicializa com 3 exemplares disponíveis (pode emprestar 2).

### Chave.java
- Implementa `Emprestavel`.
- Representa chaves de armários (`A + número`).
- Só permite emprestar se houver 1 chave disponível.

## Como usar

1. Compile todas as classes:
```bash
javac *.java
