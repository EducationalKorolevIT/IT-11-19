import java.util.Scanner;

class for16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double number = in.nextDouble();
        int degree = in.nextInt();
        double result = 1;

        for ( int i = 0; i < degree; i++ ) {
            result *= number;

            if ( result - (int)result == 0 ) {
                System.out.println(result);
            }
        }
    }
}