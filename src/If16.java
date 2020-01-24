import java.util.Scanner;

public class If16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите A:");
        int a = sc.nextInt();
        System.out.println("Введите B:");
        int b = sc.nextInt();
        System.out.println("Введите C:");
        int c = sc.nextInt();

        if (a<b && b<c) {
            System.out.println((a * 2));
            System.out.println((b * 2));
            System.out.println((c * 2));
        } else {
            System.out.println((a * (-1)));
            System.out.println((b * (-1)));
            System.out.println((c * (-1)));
        }
        sc.close();

    }
}
