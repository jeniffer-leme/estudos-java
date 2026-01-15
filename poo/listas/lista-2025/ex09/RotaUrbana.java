public class RotaUrbana extends Rota {

    public RotaUrbana(int codigo, Ponto2D origem, Ponto2D destino) {
        super(codigo, origem, destino);
    }

    @Override
    public double getCalcularCusto() {
        return origem.calcularDistancia(destino) * 1.5;
    }
}
