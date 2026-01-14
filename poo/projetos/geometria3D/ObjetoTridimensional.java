public abstract class ObjetoTridimensional {
    protected Ponto3D canto1; 
    protected Ponto3D canto2;

    public ObjetoTridimensional(Ponto3D canto1, Ponto3D canto2) {
        setCanto1(canto1);
        setCanto2(canto2);
    }
    
    public Ponto3D getCanto1() {
        return canto1;
    }

    public void setCanto1(Ponto3D canto1) {
        this.canto1 = canto1;
    }

    public Ponto3D getCanto2() {
        return canto2;
    }

    public void setCanto2(Ponto3D canto2) {
        this.canto2 = canto2;
    }
}
