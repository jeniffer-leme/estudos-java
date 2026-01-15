public class Estagiario extends Funcionario{
    private double desconto;
    
    public Estagiario(String nome, String matricula, double salario, double desconto) {
        super(nome, matricula, salario);
        setDesconto(desconto);
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        if(desconto >= 0) {
            this.desconto = desconto;
        } else {
            throw new IllegalArgumentException("O desconto não pode ser negativo.");
        }
    }

    @Override 
    public double salarioFinal() {
        return getSalario() - getDesconto();
    }
}
