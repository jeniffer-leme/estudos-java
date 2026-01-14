public class TesteGeometria3D {
    public static void main(String[] args) {
        Ponto3D p1 = new Ponto3D(0, 0, 0);
        Ponto3D p2 = new Ponto3D(2, 0, 0);

        Esfera esfera = new Esfera(p1, p2);

        System.out.println("Centro da esfera: " + esfera.getCentro());
        System.out.println("Raio da esfera: " + p1.getDistancia(p2)/2);
        System.out.println("Área da superfície: " + esfera.getSuperficie());
        System.out.println("Volume da esfera: " + esfera.getVolume());
    }
}
