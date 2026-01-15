package exercicios.simuladoProva.chat.ex12;

public class RotaRodoviaria extends Rota {
    private double pedagio;

    public RotaRodoviaria(int codigo, Ponto2D origem, Ponto2D destino, double pedagio) {
        super(codigo, origem, destino);
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
    public double getCalcularCusto() {
        return origem.calcularDistancia(destino) * 1.1 + getPedagio();
    }
}
