## Exercício 28 – Lâmpada com Contador de Acendimentos

Modificação da classe **Lampada** para incluir o controle da quantidade de vezes
em que a lâmpada foi acesa, conforme proposto no exercício.

### Descrição
A classe representa uma lâmpada que pode ser ligada ou desligada, possui consumo
em watts e mantém um contador de quantas vezes foi acesa.

### Dados do modelo
- Estado da lâmpada (ligada ou desligada)
- Consumo em watts
- Contador de vezes que a lâmpada foi acesa

### Operações
- Acender a lâmpada
- Apagar a lâmpada
- Consultar o estado
- Verificar se a lâmpada é econômica
- Consultar o número de vezes que foi acesa

### Observação
O contador deve ser incrementado **no método que acende a lâmpada**, pois é nesse
momento que o evento ocorre. O exercício sugere o uso da classe `Contador`
(exercício 2.23) para esse controle.
