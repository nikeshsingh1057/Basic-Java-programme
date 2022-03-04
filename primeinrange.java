import java.util.*;
public class primeinrange{
    public static void checkPrime(int n){
        int i,c=0 ;
        for(i=2;i<=n/2;i++){
            if(n%i==0)
            c++;

        }
        if(c<1)
        System.out.print(n+" ");
    }
    public static void main(String[] args){
        System.out.print("enter range:");
        Scanner sc =new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        for(;a<b;a++)
        checkPrime(a);
    }
}

