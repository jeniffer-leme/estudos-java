public class Gerente extends Funcionario{
    private double bonus;
    
    public Gerente(String nome, String matricula, double salario, double bonus) {
        super(nome, matricula, salario);
        setBonus(bonus);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        if (bonus >= 0) {
            this.bonus = bonus;
        } else {
            throw new IllegalArgumentException("O bônus não pode ser negativo.");
        }
    }

    @Override
    public double salarioFinal() {
        return getSalario() + getBonus();
    }
}
