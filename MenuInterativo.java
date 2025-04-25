import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class MenuInterativo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("****MENU****");
            System.out.println("1 - Adicionar");
            System.out.println("2 - Remover");
            System.out.println("3 - Sair");
            System.out.println("Escolha uma opção: ");


            opcao = scanner.nextInt();

            
            if (opcao == 1){
                System.out.println("Ação de ADICIONAR executada.");
            } else if (opcao == 2) {
                System.out.println("Ação de REMOVER executada.");
            }else if (opcao == 3){
                System.out.println("Saindo do progrma...");
            }else{
                System.out.println("Opção invalida, Tente novamente.");
            }


        }while(opcao != 3);

        scanner.close();
    }
}