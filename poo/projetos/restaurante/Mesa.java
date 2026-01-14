public class Mesa {
    private int numeroMesa;
    private int numeroPessoas;
    private int numeroPedidos;
    private double valor;
    
    public Mesa(int numeroMesa) {
    setNumeroMesa(numeroMesa);
    setNumeroPessoas(0);
    setNumeroPedidos(0);
    setValor(0);
}

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public int getNumeroPessoas() {
        return numeroPessoas;
    }

    public void setNumeroPessoas(int numeroPessoas) {
        if(numeroPessoas >= 0 && numeroPessoas <= 4){
            this.numeroPessoas = numeroPessoas;
        } else {
            throw new IllegalArgumentException("número de pessoas inválido");
        }
    }

    public int getNumeroPedidos() {
        return numeroPedidos;
    }

    private void setNumeroPedidos(int numeroPedidos) {
        if(numeroPedidos >= 0){
            this.numeroPedidos = numeroPedidos;
        } else {
            throw new IllegalArgumentException("número de pedidos inválido");
        }
    }

    public double getValor() {
        return valor;
    }

    private void setValor(double valor) {
        if(valor >= 0){
            this.valor = valor;
        } else {
            throw new IllegalArgumentException("valor inválido");
        }
    }
    
    public void acomodarPessoas(int qtdPessoas) {
        setNumeroPessoas(qtdPessoas);
    }
    
    public void adicionarPedido(double valorPedido){
        setNumeroPedidos(getNumeroPedidos() + 1);
        setValor(getValor() + valorPedido);
    }
    
    public void fecharConta(String nome, String endereco, String cnpj, int telefone) {
        System.out.println("=== Conta do Restaurante ===");
        System.out.println("Restaurante: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Telefone: " + telefone);
        System.out.println("-----------------------------");
        System.out.println("Número da mesa: " + getNumeroMesa());
        System.out.println("Número de pessoas: " + getNumeroPessoas());
        System.out.println("Número de pedidos: " + getNumeroPedidos());

        double total = getValor() * 1.10;
        System.out.println("Valor Total (+10%): R$ " + total);

        if (getNumeroPessoas() > 0) {
            System.out.println("Valor por pessoa: R$ " + (total / getNumeroPessoas()));
        }

        System.out.println("-----------------------------");
        System.out.println("Conta fechada com sucesso!\n");

        // Resetando atributos
        setNumeroPessoas(0);
        setNumeroPedidos(0);
        setValor(0);
    }
}
