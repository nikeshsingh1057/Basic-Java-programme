class Solution {
    public int[] asteroidCollision(int[] arr) {
        
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
                           
                           if(st.empty()==true){ // to handle [10 2 7 -15]
                              st.push(arr[i]);
                              break;}
                       }
                    
                       else if(st.peek()==-arr[i])
                       {
                           st.pop();
                           break;
                       }
                }
            }
        }
        // storing answer
        int ans[]=new int[st.size()];
        
        for(int i=0;i<ans.length;i++)
            ans[i]=st.pop();
        
        reverse(ans);   // reversing answer
        return ans;
    }
    // function to reverse array
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