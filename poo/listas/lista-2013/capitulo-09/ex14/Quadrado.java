public class Quadrado implements ObjetoGeometrico {
    private Ponto2D canto1;
    private Ponto2D canto2;

    public Quadrado(Ponto2D canto1, Ponto2D canto2) {
        setCanto1(canto1);
        setCanto2(canto2);
    }
    
    public Ponto2D getCanto1() {
        return canto1;
    }

    public void setCanto1(Ponto2D canto1) {
        this.canto1 = canto1;
    }

    public Ponto2D getCanto2() {
        return canto2;
    }

    public void setCanto2(Ponto2D canto2) {
        this.canto2 = canto2;
    }
    
    @Override
    public Ponto2D centro() {
        double centroX = (canto1.getX() + canto2.getX()) / 2.0;
        double centroY = (canto1.getY() + canto2.getY()) / 2.0;
        
        return new Ponto2D(centroX, centroY);
    }

    @Override
    public double calcularArea() {
        double lado = Math.abs(canto1.getX() - canto2.getX());
        return lado * lado;
    }

    @Override
    public double calcularPerimetro() {
        double lado = Math.abs(canto1.getX() - canto2.getX());
        return 4 * lado;
    }  
}
