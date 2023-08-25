//Write a java program to Check Prime Number or not. 
class q5 {
    public static void main(String[] args) {
    int n=29;
    int check=0;
    for(int i=n-1;i>1;i--){
        if(n%i==0){
            check=check+1;
        }
    }
    if(check>0){
        System.out.println("not prime number");
    }
    else{
        System.out.println("prime number");
    }
}
}