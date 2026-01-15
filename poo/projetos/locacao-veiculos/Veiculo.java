public class Veiculo {
    private String placa;
    private String modelo;
    private double valor;

    public Veiculo(String placa, String modelo, double valor) {
        setPlaca(placa);
        setModelo(modelo);
        setValor(valor);
    }
    
    public String getPlaca() {
        return placa;
    }

    private void setPlaca(String placa) {
        if(placa != null) {
            this.placa = placa;
        } else {
            throw new IllegalArgumentException("A placa não poder ser null.");
        }
    }

    public String getModelo() {
        return modelo;
    }

    private void setModelo(String modelo) {
        if(modelo != null) {
            this.modelo = modelo;
        } else {
            throw new IllegalArgumentException("O modelo não poder ser null.");
        }
    }

    public double getValor() {
        return valor;
    }

    private void setValor(double valor) {
        if(valor >= 0) {
            this.valor = valor;
        } else {
            throw new IllegalArgumentException("O valor não pode ser negativo.");
        }
    }
}
