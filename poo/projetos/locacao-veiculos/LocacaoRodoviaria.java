public class LocacaoRodoviaria extends Locacao {
    private double pedagio;

    public LocacaoRodoviaria(int codigo, Veiculo veiculos, int dias, double pedagio) {
        super(codigo, veiculos, dias);
        setPedagio(pedagio);
    }

    public double getPedagio() {
        return pedagio;
    }

    public void setPedagio(double pedagio) {
        if(pedagio >= 0) {
            this.pedagio = pedagio;
        } else {
            throw new IllegalArgumentException("O pedagio não pode ser negativo.");
        }
    }
    
    @Override
    public double calcularCusto() {
        return veiculos.getValor() * getDias() + getPedagio();
    }
}
