class Solution {
    public List<List<String>> partition(String str) {
        
       List<String> ll=new ArrayList<>();
		List<List<String>> ans=new ArrayList<>();
		
		Palindrome(str,ll,ans);
		
		return ans;
    }
   public static void Palindrome(String str,List<String> ll,List<List<String>> ans)
	{
		if(str.length()==0)
		{
			ans.add(new ArrayList<>(ll));
			return;
		}
		
		for(int i=1;i<=str.length();i++)
		{
			String part=str.substring(0,i);// agar part palindrome hai to he call lagega (yani tabhi palindrome hoga).
			
			if(checkPalendrom(part)==1) {
				ll.add(part);
				Palindrome(str.substring(i),ll,ans);
				
				ll.remove(ll.size()-1);
			}
		}
	}
    public static int checkPalendrom(String part)
	{
		int i=0,j=part.length()-1;
		
		while(i<j)
		{
			if(part.charAt(i)!=part.charAt(j))
				return 0;
			i++;
			j--;
		}
		return 1;
	}
}