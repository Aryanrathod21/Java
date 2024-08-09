import java.util.Scanner;

public class Function {
    public static void printMyName(String name){
        System.out.println(name);
    }
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            String name = sc.next();
            printMyName(name);
        }
    }
}
