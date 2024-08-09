import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        System.out.println("Enter Number of rows you want to print : ");
        try (Scanner sc = new Scanner(System.in)) {
            int rows = sc.nextInt();


            for(int i = 1;i<=rows;i++){
                for(int j = 1;j<=rows;j++){
                    if(j<=rows-i){
                        System.out.print(" ");
                    }else{
                        System.out.print("*");
                    }
                }
                System.out.println();
            }
        }
    }
}
