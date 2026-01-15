# Exercício 09 — Sistema de Rotas e Entregas

Este exercício modela um sistema simples de entregas utilizando **Programação Orientada a Objetos em Java**, com foco em **interfaces**, **classes abstratas**, **herança** e **polimorfismo**.

## 🎯 Objetivo
Representar diferentes tipos de rotas de entrega, permitindo o cálculo de custos, distâncias e o gerenciamento de entregas por um entregador.

---

## 🧱 Estrutura do Sistema

### Interface `Entregavel`
Define o comportamento básico de qualquer entidade capaz de realizar entregas.

#### Métodos:
- `iniciarEntrega()`
- `finalizarEntrega()`

---

### Classe `Ponto2D`
Representa um ponto no plano cartesiano.

#### Responsabilidades:
- Armazenar coordenadas `(x, y)`
- Calcular a distância entre dois pontos

---

### Classe Abstrata `Rota`
Modela uma rota genérica.

#### Atributos:
- `codigo`
- `origem` (Ponto2D)
- `destino` (Ponto2D)

#### Método abstrato:
- `getCalcularCusto()` — cada tipo de rota possui sua própria regra de cálculo

---

### Classe `RotaUrbana`
Especialização de `Rota`.

#### Regra de custo:
- O custo é calculado com base na distância multiplicada por um fator fixo.

```java
custo = distancia * 1.5;
```

---

### Classe `RotaRodoviaria`
Especialização de `Rota`.

#### Atributo adicional:
- `pedagio` 

#### Regra de custo:
- O custo considera a distância com acréscimo percentual e o valor do pedágio.

```java  
custo = distancia * 1.1 + pedagio;
```

---

### Classe `Entregador`
Responsável por gerenciar um conjunto de rotas.

#### Funcionalidades:
- Calcular o custo total das entregas  
- Identificar a maior distância percorrida  
- Iniciar e finalizar entregas  

---

## 🧠 Conceitos Trabalhados
- Interface  
- Classe abstrata  
- Herança  
- Polimorfismo  
- Agregação  
- Encapsulamento  
- Regras de negócio  
- Cálculos geométricos  

## 📌 Observação
Exercício desenvolvido para fins educacionais, com foco na prática de modelagem de classes e manipulação de objetos em Java.
