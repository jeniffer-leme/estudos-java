public class Ponto2D {
    private double x;
    private double y;

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
    
    public void mostrarPonto() {
        System.out.println("X: " + getX());
        System.out.println("Y: " + getY());
    }
    
    public boolean estaAcimaDe(Ponto2D y) {
        if(getY() > y.getY()) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean estaAbaixoDe(Ponto2D y) {
        if(getY() < y.getY()) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean estaAEsquerdaDe(Ponto2D x) {
        if(getX() < x.getX()) {
            return true;
        } else {
            return false;
        }
    }
    
    public boolean estaADireitaDe(Ponto2D x) {
        if(getX() > x.getX()) {
            return true;
        } else {
            return false;
        }
    }
}
