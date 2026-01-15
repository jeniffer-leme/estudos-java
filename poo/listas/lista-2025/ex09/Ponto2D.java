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
    
    public double calcularDistancia(Ponto2D outro) {
        double d = Math.pow(outro.getX() - getX(), 2) + Math.pow(outro.getY() - getY(), 2);
        return Math.sqrt(d);
    }
}
