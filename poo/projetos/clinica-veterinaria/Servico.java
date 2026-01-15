public abstract class Servico {
    private int codigo;
    private double preco;
    protected Pet animal;

    public Servico(int codigo, double preco, Pet animal) {
        setCodigo(codigo);
        setPreco(preco);
        setAnimal(animal);
    }
    
    public int getCodigo() {
        return codigo;
    }

    private void setCodigo(int codigo) {
        if(codigo >= 0) {
            this.codigo = codigo;
        } else {
            throw new IllegalArgumentException("Codigo não pode ser negativo.");
        }
    }

    public double getPreco() {
        return preco;
    }

    private void setPreco(double preco) {
        if(preco >= 0) {
            this.preco = preco;
        } else {
            throw new IllegalArgumentException("Preço não pode ser negativo.");
        }
    }

    public Pet getAnimal() {
        return animal;
    }

    private void setAnimal(Pet animal) {
        if(animal != null) {
            this.animal = animal;
        } else {
            throw new IllegalArgumentException("Animal não pode ser null.");
        }
    }
    
    public abstract double calcularValorFinal();

    @Override
    public String toString() {
        return "\n=====Serviço=====" +
                "\nCódigo: " + getCodigo() + 
                "\nPreço: " + getPreco() + 
                "\nPreço Final: " + calcularValorFinal() +
                animal.toString();
    }
}
