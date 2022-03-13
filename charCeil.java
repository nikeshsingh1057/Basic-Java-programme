// next ceil charector in char arry using binary search
public class charCeil
{
	public static void main(String[] args) {
	 char[] str={'a','d','e','f','h','k','l'};
	 char ch='a';
	 int ans=binary(str,ch);
		System.out.println(str[ans]);
	}
	public static int binary(char [] str,char ch)
	{ 
	    
	    int st=0,en=6,mi=0;
	    if(ch>=str[6])
	    return st;
	    while(st<=en)
	    {
	        mi=st+(en-st)/2;
	        if(ch<str[mi])
	        en=mi-1;
	       else if(ch>str[mi])
	        st=mi+1;
	       else if( ch == str[mi])
	       return mi+1;
	        
	    }
	        return st;
	}
}


