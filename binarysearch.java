
//bianry search in java
public class binarysearch
{
	public static void main(String[] args) {
		int[] arry ={4,5,6,7,8,10,12,23,34,56};
		int target=34;
		int ans=binarySearch(arry,target);
		System.out.println(ans);
	}
	static int binarySearch(int [] arry ,int target){
	    int start=0,end=arry.length-1,mid=0;
	 
	    while(start<=end)
	    {
	       mid=start+(end-start)/2;
	        
	        if(target<arry[mid])
	        end=mid-1;
	        else if(target>arry[mid])
	        start=mid+1;
	        else if(target==arry[mid])
	         return mid;
	    }
	    return -1;
	}
}
