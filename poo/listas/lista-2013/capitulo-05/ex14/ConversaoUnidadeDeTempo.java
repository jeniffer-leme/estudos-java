public class ConversaoUnidadeDeTempo {
    
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
}
