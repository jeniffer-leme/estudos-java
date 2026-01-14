public class Tabuada {
    public static void main(String[] args) {
        Tabuada[][][][][] tabuada = new Tabuada[10][10][10][10][10];
        
        for(int i = 0; i < tabuada.length; i++) {
            for(int j = 0; j < tabuada.length; j++) {
                for(int k = 0; k < tabuada.length; k++) {
                    for(int l = 0; l < tabuada.length; l++) {
                        for(int m = 0; m < tabuada.length; m++) {
                            int mult = i * j * k * l * m;
                            
                            System.out.println("["+i+"] ["+j+"] ["+k+"] ["+l+"] ["+m+"] = " + mult);
                        }
                        System.out.println("\n");
                    }
                }
            }
        }
    }
}
