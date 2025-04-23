import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ValidacaoEntradaDeDados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        do{
            System.out.println("Digite um numero entre 1 e 100: ");
            numero = scanner.nextInt();

        }while(numero < 1 || numero > 100);

        System.out.println("Numero validado: " + numero);


        scanner.close();

    }
}