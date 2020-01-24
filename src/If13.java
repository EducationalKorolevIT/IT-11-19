public class If13 {
    public static void main(String[] args) {
        int a = 4;
        int b = 1;
        int c = 2;

        if (a > b && a < c || a < b && a > c) {
            System.out.println(a);
        } else if (b > a && b < c || b < a && b > c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
}

