public class LampadaFluorescente extends Lampada{
    private int centimetros;

    public LampadaFluorescente(boolean estadoLampada, int centimetros) {
        super(estadoLampada);
        setCentimetros(centimetros);
    }

    public int getCentimetros() {
        return centimetros;
    }

    public void setCentimetros(int centimetros) {
        this.centimetros = centimetros;
    }
    
    public void tamanhoLampada(){
        System.out.println("A lampada mede " + getCentimetros() + " cm.");
    }
}
