import java.util.Scanner;

public class For12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float d = 1;
        float N = sc.nextFloat();

        for (float i = 0; i < N; i = i + 0.1f) {
            d = d * i;
            System.out.println(d);
        }
    }
}
