class Solution {
    public List<String> letterCasePermutation(String s) {
        
        List<String> ll = new ArrayList<>();
        
        LetterCase(s, "",ll);
        return ll;
    }
    
    public static void LetterCase(String str,String ans,List<String> ll)
    {
        if(str.length()==0)
        {
            ll.add(ans);
            return;
        }
        
        if(str.charAt(0)>='0' && str.charAt(0)<='9')
            LetterCase(str.substring(1), ans+str.charAt(0),ll);

        else{
            
            LetterCase(str.substring(1), ans+Character.toLowerCase(str.charAt(0)),ll);
            LetterCase(str.substring(1), ans+Character.toUpperCase(str.charAt(0)),ll);
        }
    }
}