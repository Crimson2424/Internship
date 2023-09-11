//Q18. Write a java program to find average of two numbers
import java.util.Scanner;
public class Q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter two numbers");
        double a = sc.nextInt();
        double b = sc.nextInt();
        double sum = a+b;
        double avg = sum/2;
        System.out.println(avg);
    }
}
