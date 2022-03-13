
//leet code ceil vale finding from array.
// floor - gretest number smaller or equal to target.
public class floor
{
	public static void main(String[] args) {
		int[] arry ={4,5,6,7,8,10,12,23,34,56,67,88};
		int target=32;
		int ans=binarySearch(arry,target);
		System.out.println(arry[ans]);
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
	        else 
			return mid;
	    }
	    return end;
	}
}
