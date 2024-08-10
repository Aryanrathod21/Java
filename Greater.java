import java.util.Scanner;

public class Greater {
    public static void greater(int a,int b){
        if (a>b) {
            System.out.println(a);
        }else if(b>a){
            System.out.println(b);
        }else{
            System.out.println("both values are same");
        }
    }

    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a : ");
        int a = sc.nextInt();
        System.out.println("Enter the value of b : ");
        int b = sc.nextInt();
        greater(a, b);
        
         
    }
}
