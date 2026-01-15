public class Consulta extends Servico{

    public Consulta(int codigo, double preco, Pet animal) {
        super(codigo, preco, animal);
    }

    @Override
    public double calcularValorFinal() {
        double valor = 0.0;
        
        if(animal.getIdade() > 10) {
            valor = (getPreco() * 0.5) + getPreco();
        } else {
            valor = getPreco();
        }
        return valor;
    }

    @Override
    public String toString() {
        return "\n=====Consulta=====" +
                super.toString(); 
    }
}
