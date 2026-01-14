public class LivroLivraria extends Livro {
    private double preco;
    private int estoque;

    public LivroLivraria(String nome, String autor, int paginas, double preco, int estoque) {
        super(nome, autor, paginas);
        setEstoque(estoque);
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public boolean venderLivro(int quantidade){
        if(estoque >= quantidade){
            setEstoque(getEstoque() - quantidade);
            return true;
        } else {
            return false;
        }
    }
    
}
