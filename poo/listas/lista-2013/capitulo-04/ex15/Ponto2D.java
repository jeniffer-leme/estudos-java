public class Ponto2D {
    private double x, y;

    public Ponto2D() {
        setX(0);
        setY(0);
    }

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
    
    public void inicializaPonto(double x, double y){
        setX(x);
        setY(y);
    }
    
    public boolean ehIgual(Ponto2D num){
        if(this.getX() == num.getX() && this.getY() == num.getY()){
            return true;
        } else {
            return false;
        }
    }
    
    public Ponto2D origem(){
        return new Ponto2D(0,0);
    }
    
    public Ponto2D clona(){
        return new Ponto2D(getX(), getY());
    }
    
    @Override
    public String toString(){
        return "(" + getX() + ", " + getY() + ")";
    }   
}
