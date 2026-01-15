public class Banho extends Servico{

    public Banho(int codigo, double preco, Pet animal) {
        super(codigo, preco, animal);
    }

    @Override
    public double calcularValorFinal() {
        return (getPreco() * 0.2) + getPreco();
    }

    @Override
    public String toString() {
        return "\n=====Banho=====" +
                super.toString(); 
    }
}
