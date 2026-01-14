public class ArrayDeFloats {
    private float[] array;

    public ArrayDeFloats(int numeros) {
        array = new float[numeros];
    }

    public ArrayDeFloats(int numeros, int numConstante) {
        array = new float[numeros];
        
        for(int c = 0; c < array.length; c++) {
            array[c] = numConstante;
        }
    }
    
    public float[] getArray() {
        return array;
    }

    public void setArray(float[] array) {
        this.array = array;
    }
    
    public int tamanho() {
         return array.length;
    }
    
    public void modifica(int posicao, float valor) {
        if((posicao >= 0) && (posicao < array.length)) {
            array[posicao] = valor;
        }
    }
    
    public float valor(int posicao) {
        if((posicao >= 0) && (posicao < array.length)) {
            return array[posicao];
        } else {
            return Float.NaN;
        }
    }
    
    public float[] paraArray() {
        return array;
    }
    
    public float menorValor() {
        float menorAteAgora = array[0];
        for(int c = 1; c < array.length; c++) {
            if(array[c] < menorAteAgora) {
                menorAteAgora = array[c];
            }
        }
        return menorAteAgora;
    }
}
