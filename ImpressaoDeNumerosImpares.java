//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class ImpressaoDeNumerosImpares {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                if (i == 99) {
                    System.out.print(i); 
                } else {
                    System.out.print(i + ", ");
                }
            }
        }

    }
}