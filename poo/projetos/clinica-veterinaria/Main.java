public class Main {
    public static void main(String[] args) {

        // Criando pets
        Pet pet1 = new Pet("Rex", "Cachorro", 5);
        Pet pet2 = new Pet("Mimi", "Gato", 12);

        // Criando serviços
        Servico banho = new Banho(1, 50.0, pet1);
        Servico consulta = new Consulta(2, 100.0, pet2);

        // Vetor de serviços
        Servico[] lista = new Servico[6];
        Veterinario vet = new Veterinario(lista);

        // Testes diretos
        System.out.println(vet.iniciar());

        System.out.println(banho);
        System.out.println(consulta);

        System.out.println("Valor banho: " + banho.calcularValorFinal());
        System.out.println("Valor consulta: " + consulta.calcularValorFinal());

        System.out.println(vet.finalizar());
    }
}
