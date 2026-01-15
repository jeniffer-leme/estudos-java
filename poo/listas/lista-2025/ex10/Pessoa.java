public class Pessoa {
    private String nome;
    private int idade;
    private double peso;
    private double altura;

    public Pessoa(String nome, int idade, double peso, double altura) {
        setNome(nome);
        setIdade(idade);
        setPeso(peso);
        setAltura(altura);
    }
    
    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        if(nome != null) {
            this.nome = nome;
        } else {
            throw new IllegalArgumentException("O nome não pode ser nulo.");
        }
    }

    public int getIdade() {
        return idade;
    }

    private void setIdade(int idade) {
        if(idade >= 0) {
            this.idade = idade;
        } else {
            throw new IllegalArgumentException("A idade não pode ser negativa.");
        }
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if(peso >= 0.0) {
            this.peso = peso;
        } else {
            throw new IllegalArgumentException("O peso não pode ser negativa.");
        }
    }
    
    public double getAltura() {
        return altura;
    }

    private void setAltura(double altura) {
        if(altura > 0.0) {
            this.altura = altura;
        } else {
            throw new IllegalArgumentException("A altura precisa ser > 0.");
        }
    }

    public double calcularImc() {
        double imc = 0.0;
        
        imc = getPeso() / Math.pow(getAltura(), 2);
        return imc;
    }
    
    public String eMaisVelho(Pessoa p) {
        String texto = "\n======================";
        
        if(getIdade() > p.getIdade()) {
            texto += getNome() + " é mais velho que " + p.getNome();
        } else if(getIdade() == p.getIdade()) {
            texto += getNome() + " tem a mesma idade que " + p.getNome();
        } else {
            texto += getNome() + " é mais novo que " + p.getNome();
        }
        return texto;
    }
    
    public String getStatusImc() {
        String texto = "=====STATUS IMC=====";
        
        if(calcularImc() < 18.5) {
            texto += getNome() + " está abaixo do peso.";
        } else if(calcularImc() < 25.0) {
            texto += getNome() + " está no peso ideal.";
        } else if(calcularImc() < 30.0) {
            texto += getNome() + " está sobrepeso.";
        } else {
            texto += getNome() + " está obeso.";
        }
        return texto;
    }
    
    public String imprimirPessoa() {
        return "\n======DADOS DA PESSOA=====" +
                "\nNome: " + getNome() +
                "\nIdade: " + getIdade() + 
                "\nPeso: " + getPeso() + 
                "\nAltura: " + getAltura() + 
                "\nIMC: " + calcularImc();
    }
}
