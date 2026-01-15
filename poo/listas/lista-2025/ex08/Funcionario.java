public abstract class Funcionario {
    private String nome;
    private String matricula;
    private double salario;

    public Funcionario(String nome, String matricula, double salario) {
        setNome(nome);
        setMatricula(matricula);
        setSalario(salario);
    }
    
    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        if(nome != null) {
            this.nome = nome;
        } else {
            throw new IllegalArgumentException("O nome não pode ser null.");
        }
    }

    public String getMatricula() {
        return matricula;
    }

    private void setMatricula(String matricula) {
        if(matricula != null) {
            this.matricula = matricula;
        } else {
            throw new IllegalArgumentException("A matricula não pode ser null.");
        }
    }

    public double getSalario() {
        return salario;
    }

    protected void setSalario(double salario) {
        if(salario >= 0) {
            this.salario = salario;
        } else {
            throw new IllegalArgumentException("O salário não pode ser negativo");
        }
    }
    
    public abstract double salarioFinal();

    public String mostrar() {
        return "Nome: " + getNome() +
               "\nMatrícula: " + getMatricula() +
               "\nSalário base: " + getSalario() +
               "\nSalário final: " + salarioFinal();
    }
}
