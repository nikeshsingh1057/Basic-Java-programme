class Solution {
    
    static int count;
    public int numTilePossibilities(String str) {
        
        count=-1;
        
        char tempArray[] = str.toCharArray();
		Arrays.sort(tempArray);

		str=new String(tempArray);   //converting char array to string using passing in string function

		tile(str,"");
		
		return count;
        
    }
  	public static void tile(String str,String ans) 
    {
	    count++;
        
		if(str.length()==0)
		{
			return;
		}
        
		for(int i=0;i<str.length();i++)
		{
			if(i>0 && str.charAt(i-1)==str.charAt(i))  // for removing dublicate.
			continue;

			String a=str.substring(0,i);
			String b=str.substring(i+1);

			tile(a+b, ans+str.charAt(i));
		}
	}  
}