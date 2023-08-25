//Write a java program Check if a given number is palindrome or not.
class q3 {
    public static void main(String[] args) {
    int n=696;
    int temp=n;
    int rev=0,rem;
    
    while(temp!=0){
        rem=temp%10;
        rev=rev*10+rem;
        temp=temp/10;
    }
    if(n==rev){
        System.out.println("number is pallindrome");
    }
    else{
        System.out.println("number is not pallindrom");
    }   
}
}