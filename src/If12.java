import java.util.Scanner;

public class If12
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d;

        if (a>b && b > c)
            d = c;
        if (c > a && a > b)
            d = b;
        if (c > b && b > a)
            d = a;
    }
}
