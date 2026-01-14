public class LivroFisico extends MaterialBibliografico {
    public LivroFisico(String localizacao, String titulo, String autores, int edicao, int ano) {
        super(localizacao, titulo, autores, edicao, ano);
        setQuantidade(5);
    }
    
    @Override
    public String getNomeObjeto() {
        return "Livro\n" +
        super.getNomeObjeto();
    }

    @Override
    public boolean devolver() {
        if(getQuantidade() < 5) {
            setQuantidade(getQuantidade() + 1);
            return true;
        }
        return false;
    }
}
