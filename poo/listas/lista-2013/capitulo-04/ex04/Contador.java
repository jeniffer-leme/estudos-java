public class Contador {
    private int contador;

    public Contador() {
        setContador(0);
    }
    
    public Contador(int contador) {
        setContador(contador);
    }

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }
  
    public void zerarValor(){
        setContador(0);
    }
    
    public void incrementarValor(){
        setContador(getContador() + 1);
    }
    
    public void imprimirValor(){
        System.out.println("Valor: " + getContador());
    }
}
