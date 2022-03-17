// searching in infinity array .

public class infinitysearch
{
	public static void main(String[] args) {
	    int[] arry={1,2,4,5,6,8,9,10,11,12,14,16,25,30,45};
	   int target=25;
	    int ans=findpos(arry,target); 
		System.out.println(ans);
	}
	public static int findpos(int [] arry,int target)
	{ 
	    int start=0 ,end=1;
	    while (arry[end]<target)  // this loop for finding range of start and end of array where element lie.
	    {
	            start=end;
	            end=2*end;
	    }
	    return binary(arry,start,end,target);
	}
	public static int binary(int[] arry,int start,int end,int target)
	{ 
	   int mid=0;
	    while(start<=end)
	    {
	        mid=start+(end-start)/2;
	        if(target==arry[mid])
	        return mid;
	        else if(target<arry[mid])
	        end=mid-1;
	        else if(target>arry[mid])
	        start=mid+1;
	    }
	    return -1;
	}
}
