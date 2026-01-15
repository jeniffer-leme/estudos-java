public class Ponto2D {
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
    
    public String mostrarPonto() {
        return "X: " + getX() + 
                "\n Y: " + getY();
    }
    
    public boolean estaAcimaDe(Ponto2D p) {
        if(getY() > p.getY()) {
            return true;
        }
        else {
            return false;
        }
    }
    
    public boolean estaAbaixoDe(Ponto2D p) {
        if(getY() < p.getY()) {
            return true;
        }
        else {
            return false;
        }
    }
    public boolean estaAEsquerdaDe(Ponto2D p) {
        if(getX() < p.getX()) {
            return true;
        }
        else {
            return false;
        }
    }
    public boolean estaADireitaDe(Ponto2D p) {
        if(getX() > p.getX()) {
            return true;
        }
        else {
            return false;
        }
    }
}
