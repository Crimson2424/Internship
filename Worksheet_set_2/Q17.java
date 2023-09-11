//Q17. Write a java program to check even or odd number
import java.util.Scanner;
public class Q17{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int x = sc.nextInt();
        if(x%2==0){
            System.out.println(x + " is an even number");
        }
        else{
            System.out.println(x + " is an odd number");
        }
    }
}