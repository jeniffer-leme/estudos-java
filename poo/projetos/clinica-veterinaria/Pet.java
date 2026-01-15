public class Pet {
    private String nome;
    private String especie;
    private int idade;

    public Pet(String nome, String especie, int idade) {
        setNome(nome);
        setEspecie(especie);
        setIdade(idade);
    }
    
    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        if(nome != null) {
            this.nome = nome;
        } else {
            throw new IllegalArgumentException("Nome não pode ser null.");
        }
    }

    public String getEspecie() {
        return especie;
    }

    private void setEspecie(String especie) {
        if(especie != null) {
            this.especie = especie;
        } else {
            throw new IllegalArgumentException("Especie não pode ser null.");
        }
    }

    public int getIdade() {
        return idade;
    }

    private void setIdade(int idade) {
        if(idade >= 0) {
            this.idade = idade;
        } else {
            throw new IllegalArgumentException("Idade não pode ser negativa.");
        }
    }

    @Override
    public String toString() {
        return "\n=====Animal=====" +
                "\nNome: " + getNome() +
                "\nEspécie: " + getEspecie() +
                "\nIdade: " + getIdade();
    }
}
