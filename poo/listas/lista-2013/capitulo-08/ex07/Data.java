public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        setDia(dia);
        setMes(mes);
        setAno(ano);
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if(dia > 0 && dia <= 30){
            this.dia = dia;
        } else {
            throw new IllegalArgumentException("Dia inválido!");
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if(mes > 0 && mes <= 12){
            this.mes = mes;
        } else {
            throw new IllegalArgumentException("Mes inválido!");
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if(ano > 1900 && ano <2030) {
            this.ano = ano;
        } else {
            throw new IllegalArgumentException("Ano inválido!");
        }
    }
    
    public boolean ehIgual(Data data) {
        if(this.getDia() == data.getDia() && this.getMes() == data.getMes() && this.getAno() == data.getAno()) {
            return true;
        } else {
            return false;
        }
    }
    
    public String mostrarData(){
        return getDia() + "/" + getMes() + "/" + getAno();
    }
    
}
