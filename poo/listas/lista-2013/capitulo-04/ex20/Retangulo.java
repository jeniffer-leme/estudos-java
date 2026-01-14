public class Retangulo {
    private Ponto2D x;
    private Ponto2D y;

    public Retangulo() {
        setX(new Ponto2D(0, 0));
        setY(new Ponto2D(0, 0));
    }
    
    public Retangulo(Ponto2D y) {
        setX(new Ponto2D(0, 0));
        setY(y);
    }
    
    public Retangulo(Ponto2D x, Ponto2D y){
        setX(x);
        setY(y);
    }
    
    public Retangulo(double w, double x, double y, double z){
        setX(new Ponto2D(w, x));
        setY(new Ponto2D(y, z));
    }
    
    public Ponto2D getX() {
        return x;
    }

    public void setX(Ponto2D x) {
        this.x = x;
    }

    public Ponto2D getY() {
        return y;
    }

    public void setY(Ponto2D y) {
        this.y = y;
    }
}
