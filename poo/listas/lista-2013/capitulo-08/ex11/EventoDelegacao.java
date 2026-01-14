public class EventoDelegacao extends DataHora {
    private String evento;

    public EventoDelegacao(String evento, int dia, int mes, int ano, int hora, int min, int segundo) {
        super(dia, mes, ano, hora, min, segundo);
        setEvento(evento);
    }

    public String getEvento() {
        return evento;
    }

    public void setEvento(String evento) {
        this.evento = evento;
    }

    @Override
    public String toString() {
        return "O evento " + getEvento() + " ocorrera as " + super.toString();
    }
}
