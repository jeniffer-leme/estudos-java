public class Contador {
    private int contagem;

    public Contador(int contagem) {
        setContagem(0);
    }

    public int getContagem() {
        return contagem;
    }

    public void setContagem(int contagem) {
        this.contagem = contagem;
    }
    
    public void zerarConatador(){
        setContagem(0);
    }
    
    public void incrementarContador(int novo){
        setContagem(getContagem() + novo);
    }
    
    public void imprimirValor(){
        if(getContagem() > 0){
            getContagem();
        } else {
            throw new IllegalArgumentException("Não é possível imprimir valor negativo");
        }
    
    }
}
