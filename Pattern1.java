
import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        System.out.println("Enter Number of rows you want to print : ");
        try (Scanner sc = new Scanner(System.in)) {
            int rows = sc.nextInt();

            System.out.println("Enter Number of cols you want to print : ");
            int cols = sc.nextInt();

            for(int i = 0;i<=rows;i++){
                for(int j = 0;j<=cols;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
