import java.util.ArrayList;
import java.util.Scanner;

public class Koti {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        ArrayList<String> Cats = new ArrayList<String>();
        int N= sc.nextInt();
        String O= sc.nextLine();
        for (int i=0;i<N;i++)
            Cats.add(O= sc.nextLine());
        for (int Y=0;Y<N;Y++)
            System.out.println(Cats.get(Y));
        System.out.println(N-1);
    }
}
// Made by Andrej Puchow