import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        System.out.println("Enter Number of rows you want to print : ");
        try (Scanner sc = new Scanner(System.in)) {
            int rows = sc.nextInt();


            for(int i = 1;i<=rows;i++){
                for(int j = 1;j<=i;j++){
                    
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}