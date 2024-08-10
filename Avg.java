import java.util.Scanner;

public class Avg {
    public static void Averege(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number : ");
        int a = sc.nextInt();
        System.out.println("Enter the second number : ");
        int b = sc.nextInt();
        System.out.println("Enter the third number : ");
        int c = sc.nextInt();

        int avg = (a + b + c)/3;
        System.out.println("The avg of three numbers is : "+avg);

    }
    public static void main(String[] args) {
        Averege();
    }
}
