# Exercício 07 – Classe DataHora (Composição)

Este exercício implementa a classe `DataHora`, composta pelas classes `Data` e `Hora`,
conforme apresentado na Listagem 8.1 do livro.

## 📌 Objetivo
Praticar:
- Composição entre classes
- Encapsulamento
- Delegação de responsabilidades
- Implementação de métodos de comparação (`ehIgual`)

## 🧱 Estrutura das Classes

### Classe `Data`
Representa uma data com dia, mês e ano.
Possui validação dos valores e um método `ehIgual(Data data)` para comparar duas datas.

### Classe `Hora`
Representa um horário com hora, minuto e segundo.
Possui um método `ehIgual(Hora hora)` para comparação de horários.

### Classe `DataHora`
Representa uma data e hora completas, utilizando composição.
O método `ehIgual(DataHora dataHora)` delega a comparação para os métodos
`ehIgual` das classes `Data` e `Hora`.

## 📝 Observação
A comparação entre objetos é feita com base nos valores encapsulados, e não
na referência de memória.
