# Exercício 11 – Evento com Delegação

Este exercício implementa a classe `EventoDelegacao`, baseada na classe `DataHora`,
adicionando a descrição de um evento associado a uma data e hora específicas.

## 📌 Objetivo
Praticar:
- Herança entre classes
- Reutilização de código
- Composição (DataHora utiliza Data e Hora)
- Sobrescrita do método `toString()`

## 🧱 Estrutura das Classes

### Classe `DataHora` (ex07)
Representa uma data e hora completas, utilizando:
- Um objeto `Data`
- Um objeto `Hora`

Possui métodos para:
- Comparação entre datas
- Exibição formatada da data e hora

### Classe `EventoDelegacao` (ex11)
Herda de `DataHora` e adiciona:
- Um campo `String evento`
- Construtor que inicializa o evento e a data/hora
- Sobrescrita do método `toString()` para exibir o evento junto da data e hora

## 📝 Observação
A classe `EventoDelegacao` reutiliza totalmente a lógica de data e hora da classe `DataHora`,
seguindo o princípio de reaproveitamento de código.
