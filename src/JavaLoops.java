import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class JavaLoops {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        for (int i = 0; i <= 10; i++) {
            System.out.print(n + " x " + i + " = " + n * i + "\n");
        }
        bufferedReader.close();
    }
}
