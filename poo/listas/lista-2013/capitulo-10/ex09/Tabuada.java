public class Tabuada {
    public static void main(String[] args) {
        Tabuada[][] tabuada = new Tabuada[10][10];
        
        for(int i = 0; i < tabuada.length; i++) {
            for(int j = 0; j < tabuada[i].length; j++) {
                
                int soma = i + j;
                    System.out.println("tabuada["+i+"] ["+j+"] = " + soma);
            }
            System.out.println("\n");
        }
    }
}
