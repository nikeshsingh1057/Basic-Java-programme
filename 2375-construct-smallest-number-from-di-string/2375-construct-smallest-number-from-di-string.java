class Solution {
    public String smallestNumber(String str) {      // str= pattern.
        
        int [] ans= new int[str.length()+1];
		int count=1;
		
		for(int i=0;i<=str.length();i++)
		{
			if(i==str.length() || str.charAt(i)=='I')
			{
				ans[i]=count;
                count++;
				
				for(int j=i-1;j>=0 && str.charAt(j)!='I';j--) {
					
					ans[j]=count;
					count++;
					
				}
			}
		}
        
        String str_ans="";
        
        for(int i: ans)
        {
            str_ans+=i;
        }
        
        return str_ans;
    }
}