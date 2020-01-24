import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class While10 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        float i=1.0f;
        float I=1.0f;
        float N=in.nextInt();
        while (i<=N){
            I=I*i;
            i++;
        }
        System.out.println(I);
    }
}
