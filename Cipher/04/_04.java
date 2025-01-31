import java.util.*;

public class _04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

    int age = s.nextInt();
    double inc = s.nextDouble();
    boolean due = s.nextBoolean();

    boolean r = (age >= 18 && inc >= 30000 && due == false) ? true : false;

    if(r) System.out.println("You are eligible for premium membership.");
    else System.out.println("You are Not Eligible for premium membership");
    }
}