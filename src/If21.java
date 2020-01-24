import com.sun.javaws.IconUtil;

import java.util.Scanner;

public class If21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(),y = sc.nextInt();
        if(x == 0 && y == 0)
        {
            System.out.println(0);
        }
        if(x == y){
            System.out.println(1);
        }
        if(x != y) {
            if(x != 0 && y != 0){
                System.out.println(3);
            }
        }
    }
}
