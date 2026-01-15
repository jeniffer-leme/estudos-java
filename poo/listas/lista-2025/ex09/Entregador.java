public class Entregador implements Entregavel{
    private Rota entregas[];

    public Entregador() {
        entregas = new Rota[5];
    }
    
    public double getCalcularCustoTotal() {
        double soma = 0.0;
        
        for(int i = 0; i < entregas.length; i++) {
            if(entregas[i] != null) {
                soma += entregas[i].getCalcularCusto();
            }
        }
        return soma;
    }
    
    public double maiorDistancia() {
        double aux = 0.0;
        
        for(int i = 0; i < entregas.length; i++) {
            if(entregas[i] != null) {
                double dis = entregas[i].getOrigem().calcularDistancia(entregas[i].getDestino());
                
                if(dis > aux) {
                    aux = dis;
                }
            }
        }
        return aux;
    }
    
    @Override
    public String iniciarEntrega() {
        return "Entrega iniciada!" +
                entregas.toString();
    }

    @Override
    public String finalizarEntrega() {
        return "Entrega Finalizada!" +
                entregas.toString();
    }
}
