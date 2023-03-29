class Solution {
    public int maximalRectangle(char[][] matrix) {
        
        int max=0;
		
		int ans[]=new int[matrix[0].length];
		
		for(int i=0;i<matrix[0].length;i++)
			ans[i]=matrix[matrix.length-1][i]-'0'; // last matrix se base bana rahe hai histo ke liye
        max=Area(ans);
        for(int i=matrix.length-2;i>=0;i--) {
		
			max=Math.max(max, histogram(matrix[i],ans));
		}
        return max;
    }
    public static int histogram(char arr[],int[] ans)
	{
		int max=0;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]-'0'==1)
			{
				ans[i]=ans[i]+1;
			}
			else {
				ans[i]=0;
			}
		}
        
		max=Math.max(max,Area(ans));
		return max;
	}
	// function to calculate maximum area. (histogram ka code hai)
	public static int Area(int [] arr) {
		
		int ans=0;
		Stack<Integer> st=new Stack<>();
		
		for(int i=0;i<arr.length;i++)
		{
			while(!st.isEmpty() && arr[i]<arr[st.peek()]) {
				
				int h=arr[st.pop()];
				int r=i;
				
				if(st.isEmpty())
				{
					int a=h*r;
					ans=Math.max(ans, a);
				}
				else {
					
					int l=st.peek();
					int a=h*(r-l-1);
					ans=Math.max(ans, a);
				}
			}
			st.push(i);
		}
		int r=arr.length;
		
		while(!st.isEmpty()) {
			
			int h=arr[st.pop()];
			
			if(st.isEmpty())
			{
				int a=h*r;
				ans=Math.max(ans, a);
			}
			
			else {
				
				int l=st.peek();
				int a=h*(r-l-1);
				ans=Math.max(ans, a);
			}
		}
		return ans;
		
	}
}