//Q20. Write a java program to check whether a number is prime or not
import java.util.Scanner;
public class Q20 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int x = n-1;
        int temp=0;
        for(int i=n-1;i>1;i--){
            if(n%i==0){
                temp=temp+1;
            }
           
        }
        if(temp>0){
            System.out.println(n + " is not a prime number");
        }
        else{
            System.out.println(n + " is a prime number");
        }
    }
}
