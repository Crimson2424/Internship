//Q25. Write a java program to check whether character is vowel or consonant
import java.util.Scanner;
public class Q25 {
    public static void main(String[] args) {
        String vow[]= {"a","e","i","o","u"};
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a character");
        String check= sc.next();
        int temp=0;
        for(int i=0;i<=4;i++){
            if(check.equals(vow[i])){
                temp = temp+1;
            }
            
        }
        if(temp>0){
            System.out.println("input character is vowel");
        }
        else{
            System.out.println("input character is consonant");
        }
    }
}
