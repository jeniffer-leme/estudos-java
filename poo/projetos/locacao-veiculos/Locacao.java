public abstract class Locacao {
    protected int codigo;
    protected Veiculo veiculos;
    protected int dias;

    public Locacao(int codigo, Veiculo veiculos, int dias) {
        setCodigo(codigo);
        setVeiculo(veiculos);
        setDias(dias);
    }
    
    public int getCodigo() {
        return codigo;
    }

    private void setCodigo(int codigo) {
        if(codigo > 0) {
            this.codigo = codigo;
        } else {
            throw new IllegalArgumentException("o código precisa ser > 0.");
        }
    }
    
    private void setVeiculo(Veiculo veiculos) {
        if(veiculos != null) this.veiculos = veiculos;
        else {
            throw new IllegalArgumentException("Veículo não pode ser null.");
        }
    }

    public int getDias() {
        return dias;
    }

    private void setDias(int dias) {
        if(dias > 0 && dias <= 31) {
            this.dias = dias;
        } else {
            throw new IllegalArgumentException("Dia inválido!");
        }
    }
    
    public abstract double calcularCusto();
    
}
