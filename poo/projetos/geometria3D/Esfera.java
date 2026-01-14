public class Esfera extends ObjetoTridimensional implements GeometriaTridimensional {

    public Esfera(Ponto3D canto1, Ponto3D canto2) {
        super(canto1, canto2);
    }

    @Override
    public Ponto3D getCentro() {
        return canto1.getPontoMedio(canto2);
    }

    @Override
    public double getSuperficie() {
        double raio = (getCanto1().getDistancia(getCanto2())) / 2;
        double area = 4 * Math.PI * Math.pow(raio, 2);
        
        return area;
    }

    @Override
    public double getVolume() {
        double raio = (getCanto1().getDistancia(getCanto2())) / 2;
        double area = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);
        
        return area;
    }
}
