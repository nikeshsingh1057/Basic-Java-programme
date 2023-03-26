class Solution {
    public int[] nextGreaterElements(int[] arr) {
        
        Stack<Integer> st=new Stack<>();
		
		int [] ans=new int[arr.length];
		
      	for(int i=2*arr.length-1;i>=0;i--)           
		{
			
			while(!st.isEmpty() && st.peek()<=arr[i%arr.length]) 
					st.pop();
			
			if(i<arr.length) {
				
				if(!st.isEmpty())
					ans[i]=st.peek();
				
				else
					ans[i]=-1;
			}
			
			st.push(arr[i%arr.length]);     // we are doing here i%arr.length because it will also check for circular array.
		}
        return ans;
    }
}