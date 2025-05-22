import java.util.Scanner;

public class BibliotecaSophieMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Biblioteca biblioteca = new Biblioteca();
        int opcao = 0;

        // Menu principal
        while (opcao != 7) {
            System.out.println("\n==== Menu Biblioteca ====");
            System.out.println("1. Cadastrar Usuário");
            System.out.println("2. Cadastrar Livro");
            System.out.println("3. Cadastrar Admin");
            System.out.println("4. Listar Livros");
            System.out.println("5. Listar Admins");
            System.out.println("6. Listar Usuários");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");

            try {
                opcao = sc.nextInt();
                sc.nextLine(); // Limpar buffer

                switch (opcao) {
                    case 1:
                        // Cadastrar usuário
                        System.out.print("Nome do usuário: ");
                        String nomeUsuario = sc.nextLine();
                        System.out.print("Email do usuário: ");
                        String emailUsuario = sc.nextLine();
                        Usuario u = new Usuario(nomeUsuario, emailUsuario);
                        biblioteca.cadastrarUsuario(u);
                        System.out.println("Usuário cadastrado com sucesso!");
                        break;

                    case 2:
                        // Cadastrar livro
                        System.out.print("Título do livro: ");
                        String titulo = sc.nextLine();
                        System.out.print("Autor do livro: ");
                        String autor = sc.nextLine();
                        Livro l = new Livro(titulo, autor);
                        biblioteca.cadastrarLivro(l);
                        System.out.println("Livro cadastrado com sucesso!");
                        break;

                    case 3:
                        // Cadastrar admin
                        System.out.print("Nome do admin: ");
                        String nomeAdmin = sc.nextLine();
                        System.out.print("Código do admin: ");
                        String codigoAdmin = sc.nextLine();
                        Adm a = new Adm(nomeAdmin, codigoAdmin);
                        biblioteca.cadastrarAdm(a);
                        System.out.println("Admin cadastrado com sucesso!");
                        break;

                    case 4:
                        // Listar livros
                        System.out.println("=== Lista de Livros ===");
                        biblioteca.listarLivros();
                        break;

                    case 5:
                        // Listar admins
                        System.out.println("=== Lista de Admins ===");
                        biblioteca.listarAdms();
                        break;

                    case 6:
                        // Listar usuários
                        System.out.println("=== Lista de Usuários ===");
                        biblioteca.listarUsuarios();
                        break;

                    case 7:
                        // Sair
                        System.out.println("Saindo do sistema...");
                        break;

                    default:
                        System.out.println("Opção inválida. Tente novamente.");
                }
            } catch (Exception e) {
                System.out.println("Erro: entrada inválida.");
                sc.nextLine(); // Limpar buffer após erro
            }
        }
        sc.close();
    }
}
