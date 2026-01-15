public class Funcionario implements Atendivel{
    private Locacao locacoes[];

    public Funcionario() {
         locacoes = new Locacao[5];
    }
    
    public double getCustoTotal() {
        double soma = 0.0;
        
        for(int i = 0; i < locacoes.length; i++) {
            if(locacoes[i] != null) {
                soma += locacoes[i].calcularCusto();
            }
        }
        return soma;
    }
    
    public double getMaisCaro() {
        double aux = 0.0;
        
        for(int i = 0; i < locacoes.length; i++) {
            if(locacoes[i] != null) {
                
                double caro = locacoes[i].calcularCusto();
                
                if(caro > aux) {
                    aux = caro;
                }
            }
        }
        return aux;
    }

    @Override
    public String iniciarAtendimento() {
        return "Atendimento iniciado!\n" + locacoes.toString();
    }

    @Override
    public String finalizarAtendimento() {
        return "Atendimento Finalizado!\n" + locacoes.toString();
    }
}
