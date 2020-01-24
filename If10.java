import java.util.Scanner;

public class If10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A=in.nextInt();
        int B=in.nextInt();
        int C=in.nextInt();
        int D=in.nextInt();
        if (A!=B && A!=C && A!=D){
            System.out.println("1");
        }
        if (B!=A && B!=C && B!=D){
            System.out.println("2");
        }
        if (C!=B && C!=A && C!=D){
            System.out.println("3");
        }
        if (D!=A && D!=C && D!=B){
            System.out.println("4");
        }
    }
}
