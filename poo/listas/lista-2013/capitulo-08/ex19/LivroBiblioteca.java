public class LivroBiblioteca extends Livro {
    private boolean disponivel;

    public LivroBiblioteca(String nome, String autor, int paginas, boolean disponivel) {
        super(nome, autor, paginas);
        setDisponivel(disponivel);
    }
    
    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
