public class StringDNA {
    
    private String dna;
    
    public StringDNA(String entrada) {
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < entrada.length(); i++) {
            char c = Character.toUpperCase(entrada.charAt(i));
            if (c == 'A' || c == 'C' || c == 'G' || c == 'T') {
                sb.append(c);
            }
        }
        
        this.dna = sb.toString();
    }
    
    @Override
    public String toString() {
        return dna;
    }
    
    public char charAt(int posicao) {
        if (posicao < 0 || posicao >= dna.length()) {
            throw new IndexOutOfBoundsException("Posição inválida!");
        }
        return dna.charAt(posicao);
    }
    
    public int quantosA() {
        return contar('A');
    }

    public int quantosC() {
        return contar('C');
    }

    public int quantosG() {
        return contar('G');
    }

    public int quantosT() {
        return contar('T');
    }
    
    public int length() {
        return dna.length();
    }

    private int contar(char base) {
        int cont = 0;
        for (int i = 0; i < dna.length(); i++) {
            if (dna.charAt(i) == base) {
                cont++;
            }
        }
        return cont;
    }
}
