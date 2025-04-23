import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class validadeDeSenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int senha;

        System.out.println("digite a senha");
        senha = scanner.nextInt();

        if (senha == 1234){
            System.out.println("Acesso concedido.");
        }else{
            while(senha != 1234){
                System.out.println("Senha incorreta, tente novamente.");
                senha = scanner.nextInt();

                if (senha == 1234){
                    System.out.println("Acesso concedido.");
                }
            }
        }
    scanner.close();
    }
}
