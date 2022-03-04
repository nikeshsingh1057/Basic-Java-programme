import java.util.*;
public class armstorm {
    public static void armstrongCheck(int a){
        int c=0,r,s=0;
        int m=a;
        int z=m;
        while(a>0){
            c++;
            a=a/10;
        }
        while(m>0){
          r=m%10;
          s+=Math.pow(r,c);
          m=m/10;
        }
        if(z==s)
        System.out.print("it is armstrong no:"+z);
        else
        System.out.print("it is not armstrong no:"+z);
    }
    public static void main(String[] args){
        System.out.print("enter no:");
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        armstrongCheck(num);
    }
}
