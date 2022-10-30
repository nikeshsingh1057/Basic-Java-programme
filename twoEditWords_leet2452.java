// Words Within Two Edits of Dictionary (leetcode_2452)

class Solution {
    public List<String> twoEditWords(String[] quer, String[] dict) {
        
        ArrayList<String> ll=new ArrayList<>();
        
        for(int i=0;i<quer.length;i++)  
        {
            for(int j=0;j<dict.length;j++)
            {
                if(quer[i].length()!=dict[j].length())
                    continue;
                
                if(quer[i]==dict[j] || two_edit(quer[i],dict[j])<=2)
                {
                    ll.add(quer[i]);
                    break;
                }
            }
        }
        return ll;
    }
    // fucntion to count how many word differ .
      public static int two_edit(String str1,String str2)
        {
            int count=0;
            int i=0,j=str1.length();
          
            while(i<j)
            {
                if(str1.charAt(i)!=str2.charAt(i))
                {
                    count++;
                }
                if(count>2)
                    break;
                i++;
            }
            return count;
        }
}
