public class Lugar {
    private int numero;
    private int fila;
    private boolean ocupado;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        if(numero > 0) {
            this.numero = numero;
        } else {
            throw new IllegalArgumentException("O número precisa ser > 0.");
        }
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        if(fila > 0) {
            this.fila = fila;
        } else {
            throw new IllegalArgumentException("A fila precisa ser > 0.");
        }
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
}
