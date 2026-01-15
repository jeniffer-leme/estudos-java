public class Veterinario implements Atendimento {
    private Servico servicos[];

    public Veterinario(Servico[] servicos) {
        this.servicos = new Servico[6];
    }
    
    public void adicionarServico(Servico s) {
        for(int i = 0; i < servicos.length; i++) {
            if(servicos[i] != null) {
                servicos[i] = s;
                return;
            } else {
                throw new IllegalArgumentException("Serviços atingiu limite máximo.");
            }
        }
    }
    
    public double getCalcularTotal() {
        double soma = 0.0;
    
        for(int i = 0; i < servicos.length; i++) {
            if(servicos[i] != null) {
               soma = servicos[i].calcularValorFinal();
            }
        }
        return soma;
    }
    
    public double getMaiorValor() {
        double aux = 0.0;
        
        for(int i = 0; i < servicos.length; i++) {
            if(servicos[i] != null) {
                
                double maior = servicos[i].calcularValorFinal();
                
                if(maior > aux) {
                    aux = maior;
                }
            }
        }
        return aux;
    }

    @Override
    public String iniciar() {
        return "Serviço iniciado." + servicos.toString();
    }

    @Override
    public String finalizar() {
        return "Serviço finalizado." + servicos.toString();
    }
}
