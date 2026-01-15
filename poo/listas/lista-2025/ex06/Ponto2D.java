=public class Ponto2D {
    private double x, y;

    public Ponto2D(double x, double y) {
        setX(x);
        setY(y);
    }
    
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    
    public String mostrar() {
        return "X: " + getX() + "\nY: " + getY();
    }
    
    public boolean estaAcimaDe(Ponto2D p) {
        return(getY() > p.getY());
    }
    
    public boolean estaAbaixoDe(Ponto2D p) {
        return(getY() < p.getY());
    }
    
    public boolean estaADireitaDe(Ponto2D p) {
        return(getX() > p.getX());
    }
    
    public boolean estaAEsquerdaDe(Ponto2D p) {
        return(getX() < p.getX());
    }
    
    public double distancia(Ponto2D p) {
        double distancia = Math.pow(p.getX() - getX(), 2) + Math.pow(p.getY() - getY(), 2);
        
        return Math.sqrt(distancia);
    }
}
