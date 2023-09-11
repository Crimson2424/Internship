//Q21. Write a java program to find table of n
import java.util.Scanner;
public class Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=10;i++){
            int tab=i*n;
            System.out.println(tab);
        }
    }
}
