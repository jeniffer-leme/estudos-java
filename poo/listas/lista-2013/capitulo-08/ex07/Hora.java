public class Hora {
    private int hora, minuto, segundo;

    public Hora(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }
    
    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }
    
    public boolean ehIgual(Hora hora) {
        if(this.getHora() == hora.getHora() && this.getMinuto() == hora.getMinuto() && this.getSegundo() == hora.getSegundo()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return getHora() + ":" + getMinuto() + ":" + getSegundo();
    }
}
