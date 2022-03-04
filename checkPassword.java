// check password is valid or not.

import java.util.*;
public class checkPassword {
    public static void main(String[] args) {
        System.out.println("enter password:");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        password(str);

    }

    public static void password(String strc){
       if(strc.length()>9){
        int i,c=0,f=0;
        for(i=0;i<strc.length();i++){
            
            char ch=strc.charAt(i);
            if(!((ch>='a'&&ch<='z')||(ch>='A' && ch<='Z')||(ch>='0'&&ch<='9')))
            {
               f=1;
               break;
            }
            else if (ch>='0' && ch<='9')
            c++;
        }
         if(f==0 && c>=2)
         System.out.println("valid password");
         else 
        System.out.println("invalid password FROM LOOP");
    }
        else 
        System.out.println("invalid password");
    }
}