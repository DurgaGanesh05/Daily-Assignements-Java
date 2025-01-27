import java.util.*;

public class _02 {
    public static void main(String args[]){
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        double b = s.nextDouble();
        char c = s.next().charAt(0);
        boolean d = s.nextBoolean();

        System.out.println("Before conversion:");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);

        System.out.println("After conversion:");
        System.out.println((double)a);
        System.out.println((int)c);

        s.close();
    }
}
