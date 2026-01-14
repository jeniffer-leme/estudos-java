public class HoraAproximada {
    private int hora, minutos;

    public HoraAproximada(int h, int m) {
        setAlterarHora(h);
        setAlterarMinuto(m);
    }
    
    public int getObterHora(){
        return hora;
    } 
    
    public int getObterMinuto(){
        return minutos;
    }
    
    public void setAlterarHora(int h){
        if(h >= 0 && h <= 23){
            hora = h;
        } else {
            throw new IllegalArgumentException("hora inválida: >= 0 && <= 23");
        }
    }
    
    public void setAlterarMinuto(int m){
        if(m >= 0 && m <= 59){
            minutos = m;
        } else {
            throw new IllegalArgumentException("minuto inválido >= 0 && <= 59");
        }
    }
    
    public boolean ehValido(int h, int m){
        if((h >= 0 && h <= 23) && (m >= 0 && m <= 59)){
            return true;
        } else {
            return false;
        }
    }
    
    public void mostraDados() {
        System.out.println( hora + ":" + minutos );
    }
}
