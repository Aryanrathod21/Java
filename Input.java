
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        System.out.println("Enter the value of a : ");
        try (Scanner sc = new Scanner(System.in)) {
            int a = sc.nextInt();
            
            System.out.println("Enter the value of b : ");
            int b = sc.nextInt();
            
            int sum = a + b;
            
            System.out.println("The sum of two value is : "+sum);
        }
    }
}
