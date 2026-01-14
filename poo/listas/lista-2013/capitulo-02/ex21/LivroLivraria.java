public class LivroLivraria {
    private String nome;
    private String autor;
    private int paginas;
    private double preco;
    private int estoque;
    private int codigo;

    public LivroLivraria(String nome, String autor, int paginas, double preco, int estoque, int codigo) {
        setNome(nome);
        setAutor(autor);
        setPaginas(paginas);
        setPreco(preco);
        setEstoque(estoque);
        setCodigo(codigo);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
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

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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
