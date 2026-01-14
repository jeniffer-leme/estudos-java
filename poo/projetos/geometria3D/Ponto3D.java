public class Ponto3D {
    private double x, y, z;

    public Ponto3D(double x, double y, double z) {
        setX(x);
        setY(y);
        setZ(z);
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

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }
    
    public double getDistancia(Ponto3D outro) {
        double dx = Math.pow(outro.getX() - this.getX(), 2);
        double dy = Math.pow(outro.getY() - this.getY(), 2);
        double dz = Math.pow(outro.getZ() - this.getZ(), 2);
        
        return Math.sqrt(dx + dy + dz);
    }
    
    public Ponto3D getPontoMedio(Ponto3D outro){
        double dx = (outro.getX() + getX()) / 2;
        double dy = (outro.getY() + getY()) / 2;
        double dz = (outro.getZ() + getZ()) / 2;
        
        return new Ponto3D(dx, dy, dz);
    } 

    @Override
    public String toString() {
        return "Ponto3D{" + "x=" + x + ", y=" + y + '}';
    }
}
