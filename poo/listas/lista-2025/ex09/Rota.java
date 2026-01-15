public abstract class Rota {
    protected int codigo;
    protected Ponto2D origem;
    protected Ponto2D destino;

    public Rota(int codigo, Ponto2D origem, Ponto2D destino) {
        setCodigo(codigo);
        setOrigem(origem);
        setDestino(destino);
    }
    
    public int getCodigo() {
        return codigo;
    }

    private void setCodigo(int codigo) {
        if(codigo > 0) {
            this.codigo = codigo;
        } else {
            throw new IllegalArgumentException("O codigo precisa ser > 0.");
        }
    }

    public Ponto2D getOrigem() {
        return origem;
    }

    public void setOrigem(Ponto2D origem) {
        this.origem = origem;
    }

    public Ponto2D getDestino() {
        return destino;
    }

    public void setDestino(Ponto2D destino) {
        this.destino = destino;
    }
    
    public abstract double getCalcularCusto();

    @Override
    public String toString() {
        return "Código: " + getCodigo() +
                "\nPonto de Origem: " + origem.getX() + ", " + origem.getY() + 
                "\nPonto de Destino: " + destino.getX() + ", " + destino.getY();
    }
}
