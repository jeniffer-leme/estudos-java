public class StringDNA {
    private String dna;

    public StringDNA(String dna) {
        this.dna = dna;
    }

    public String getDna() {
        return dna;
    }

    public int compara(StringDNA outro) {
        int pontos = 0;
        String outroDna = outro.getDna();

        int tamanho = Math.min(this.dna.length(), outroDna.length());

        for (int i = 0; i < tamanho; i++) {
            char c1 = this.dna.charAt(i);
            char c2 = outroDna.charAt(i);

            if (c1 == c2) {
                pontos += 3;
            } else if ((c1 == 'A' && c2 == 'T') || (c1 == 'T' && c2 == 'A')) {
                pontos += 1;
            } else if ((c1 == 'C' && c2 == 'G') || (c1 == 'G' && c2 == 'C')) {
                pontos += 1;
            }
        }

        return pontos;
    }
}
