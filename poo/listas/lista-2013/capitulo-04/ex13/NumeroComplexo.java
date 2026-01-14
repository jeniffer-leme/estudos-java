public class NumeroComplexo {
    private int numero1;
    private int numero2;

    public NumeroComplexo(int numero1, int numero2) {
        setNumero1(numero1);
        setNumero2(numero2);             
    }

    public NumeroComplexo(int numero1) {
        setNumero1(numero1);
        setNumero2(0);
    }
    
    public NumeroComplexo(){
        setNumero1(0);
        setNumero2(0);
    }
    
   
    private int getNumero1() {
        return numero1;
    }

    private void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    private int getNumero2() {
        return numero2;
    }

    private void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    public void inicializaNumero(int num1, int num2){
        setNumero1(num1);
        setNumero2(num2);
    }
    
    public void imprimirNumero(){
        System.out.println("Numero Complexo:");
        System.out.printf("%d + %di", getNumero1(), getNumero2());
        System.out.println();
    }
    
    public boolean ehIgual(NumeroComplexo num){
        if(this.getNumero1() == num.getNumero1() && this.getNumero2() == num.getNumero2()){
            return true;
        } else {
            return false;
        }
    }
    
    public void soma(NumeroComplexo num){
        setNumero1(this.getNumero1() + num.getNumero1());
        setNumero2(this.getNumero2() + num.getNumero2());
    }
    
    public void subtrai(NumeroComplexo num){
        int real = (this.getNumero1() - num.getNumero1());
        int imag = (this.getNumero2() - num.getNumero2());
        
        setNumero1(real);
        setNumero2(imag);
    }
    
    public void multiplica(NumeroComplexo num){
        setNumero1(this.getNumero1() * num.getNumero1() - this.getNumero2() * num.getNumero2());
        setNumero2(this.getNumero1() * num.getNumero2() + this.getNumero2() * num.getNumero1());
    }
    
    public void divide(NumeroComplexo num) {
        int a = this.getNumero1();
        int b = this.getNumero2();
        int c = num.getNumero1();
        int d = num.getNumero2();

        int denominador = c*c + d*d;

        int real = (a*c + b*d) / denominador;
        int imag = (b*c - a*d) / denominador;

        setNumero1(real);
        setNumero2(imag);
    }
}
