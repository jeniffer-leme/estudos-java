public class ConversaoUnidadeDeTempo {
    private static int dias = 624;
    
    public static int conversaoMinuto(int minuto){
        return minuto * 60;
    }
    
    public static int conversaoHora(int hora){
        return hora * 60;
    }
    
    public static int conversaoDia(int dia){
        return dia * 24;
    }
    
    public static int conversaoSemana(int semana){
        return semana * 7;
    }
    
    public static int conversaoMes(int mes){
        return mes * 30;
    }
    
    public static double conversaoAno(int ano){
        return ano * 365.25;
    }
    
    public static int conversaoElefanteDias(){
        return dias;
    }
    
    public static int conversaoElefanteHoras(){
        return dias * 24;
    }
    
    public static int conversaoElefanteMinutos(){
        int hora = dias * 24;
        return hora * 60;
    }
    
    public static int conversaoElefanteSegundos(){
        int hora = dias * 24;
        int min = hora * 60;
        return min * 60;
    }
}
