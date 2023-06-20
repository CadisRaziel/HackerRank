import java.util.Scanner;

public class JavaOutputFormatting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();

            // "%-15s" -> o "S" indica uma string, "-" para alinhar a esquerda, "15" para o tamanho da string
            // "%03d" -> o "d" indica um inteiro, "0" para preencher com zeros a esquerda, "3" para o tamanho do inteiro
            // %n -> para pular uma linha
            System.out.printf("%-15s%03d%n", s1, x);
        }
        System.out.println("================================");

    }
}
