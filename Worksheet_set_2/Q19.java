//Q19. Write a java program to swap two numbers
import java.util.Scanner;
public class Q19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of a");
        int a = sc.nextInt();
        System.out.println("enter value of b");
        int b = sc.nextInt();
        int temp = a;
        a=b;
        b=temp;
        System.out.println("a = " + a );
        System.out.println("b = " + b);
    }
}
