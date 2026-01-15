public class Data {
    private int dia, mes ,ano;

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if(dia > 0 && dia <= 31) {
            this.dia = dia;
        } else {
            throw new IllegalArgumentException("Dia precisa ser > 0 e <= 31.");
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if(mes > 0 && mes <= 12) {
            this.mes = mes;
        } else {
            throw new IllegalArgumentException("Mês precisa ser > 0 e <= 12.");
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if(ano > 0) {
            this.ano = ano;
        } else {
            throw new IllegalArgumentException("Ano precisa ser > 0.");
        }
    }
    
    public String mostrarData() {
        return getDia()+ "/" + getMes() + "/" + getAno();
    }
    
    public boolean vemAntes(Data outro) {
        if (this.ano < outro.ano) {
            return true;
        } 
        if (this.ano == outro.ano && this.mes < outro.mes) {
            return true;
        }
        if (this.ano == outro.ano && this.mes == outro.mes && this.dia < outro.dia) {
            return true;
        }
        return false;
    }
    
    public boolean anoBissexto() {
        if(getAno() % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
