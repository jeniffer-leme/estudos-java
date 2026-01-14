public class Linha {
    private Ponto2D x, y;

    public Linha() {
        setX(new Ponto2D(0, 0));
        setY(new Ponto2D(0, 0));
    }
    
    public Linha(Ponto2D fim) {
        setX(new Ponto2D(0, 0));
        setY(fim);
    }
    
    public Linha(Ponto2D x, Ponto2D y){
        setX(x);
        setY(y);
    }
    
    public Linha(double x, double y, double z, double a){
        setX(new Ponto2D(x, y));
        setY(new Ponto2D(z, a));
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

    public void uniao(Ponto2D inicio, Ponto2D fim){
        setX(inicio);
        setY(fim);
    }
}
