import java.util.Scanner;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class JogoDeAdivinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSorteado = random.nextInt(20) + 1;
        int palpite;
        int tentativas = 0;

        System.out.println("Tente adivinhar o número entre 1 e 20!");

        do {
            System.out.print("Digite seu palpite: ");
            palpite = scanner.nextInt();
            tentativas++;

            if (palpite < numeroSorteado) {
                System.out.println("O número é maior!");
            } else if (palpite > numeroSorteado) {
                System.out.println("O número é menor!");
            }
        } while (palpite != numeroSorteado);

        System.out.println("Parabéns! Você acertou o número " + numeroSorteado +
                " em " + tentativas + " tentativa(s).");

        scanner.close();

    }
}