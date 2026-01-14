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
    
    public String mostrarData(){
        return getDia() + "/" + getMes() + "/" + getAno();
    }
    
    public boolean vemAntes(Data data) {
        if (this.ano < data.ano) return true;
        if (this.ano > data.ano) return false;
        if (this.mes < data.mes) return true;
        if (this.mes > data.mes) return false;
        return this.dia <= data.dia; // inclui datas iguais
    }

    
    public boolean eBissexto(){
        return (ano % 4 == 0 && (ano % 100 != 0 || ano % 400 == 0));
    }
}
