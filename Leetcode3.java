// longest substring without repeating charector leet code Q no 3.
// this question also solve by using sliding window, ArrayList, linklist.
public class Main
{
	public static void main(String[] args) {
	 String str="hellop";
	 String s="";
	 int k=0;
	 int i=0;
	 int mam=1;
	 for(;i<str.length() && k<str.length();)
	  { 
	     if(!s.contains(String.valueOf(str.charAt(k))))
	     { 
	       s+=str.charAt(k);
	       k++;
	     }
	     else
	     { 
	         s="";
	         i++;
	         k=i;
	     }
	     mam=Math.max(mam,s.length());
	  }
	  System.out.println(mam);
	}
}
