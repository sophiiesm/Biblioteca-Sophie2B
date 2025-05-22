import java.util.Scanner;

public class BibliotecaSophie2B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();

        // Menu principal
        while (true) {
            System.out.println("\n==== Menu Biblioteca ====");
            System.out.println("1. Cadastrar Usuário");
            System.out.println("2. Cadastrar Livro");
            System.out.println("3. Cadastrar Admin");
            System.out.println("4. Listar Livros");
            System.out.println("5. Listar Admins");
            System.out.println("6. Listar Usuários");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            try {

                switch (opcao) {
                    case 1 -> {
                        // Cadastrar usuário
                        biblioteca.cadUsuario(); 
                        System.out.println("Usuário cadastrado com sucesso!");
                    }

                    case 2 -> {
                        // Cadastrar livro
                        biblioteca.cadLivro();
                        System.out.println("Livro cadastrado com sucesso!");
                    }

                    case 3 -> {
                        // Cadastrar admin
                        biblioteca.cadAdm();
                        System.out.println("Admin cadastrado com sucesso!");
                    }

                    case 4 -> {
                        // Listar livros
                        System.out.println("=== Lista de Livros ===");
                        biblioteca.listarLivros();
                    }

                    case 5 -> {
                        // Listar admins
                        System.out.println("=== Lista de Admins ===");
                        biblioteca.listarAdms();
                    }

                    case 6 -> {
                        // Listar usuários
                        System.out.println("=== Lista de Usuários ===");
                        biblioteca.listarUsuarios();
                    }
                    
                    case 7 -> {
                        System.out.println("Saindo...");
                        return;
                    }

                    default -> System.out.println("Opção inválida. Tente novamente.");
                }
            } catch (Exception e) {
                System.out.println("Erro: entrada inválida.");
                scanner.nextLine(); // Limpar buffer após erro
            }
        }
    }
}