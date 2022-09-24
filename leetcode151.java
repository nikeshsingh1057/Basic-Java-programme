// reverse word 

import java.util.*;
public class reverse_word
{
public static void main(String[] args) {
	
	String s="world aasdfasdf hu apple";
    String s2="";
    for(int i=s.length()-1;i>=0;i--)
    {
        if(s.charAt(i)==' ')
        continue;
        
        else if(s.charAt(i)!=' ')
        {
        	String s3="";
            s3=reverse(i,s,s3);
            s2+=s3;
            i=i-s3.length();
        }
         s2+=" ";
    }
    System.out.println(s2.trim());
}
public static String reverse(int i, String s,String s3)
{
    Stack<Character> st=new Stack<>();
    while(i>=0 && s.charAt(i)!=' ')
    {
        st.push(s.charAt(i));
        i--;
    }
    while(st.isEmpty()==false)
     s3+=st.pop();
    return s3;
    
}
}

