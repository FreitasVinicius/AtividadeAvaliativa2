//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class SequenciaDeFibonacci {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int contagem = 0;

        while (contagem < 10) {
            System.out.print(a);
            if (contagem < 9) {
                System.out.print(", ");
            }

            int proximo = a + b;
            a = b;
            b = proximo;
            contagem++;

        }
    }
}