//Q23. Write a java program to calculate Simple Interest
import java.util.Scanner;
public class Q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("what is the principle amount");
        int p = sc.nextInt();
        System.out.println("what is the rate of interest");
        int r = sc.nextInt();
        System.out.println("what is the time period");
        int t = sc.nextInt();
        int SI = p*r*t/100;
        System.out.println("simple interest is :-");
        System.out.println(SI);
    }
}
