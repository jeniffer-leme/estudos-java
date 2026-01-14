public class Revista extends MaterialBibliografico {

    public Revista(String localizacao, String titulo, String autores, int edicao, int ano) {
        super(localizacao, titulo, autores, edicao, ano);
        setQuantidade(3);
    }

    @Override
    public String getNomeObjeto() {
        return  "Revista\n" + 
        super.getNomeObjeto();
    }

    @Override
    public boolean devolver() {
        if(getQuantidade() < 3) {
            setQuantidade(getQuantidade() + 1);
            return true;
        }
        return false;
    }
}
