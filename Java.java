import java.io.IOException;
 
import java.util.Scanner;
public class Main {
 
public static void main(String[] args) throws IOException {
       Scanner input =new Scanner(System.in);
       double r,a = 3.14159,b;
       r = input.nextDouble();
       b = a * r * r;
       System.out.printf("A=%.4f\n", b);
    }
}
