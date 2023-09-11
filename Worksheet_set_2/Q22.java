//Q22. Write a java program to find the largest of three numbers.
import java.util.Scanner;
public class Q22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of a");
        int a = sc.nextInt();
        System.out.println("enter value of b");
        int b = sc.nextInt();
        System.out.println("enter value of c");
        int c = sc.nextInt();
        if(a>b){
            if(a>c){
                System.out.println(a + " is the greatest");
            }
            else{
                System.out.println(c + " is the greatest");
            }
        }
        else if(b>a){
            if(b>c){
                System.out.println(b + " is the greatest");
            }
            else{
                System.out.println(c + " is the greatest");
            }

        }
    }
}
