public class MatrizDeDoubles {
    private int linhas;
    private int colunas;
    private double[][] matriz;

    public MatrizDeDoubles(int linhas, int colunas) {
        setLinhas(linhas);
        setColunas(colunas);
        matriz = new double[linhas][colunas];
        preencherMatriz(0);
    }

    public int getLinhas() {
        return linhas;
    }

    public void setLinhas(int linhas) {
        this.linhas = linhas;
    }

    public int getColunas() {
        return colunas;
    }

    public void setColunas(int colunas) {
        this.colunas = colunas;
    }

    public double[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(double[][] matriz) {
        this.matriz = matriz;
    }
    
    public double acessarMatriz(int linha, int coluna) {
        if(linha >= 0 && linha < getLinhas() && coluna >= 0 && getColunas() > coluna){
            return matriz[linha][coluna];
        }
        return Double.NaN;
    }
    
    public void modificarMatriz(int linha, int coluna, double valor) {
        if(linha >= 0 && linha < getLinhas() && coluna >= 0 && getColunas() > coluna){
            matriz[linha][coluna] = valor;
        }
    }
    
    public void preencherMatriz(double valor) {
        for(int l = 0; l < getLinhas(); l++) {
            for(int c = 0; c < getColunas(); c++) {
                matriz[l][c] = valor;
            }
        }
    }
    
    public double maiorValor() {
        double maiorAteAgora = matriz[0][0];
        
        for(int l = 0; l < getLinhas(); l++) {
            for(int c = 0; c < getColunas(); c++) {
                if(matriz[l][c] > maiorAteAgora) {
                    maiorAteAgora = matriz[l][c];
                }
            }
        }
        return maiorAteAgora;
    }
    
    public boolean ehIgual(MatrizDeDoubles outro) {
      if (this.linhas != outro.linhas || this.colunas != outro.colunas) {
          return false;
      }
  
      for (int l = 0; l < linhas; l++) {
          for (int c = 0; c < colunas; c++) {
              if (this.matriz[l][c] != outro.matriz[l][c]) {
                  return false;
              }
          }
      }
  
      return true;
  }
}
