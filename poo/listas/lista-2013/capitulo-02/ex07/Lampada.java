public class Lampada {
    private boolean estadoLampada;

    public Lampada(boolean estadoLampada) {
        setEstadoLampada(estadoLampada);
    }

    public boolean getEstadoLampada() {
        return estadoLampada;
    }

    public void setEstadoLampada(boolean estadoLampada) {
        this.estadoLampada = estadoLampada;
    }
    
    
    public void acende(){
        setEstadoLampada(true);
    }
    
    public void apaga(){
        setEstadoLampada(false);
    }
    
    public boolean mostrarEstado(){
        if(getEstadoLampada()){
            return true;
        } else {
            return false;
        }
    }
}
