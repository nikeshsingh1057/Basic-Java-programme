class Solution {
    public int minimumRounds(int[] tasks) {
        
        HashMap<Integer,Integer> hs=new HashMap<>();
        
        for(int i=0;i<tasks.length;i++)
        {
            hs.put(tasks[i],hs.getOrDefault(tasks[i],0)+1);
        }
        
        int count=0;
        
        for (Map.Entry<Integer,Integer> mapElement : hs.entrySet()) {
            
            int key = mapElement.getKey();
            
            if(hs.get(key)<2)
                return -1;
            
            int a = hs.get(key);
            
            count+=a/3;
            a=a%3;
            
            if(a>0)
                count+=1;
        }
        return count;
    }
}