public class Lampada {
    private boolean acesa;

    public Lampada(boolean acesa) {
        setAcesa(acesa);
    }

    public boolean isAcesa() {
        return acesa;
    }

    public void setAcesa(boolean acesa) {
        this.acesa = acesa;
    }
    
    public void mostrarEstado(){
        if(acesa){
            System.out.println("A lâmpada está acesa");
        } else {
            System.out.println("A lâmapada está apagada");
        }
    }
    
}
