import java.util.*;
public class pass{
    public static void main(String args[]){
        String UpperCase = "QWERTYUIOPASDFGHJKLZXCVBNM";
        String LowerCase = "qwertyuiopasdfghjklzxcvbnm";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*()<>?~";
        Random rand = new Random();
        int length = 8 + rand.nextInt(9);
        String password = "";
        for(int i = 0 ; i<length;i++){
            int choose = rand.nextInt(4);
            String selectedString = "";
            if(choose == 0){
                selectedString = UpperCase;
            }
            if(choose == 1){
                selectedString = LowerCase;
            }
            if(choose == 2){
                selectedString = numbers;
            }
            if(choose == 3){
                selectedString = symbols;
            }
            int randomCharIndex = rand.nextInt(selectedString.length());
            char randomChar = selectedString.charAt(randomCharIndex);
            password = password + randomChar;
        }
        System.out.println("password = " + password);
        System.out.println("length = " + length);
        int strength = passwordStrength(password);
        if(strength==1) System.out.println("strength is very weak");
        if(strength==2) System.out.println("strength is weak");
        if(strength==3) System.out.println("strength is medium");
        if(strength==4) System.out.println("strength is strong");
        if(strength==5) System.out.println("strength is very strong");
    }
    static int passwordStrength(String password){
        int length = password.length();
        boolean isNumber=false;
        boolean isSymbol=false;
        boolean isUpperCase=false;
        boolean isLowerCase=false;
        for(int i = 0;i<length;i++){
            char current =password.charAt(i);
            if(Character.isDigit(current)){
                isNumber=true;
            }
            if(Character.isUpperCase(current)){
                isUpperCase=true;
            }
            if(Character.isLowerCase(current)){
                isLowerCase=true;
            }
            else{
                isSymbol=true;
            }
        }
        int strength=0;
        if(isNumber=true) strength++;
        if(isUpperCase=true) strength++;
        if(isLowerCase=true) strength++;
        if(isSymbol=true) strength++;
        if(length>12) strength++;
        return strength;
    }
}