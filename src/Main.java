import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // TODO: implement solution (soal 1)
         int a = sc.nextInt();
        int b = sc.nextInt();

        if (b > 0 && a > Integer.MAX_VALUE - b) {
            System.out.println("OVERFLOW");
        }
        else if (b < 0 && a < Integer.MIN_VALUE - b) {
            System.out.println("OVERFLOW");
        }
        else {
            System.out.println(a + b);
        }
    // soal 2
    float a = sc.nextFloat();
        float b = sc.nextFloat();

        float hasilFloat = a + b;
        double hasilDouble = (double)a + (double)b;

        double selisih = Math.abs(hasilFloat - hasilDouble);

        System.out.printf("%.6f\n", selisih);
    // soal 3
    
    }
}
