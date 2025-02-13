import java.util.*;

public class _03 {
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);

        int a = s.nextInt();
        double dis;

        if(a > 5000) dis = 0.2*a;
        else if(a>=3000 && a<=5000) dis = 0.1*a;
        else dis = 0;
        
        System.out.printf("Discount: %.1f", dis);
        System.out.println("");
        System.out.printf("Final Amount: %.1f", a-dis);
    }
}
