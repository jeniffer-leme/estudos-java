public class LocacaoUrbana extends Locacao {

    public LocacaoUrbana(int codigo, Veiculo veiculos, int dias) {
        super(codigo, veiculos, dias);
    }

    @Override
    public double calcularCusto() {
        return veiculos.getValor() * getDias();
    }
}
