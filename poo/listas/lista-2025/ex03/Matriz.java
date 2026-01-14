public class Matriz {
    private double matriz[][];
    private int tamanho;

    public Matriz(int tamanho, double valor) {
        setTamanho(tamanho);
        
        matriz = new double[tamanho][tamanho];
        
        if( valor != 0.0 ) {
            inicializarMatriz(valor);
        }
    }

    public Matriz(int tamanho) {
        this(tamanho, 0.0);
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        if( tamanho == 2 || tamanho == 3 ) {
            this.tamanho = tamanho;
        } else {
            throw new IllegalArgumentException("tamanho deve ser 2 ou 3");
        }
    }
    
    private void inicializarMatriz(double valor) {
        for(int linha = 0; linha < getTamanho(); linha++) {
            for(int coluna = 0; coluna < getTamanho(); coluna++) {
                matriz[linha][coluna] = valor;
            }
        }
    }
    
    public double getValor(int linha, int coluna) {
        return matriz[linha][coluna];
    }
    
    public void setValor(int linha, int coluna, double valor) {
        matriz[linha][coluna] = valor;
    }
    
    public void somaElementoMatriz(double valor) {
        for(int i = 0; i < getTamanho(); i++) {
            for(int j = 0; j  < getTamanho(); j++) {
                matriz[i][j] += valor;
            }
        }
    }
    
    public void subtrairElementoMatriz(double valor) {
        for(int i = 0; i < getTamanho(); i++) {
            for(int j = 0; j < getTamanho(); j++) {
                matriz[i][j] -= valor;
            }
        }
    }
    
    public void dividirElementoMatriz(double valor) {
        if(valor == 0) {
            throw new IllegalArgumentException("Não é possível uma divisão por zero.");
        } else {
            for(int i = 0; i < getTamanho(); i++) {
                for(int j = 0; j < getTamanho(); j++) {
                    matriz[i][j] /= valor;
                }
            }
        }
    }
    
    public void multiplicarElementoMatriz(double valor) {
        for(int i = 0; i < getTamanho(); i++) {
            for(int j = 0; j < getTamanho(); j++) {
                matriz[i][j] *= valor;
            }
        }
    }
    
    public double maiorNumero() {
        double temp = matriz[0][0];
        for(int i = 0; i < getTamanho(); i++) {
            for(int j = 0; j < getTamanho(); j++) {
                if(matriz[i][j] > temp) {
                    temp = matriz[i][j];
                }
            }
        }
        return temp;
    }
    
    public double menorNumero() {
        double temp = matriz[0][0];
        for(int i = 0; i < getTamanho(); i++) {
            for(int j = 0; j < getTamanho(); j++) {
                if(matriz[i][j] < temp){
                    temp = matriz[i][j];
                }
            }
        }
        return temp;
    }
    
    public double determinanteDaMatriz() {
        double det;
        
        if(getTamanho() == 2) {
            det = (matriz[0][0] * matriz[1][1]) - (matriz[0][1] * matriz[1][0]);
            
        } else if(getTamanho() == 3) {
            det = matriz[0][0] * matriz[1][1] * matriz[2][2]
                + matriz[0][1] * matriz[1][2] * matriz[2][0]
                + matriz[0][2] * matriz[1][0] * matriz[2][1]
                - matriz[0][2] * matriz[1][1] * matriz[2][0]
                - matriz[0][0] * matriz[1][2] * matriz[2][1]
                - matriz[0][1] * matriz[1][0] * matriz[2][2];
        } else {
            throw new IllegalArgumentException("Tamanho da matriz é inválida!");
        }
        return det;
    }

    @Override
    public String toString() {
        String texto = "";
        
        for(int i = 0; i < getTamanho(); i++) {
            texto += "[";
            for(int j = 0; j < getTamanho(); j++) {
                texto += "[" + matriz[i][j] + "] \t";
            }
            texto += "\n";
        }
        return texto;
    }
}
