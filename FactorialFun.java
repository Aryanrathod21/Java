import java.util.Scanner;

public class FactorialFun {
    public static void printFactorial(int n){
        if (n < 0) {
            System.out.println("invalid number");
            return;
        }
        int fact = 1;
        for(int i = n;i>=1;i--){
            fact = fact*i;
        }
        System.out.println("The factorial of the given number is : "+fact);

        return;
    }
    public static void main(String[] args) {
        System.out.println("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printFactorial(n);
    }
}
