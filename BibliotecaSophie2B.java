import java.util.Scanner;

public class BibliotecaSophie2B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();

        // Menu principal
        while (true) {
            System.out.println("\n==== Menu Biblioteca ====");
            System.out.println("1. Cadastrar Usuario");
            System.out.println("2. Cadastrar Livro");
            System.out.println("3. Cadastrar Admin");
            System.out.println("4. Listar Livros");
            System.out.println("5. Listar Admins");
            System.out.println("6. Listar Usuarios");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opcao: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            try {

                switch (opcao) {
                    case 1 -> {
                        // Cadastrar usuário
                        //mesmo depois de horas codando, nem IA nem os colegas conseguiram descobrir o erro
                        System.out.print("ID: ");
                        String id = scanner.nextLine();
                        System.out.print("Nome: ");
                        String nome = scanner.nextLine();
                        System.out.print("Email: ");
                        String email = scanner.nextLine();
                        
                        biblioteca.cadUsuario(); 
                        System.out.println("Usuario cadastrado!");
                    }

                    case 2 -> {
                        // Cadastrar livro
                        //mesmo depois de horas codando, nem IA nem os colegas conseguiram descobrir o erro
                        System.out.print("ISBN: ");
                        String isbn = scanner.nextLine();
                        System.out.print("Titulo: ");
                        String titulo = scanner.nextLine();
                        System.out.print("Autor: ");
                        String autor = scanner.nextLine();
                        System.out.print("Ano: ");
                        int ano = scanner.nextInt();
                        scanner.nextLine();

                        biblioteca.cadLivro();
                        System.out.println("Livro cadastrado!");
                    }

                    case 3 -> {
                        // Cadastrar admin** 
                        //mesmo depois de horas codando, nem IA nem os colegas conseguiram descobrir o erro
                        System.out.print("ID: ");
                        String id = scanner.nextLine();
                        System.out.print("Nome: ");
                        String nome = scanner.nextLine();
                        System.out.print("Email: ");
                        String email = scanner.nextLine();
                        System.out.println("Cargo: ");
                        String cargo = scanner.nextLine();
                        
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
                        System.out.println("=== Lista de Administradores ===");
                        biblioteca.listarAdms();
                    }

                    case 6 -> {
                        // Listar usuários
                        System.out.println("=== Lista de Usuarios ===");
                        biblioteca.listarUsuarios();
                    }
                    
                    case 7 -> {
                        System.out.println("Saindo...");
                        return;
                    }

                    default -> System.out.println("Opcao invalida. Tente novamente.");
                }
            } catch (Exception e) {
                System.out.println("Erro: entrada invalida.");
                scanner.nextLine(); // Limpar ENTER após erro
            }
        }
    }
}