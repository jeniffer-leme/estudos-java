public class Sala {
    private Lugar[] lugar;

    public Sala(int quantidade) {
        lugar = new Lugar[quantidade];

        for (int i = 0; i < quantidade; i++) {
            lugar[i] = new Lugar();
            lugar[i].setNumero(i + 1);
            lugar[i].setFila((i / 10) + 1); 
        }
    }

    public void reservar(int pos) {
        if (lugar[pos].isOcupado()) {
            throw new IllegalArgumentException("Esse lugar está ocupado");
        }
        lugar[pos].setOcupado(true);
    }

    public void liberar(int pos) {
        if (!lugar[pos].isOcupado()) {
            throw new IllegalArgumentException("O lugar já está livre");
        }
        lugar[pos].setOcupado(false);
    }

    public int lugaresLivres() {
        int livres = 0;

        for (Lugar l : lugar) {
            if (!l.isOcupado()) {
                livres++;
            }
        }
        return livres;
    }

    @Override
    public String toString() {
        String texto = "\n----------------------------------------";

        for (Lugar l : lugar) {
            if (!l.isOcupado()) {
                texto += "\nCadeira " + l.getNumero() + " (Fila " + l.getFila() + ") está LIVRE.";
            } else {
                texto += "\nCadeira " + l.getNumero() + " (Fila " + l.getFila() + ") está OCUPADA.";
            }
        }

        return texto;
    }
}

