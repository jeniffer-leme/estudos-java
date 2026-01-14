public abstract class MaterialBibliografico implements Emprestavel {
    private String localizacao;
    private String titulo;
    private String autores;
    private int edicao;
    private int ano;
    int quantidade;

    public MaterialBibliografico(String localizacao, String titulo, String autores, int edicao, int ano) {
        setLocalizacao(localizacao);
        setTitulo(titulo);
        setAutores(autores);
        setEdicao(edicao);
        setAno(ano);
    }

    public String getLocalizacao() {
        return localizacao;
    }

    private void setLocalizacao(String localizacao) {
        if(localizacao != null) {
            this.localizacao = localizacao;
        } else {
            throw new IllegalArgumentException("A localização não pode ser null");
        }
    }

    public String getTitulo() {
        return titulo;
    }

    private void setTitulo(String titulo) {
        if(titulo != null) {
            this.titulo = titulo;
        } else {
            throw new IllegalArgumentException("O título não pode ser null");
        }
    }

    public String getAutores() {
        return autores;
    }

    private void setAutores(String autores) {
        if(autores != null) {
            this.autores = autores;
        } else {
            throw new IllegalArgumentException("Os autores não podem ser null");
        }
    }

    public int getEdicao() {
        return edicao;
    }

    private void setEdicao(int edicao) {
        if(edicao > 0) {
            this.edicao = edicao;
        } else {
            throw new IllegalArgumentException("O edicao precisa ser > 0");
        }
    }

    public int getAno() {
        return ano;
    }

    private void setAno(int ano) {
        if(ano > 0) {
            this.ano = ano;
        } else {
            throw new IllegalArgumentException("O ano precisa ser > 0");
        }
    }

    public int getQuantidade() {
        return quantidade;
    }

    protected void setQuantidade(int quantidade) {
        if(quantidade > 0) {
            this.quantidade = quantidade;
        } else {
            throw new IllegalArgumentException("O quantidade precisa ser > 0");
        }
    }
    
    @Override
    public String getNomeObjeto() {
        return "Localização: " + getLocalizacao() +
        "\nTítulo: " + getTitulo() +
        "\nAutores: " + getAutores() + 
        "\nEdição: " + getEdicao() +
        "\nAno: " + getAno() +
        "\nQuantidade disponível: " + getQuantidade();
    }
    
    @Override
    public boolean podeEmprestar() {
        if(getQuantidade() > 1) {
            return true;
        }
        return false;
    }
    
    @Override
    public boolean emprestar() {
        if(podeEmprestar()) {
            setQuantidade(getQuantidade()- 1);
            return true;
        }
        return false;
    }
}
