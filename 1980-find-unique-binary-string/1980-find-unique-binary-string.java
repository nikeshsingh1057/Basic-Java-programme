class Solution {
    static String str;
    public String findDifferentBinaryString(String[] nums) {
        
        str="";
        
        ArrayList<String> ll=new ArrayList<>();
        
        int k=nums[0].length();
        
        for(int i=0;i<nums.length;i++)
            ll.add(nums[i]);
        
        Binary(ll,"",k);
        return str;
        
    }
    public static void Binary(ArrayList<String> ll,String ans,int k)
    {
        if(ans.length()>k)
            return;
        
        if(ans.length()==k && ll.contains(ans)==false)
        {
            str=ans;
            return;
        }
        
         Binary(ll,ans+'0',k);  
         Binary(ll,ans+'1',k);
    }
}