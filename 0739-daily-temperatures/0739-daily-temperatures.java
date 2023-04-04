class Solution {
    public int[] dailyTemperatures(int[] arr) {
        
        // varitation of  next greater element just put only count of element 

        Stack<Integer> st=new Stack<>();
        
        int [] ans=new int[arr.length];
		
		for(int i=0;i<arr.length;i++)
		{
			while(!st.isEmpty() && arr[i]>arr[st.peek()]) {
				
                int idx=st.pop();
                
				ans[idx]=i-idx;
			}
			st.push(i);    // pushing index.
		}
        return ans;
    }
}