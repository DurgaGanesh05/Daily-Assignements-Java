import java.util.*;

public class _05 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int curr = s.nextInt();
        int pos = s.nextInt();

        curr ^= (1 << pos);
        
        String binaryString = Integer.toBinaryString(curr);
        System.out.println(binaryString);

        s.close();
    }    
}
