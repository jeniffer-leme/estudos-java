public class DataHora {
    private Data estaData;
    private Hora estaHora;

    public DataHora(int dia, int mes, int ano, int hora, int min, int segundo) {
        setEstaData(new Data(dia, mes, ano));
        setEstaHora(new Hora(hora, min, segundo));
    }
    
    public Data getEstaData() {
        return estaData;
    }

    public void setEstaData(Data estaData) {
        this.estaData = estaData;
    }

    public Hora getEstaHora() {
        return estaHora;
    }

    public void setEstaHora(Hora estaHora) {
        this.estaHora = estaHora;
    }
    
    public boolean ehIgual(DataHora dataHora) {
        if(this.getEstaData() == dataHora.getEstaData() && this.getEstaHora() == dataHora.getEstaHora()) { 
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        String resultado = "Hora: " + getEstaHora();
        resultado += " da Data: " + getEstaData().getDia();
        resultado += " de ";
        
        switch(getEstaData().getMes()) {
            
            case 1:
                resultado += "Janeiro";
                break;
                
            case 2:
                resultado += "Fevereiro";
                break;
                
            case 3:
                resultado += "Março";
                break;
                
            case 4:
                resultado += "Abril";
                break;
                
            case 5:
                resultado += "Maio";
                break;
                
            case 6:
                resultado += "Junho";
                break;
                
            case 7:
                resultado += "Julho";
                break;
                
            case 8:
                resultado += "Agosto";
                break;
                
            case 9:
                resultado += "Setembro";
                break;
                
            case 10:
                resultado += "Outubro";
                break;
                
            case 11:
                resultado += "Novembro";
                break;
                
            case 12:
                resultado += "Dezembro";
                break;
        }
        
        resultado += " de " + getEstaData().getAno();
        
        return resultado;
    }
}
