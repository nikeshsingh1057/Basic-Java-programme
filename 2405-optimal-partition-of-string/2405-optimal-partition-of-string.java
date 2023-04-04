class Solution {
    public int partitionString(String s) {
        
        int count=0;
        List<Character> ll=new ArrayList<>();
        
        for(int i=0;i<s.length();i++)
        {
            if(!ll.contains(s.charAt(i))){
                
                ll.add(s.charAt(i));
            }
            else{
                
                i--;
                count++;
                ll=new ArrayList<>();
            }
        }
        return count+1;
    }
}