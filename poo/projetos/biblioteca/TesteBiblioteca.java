public class TesteBiblioteca {
    public static void main(String[] args) {
        Emprestavel[] biblioteca = new Emprestavel[5];
        biblioteca[0] = new LivroFisico("Prateleira 1", "Java Básico", "Autor A", 1, 2020);
        biblioteca[1] = new LivroFisico("Prateleira 1", "Java Avançado", "Autor B", 2, 2021);
        biblioteca[2] = new Revista("Prateleira 2", "Revista Ciência", "Autor C", 10, 2023);
        biblioteca[3] = new Revista("Prateleira 2", "Revista Tecnologia", "Autor D", 5, 2022);
        biblioteca[4] = new Chave("A12");

        System.out.println("Objetos disponíveis para empréstimo:");
        for(Emprestavel e : biblioteca) {
            if(e.podeEmprestar()) {
                System.out.println(e.getNomeObjeto());
                System.out.println("--------------------------");
            }
        }

        // Exemplo de empréstimo
        System.out.println("Tentando emprestar o primeiro livro...");
        if(biblioteca[0].emprestar()) {
            System.out.println("Empréstimo realizado com sucesso!");
        } else {
            System.out.println("Não foi possível emprestar.");
        }
    }
}
