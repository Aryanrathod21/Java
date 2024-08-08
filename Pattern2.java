import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        System.out.println("Enter Number of rows you want to print : ");
        try (Scanner sc = new Scanner(System.in)) {
            int rows = sc.nextInt();

            System.out.println("Enter Number of cols you want to print : ");
            int cols = sc.nextInt();

            for(int i = 1;i<=rows;i++){
                for(int j = 1;j<=cols;j++){
                    if (i==1 || i==rows || j==1 || j==cols) {
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                    
                }
                System.out.println();
            }
        }
    }
}