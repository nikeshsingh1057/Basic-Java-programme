// bruet force approch
// Minimum Additions to Make Valid String
class Solution {
    // watch on youtube if not understand.
    // basically we concanating abc abc and make compare with given word.
    public int addMinimum(String word) {
        
        String CurrWord="abc";
        
        while(true){
            
            if(isValid(word,CurrWord)){
                return CurrWord.length()-word.length();
            }
            CurrWord+="abc"; // we add till we not true.
        }
    }
    public static boolean isValid(String word,String CurrWord)
    {
        int l1=word.length();
        int l2=CurrWord.length();
        
        int i=0,j=0;
        
        while(i<l1 && j<l2){
            
            if(word.charAt(i)==CurrWord.charAt(j))
                i++;
            j++;
        }
        return i==l1;
    }
}

// efficient approch

class Solution {
    public int addMinimum(String s) {
        
        int n=s.length();
        int totalAdd=0;
        
        for(int i=0;i<n;)
        {
            char ch=s.charAt(i);
            
            if(ch=='a'){
                
                if(i+1<n && s.charAt(i+1)=='b' && i+2<n && s.charAt(i+2)=='c')
                    i+=3;
                
                else if(i+1<n && s.charAt(i+1)=='b'){
                    
                    totalAdd++;
                    i+=2;
                }
                else if(i+1<n && s.charAt(i+1)=='c'){
                    
                    totalAdd++;
                    i+=2;
                }
                else {
                    
                    totalAdd+=2;
                    i++;
                }
            }
            else if(ch=='b'){
                
                totalAdd++;   // b se pahele a aata hai so we it manuulay here on top
                
                if(i+1<n && s.charAt(i+1)=='c')
                    i+=2;
                
//                 else if(i+1<n && s.charAt(i)=='a'){
                    
//                     totalAdd++;
//                     i++;
//                 }
                else{
                    
                    totalAdd++;
                    i++;
                }
            }
            else if(ch=='c'){ 
                
                totalAdd+=2;
                i++;
            }
        }
        return totalAdd;
    }
}

