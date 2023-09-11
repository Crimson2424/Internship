//Q24. Write a java program to calculate Area and perimeter of Rectangle
import java.util.Scanner;
public class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("what is the length of the rectacngle");
        int l = sc.nextInt();
        System.out.println("what is the width of the rectangle");
        int w = sc.nextInt();
        int area= l*w;
        int para= 2*(l+w);
        System.out.println("area of the rectangle is " + area);
        System.out.println("parameter of the rectangle is " + para);
    }
}
