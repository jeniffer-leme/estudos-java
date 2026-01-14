# Exercício 19 – Hierarquia de Classes Livro

Este exercício implementa uma hierarquia de classes para representar livros em
diferentes contextos: biblioteca e livraria.

## 📌 Objetivo
Praticar:
- Herança
- Reaproveitamento de atributos comuns
- Especialização de classes
- Organização correta de classes ancestrais e derivadas

## 🧱 Estrutura das Classes

### Classe `Livro` (classe base)
Representa os dados comuns a qualquer livro:
- Nome
- Autor
- Número de páginas

Possui o método:
- `muitasPaginas()`: retorna `true` se o livro possuir mais de 300 páginas.

### Classe `LivroBiblioteca`
Herda da classe `Livro` e representa um livro disponível em uma biblioteca.

Atributo adicional:
- `disponivel`: indica se o livro está disponível para empréstimo.

### Classe `LivroLivraria`
Herda da classe `Livro` e representa um livro disponível para venda.

Atributos adicionais:
- `preco`: valor do livro
- `estoque`: quantidade disponível

Possui o método:
- `venderLivro(int quantidade)`: reduz o estoque caso haja livros suficientes.

## 🔍 Diferenças entre as classes
- `LivroBiblioteca` controla apenas a disponibilidade para empréstimo.
- `LivroLivraria` controla preço e estoque, além da venda de exemplares.

## 📚 Campos em comum
Os campos `nome`, `autor` e `paginas` são comuns a todas as classes e,
por i
