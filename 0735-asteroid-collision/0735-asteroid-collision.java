class Solution {
    public int[] asteroidCollision(int[] arr) {
        
        if(arr.length==2 && arr[0] == -arr[1])
            return new int[0];
            
        Stack<Integer> st=new Stack<>();
        
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>0)
                st.push(arr[i]);
            
            else
            {
                if(st.empty()==true && arr[i]<0){
                    st.push(arr[i]); 
                    continue;
                }
                if(st.empty()==false && st.peek()<0){
                    st.push(arr[i]); 
                    continue;
                }
                
                while(st.empty()==false)
                {
                    // if both is -ve
                        if(st.peek()< 0 && arr[i]<0){
                            st.push(arr[i]);
                            break;
                        }

                        // if one is +ve ans other is -ve
                       else if(st.peek()>-arr[i])
                           break;

                        // if one is +ve ans other is -ve
                       else if(st.peek()<-arr[i]){
                           st.pop();
                           
                           if(st.empty()==true){
                              st.push(arr[i]);
                              break;}
                       }
                       else if(st.peek()==-arr[i])
                       {
                           st.pop();
                           break;
                       }
                }
                
                // if(st.empty()==true)
                //     st.push(arr[i]);
            }
        }
        
        int ans[]=new int[st.size()];
        
        for(int i=0;i<ans.length;i++)
            ans[i]=st.pop();
        
        reverse(ans);
        return ans;
    }
    // reverse ans array function.
    public static void reverse(int[] arr)
    {
        int i=0,j=arr.length-1;
        while(i<j)
        {
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++; j--;
        }
    }
}