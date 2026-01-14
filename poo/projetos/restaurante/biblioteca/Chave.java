public class Chave implements Emprestavel {
    private String armario;
    private int qtdChave;

    public Chave(String armario) {
        setArmario(armario);
        setQtdChave(1);
    }
    
    public String getArmario() {
        return armario;
    }

    private void setArmario(String armario) {
        if(armario.matches("[Aa]\\d+")) {
            this.armario = armario;
        } else {
            throw new IllegalArgumentException("O armário não começa com a letra 'A' e/ou não é seguido por números.");
        }
    }

    public int getQtdChave() {
        return qtdChave;
    }

    public void setQtdChave(int qtdChave) {
        this.qtdChave = qtdChave;
    }
    
    @Override
    public String getNomeObjeto() {
        return "Chave\n" + 
                "Armário: " + getArmario() +
                "\nQuantidade de chaves: " + getQtdChave();
    }

    @Override
    public boolean podeEmprestar() {
        if(getQtdChave() == 1) {
            return true;
        } 
            return false;
    }
    
    @Override
    public boolean emprestar() {
        if(podeEmprestar()) {
            setQtdChave(0);
            return true;
        } 
            return false;
    }

    @Override
    public boolean devolver() {
        if(getQtdChave() == 0) {
            setQtdChave(1);
            return true;
        } 
            return false;
    }
}
