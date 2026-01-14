# Exercício 19 – Classe Linha

Este exercício implementa a classe `Linha`, que representa um segmento de reta definido
por dois pontos no plano cartesiano, utilizando a classe `Ponto2D`.

## 📌 Objetivo
Praticar:
- Sobrecarga de construtores
- Composição entre classes
- Inicialização de objetos de diferentes formas

## 🧱 Estrutura da Classe Linha
A classe `Linha` possui dois atributos privados:
- `x` → ponto inicial da linha
- `y` → ponto final da linha

Ambos são instâncias da classe `Ponto2D`.

## ⚙️ Construtores Implementados

- `Linha()`  
  Cria uma linha que começa e termina na origem `(0, 0)`.

- `Linha(Ponto2D fim)`  
  Cria uma linha que começa na origem `(0, 0)` e termina no ponto informado.

- `Linha(Ponto2D x, Ponto2D y)`  
  Cria uma linha com ponto inicial e final definidos pelos objetos `Ponto2D`.

- `Linha(double x1, double y1, double x2, double y2)`  
  Cria uma linha a partir de quatro valores de ponto flutuante, correspondentes
  às coordenadas dos pontos inicial e final.

## 🔁 Método Adicional
- `uniao(Ponto2D inicio, Ponto2D fim)`  
  Permite redefinir os pontos inicial e final da linha após sua criação.

## 📝 Observação
A classe `Linha` utiliza **composição**, pois depende da classe `Ponto2D` para representar
suas extremidades.
