import java.util.Scanner;

public class BibliotecaSophie2B {

    public static void main(String[] args){
        //PARA REFAZER MESMO ERRANDO O COMANDO
       try(Scanner scanner = new Scanner(System.in)){
           System.out.println("\n === MENU ===");
           System.out.println("1 - Cadastrar Livro");
            System.out.println("2 - Cadastrar Usuario");
            System.out.println("3 - Cadastrar Administrador");
            System.out.println("5 - Mostrar Livros");
            System.out.println("6 - Mostrar Usuarios");
            System.out.println("7 - Mostrar Administradores");
            System.out.println("8 - Sair");
            System.out.println("------------------------------");
            System.out.print("Digite a opcao desejada: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();
            
            
       }
    }
}