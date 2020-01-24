import java.util.Arrays;
import java.util.Scanner;

public class if18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();


        if (b == c) {
            System.out.println("1");
        }
        else if (a == c) {
            System.out.println("2");
        }
        else  {
            System.out.println("3");
        }

    }
}
