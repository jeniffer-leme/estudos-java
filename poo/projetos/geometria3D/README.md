# Geometria 3D

Este projeto implementa uma **abstração de objetos tridimensionais** utilizando **Java**. Ele demonstra conceitos de **POO**, como **herança**, **abstração**, **interfaces** e **polimorfismo**.

## Classes do projeto

- `Ponto3D` – Representa um ponto no espaço tridimensional `(x, y, z)`.  
  - Métodos: `getDistancia(Ponto3D)`, `getPontoMedio(Ponto3D)`, `toString()`.
  
- `ObjetoTridimensional` – Classe abstrata que serve de base para objetos 3D.  
  - Contém dois pontos opostos que definem o objeto.

- `GeometriaTridimensional` – Interface que define os métodos essenciais de todo objeto tridimensional:  
  - `getCentro()`, `getSuperficie()`, `getVolume()`.  

- `Esfera` – Implementa a interface e herda da classe abstrata.  
  - Calcula **centro**, **área da superfície** e **volume** a partir dos pontos opostos.


