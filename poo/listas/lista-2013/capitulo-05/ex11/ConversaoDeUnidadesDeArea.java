public class ConversaoDeUnidadesDeArea {
    private static double metros = 8250.0;
    private static double pes = 10.76;
    
    public static double metrosParaPés(double metros){
        return metros * 10.76;
    }
    
    public static double pesParaCm(double pes){
        return pes * 929.0;
    }
    
    public static double milhasParaAcres(double milhas){
        return milhas * 640.0;
    }
    
    public static double acreParaPes(double acres){
        return acres * 43.560;
    }
    
    public static double areaCampoParaPes(){
        return metros * pes;
    }
    
    public static double areaCampoParaAcre(){
        double converter = metrosParaPés(metros);
        return converter / 43560.0;
    }
    
    public static double areaCampoParaCm(){
        return metros * 10000;
    }
}
