# Exercício 08 — Hierarquia de Funcionários

Este exercício implementa uma hierarquia de funcionários utilizando **Programação Orientada a Objetos em Java**, com foco em **herança**, **polimorfismo** e **classes abstratas**.

## 🎯 Objetivo
Modelar diferentes tipos de funcionários que possuem formas distintas de cálculo do salário final, respeitando regras específicas para cada cargo.

## 🧱 Estrutura das Classes

### Classe Abstrata `Funcionario`
Representa um funcionário genérico.

#### Atributos:
- `nome` (String)
- `matricula` (String)
- `salario` (double)

Todos os atributos são encapsulados e validados.

#### Métodos:
- `salarioFinal()` — método abstrato que deve ser implementado pelas subclasses
- `mostrar()` — retorna uma representação textual do funcionário, incluindo o salário final

---

### Classe `Gerente`
Especialização da classe `Funcionario`.

#### Atributo adicional:
- `bonus` (double)

#### Regra de negócio:
- O salário final é calculado somando o bônus ao salário base.

```java```
salarioFinal = salario + bonus;

---

### Classe `Estagiario`
Especialização da classe `Funcionario`.

#### Atributo adicional:
- `desconto` (double)

#### Regra de negócio:
- O salário final é calculado subtraindo o desconto do salário base.

```java
salarioFinal = salario - desconto;

