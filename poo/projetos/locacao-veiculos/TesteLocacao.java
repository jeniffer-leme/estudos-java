public class TesteLocacao {
    public static void main(String[] args) {

        // Criando veículos
        Veiculo carro1 = new Veiculo("ABC-1234", "Gol", 100);
        Veiculo carro2 = new Veiculo("XYZ-5678", "Onix", 150);

        // Criando locações
        Locacao loc1 = new LocacaoUrbana(1, carro1, 3);
        Locacao loc2 = new LocacaoRodoviaria(2, carro2, 2, 50);

        // Funcionário
        Funcionario funcionario = new Funcionario();

        // Simulando inserção manual (exemplo simples)
        funcionario.iniciarAtendimento();
        System.out.println("Custo locação 1: " + loc1.calcularCusto());
        System.out.println("Custo locação 2: " + loc2.calcularCusto());

        System.out.println("Atendimento finalizado.");
    }
}
