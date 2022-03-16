// 
import java. util.*;
public class leetcode34 {
    public static void main(String[] args) {
		int[] arry ={4,4,5,5,5,5,12,23,32,56}; // binary search only took in shorted array.
		int target=5;
		int [] ans=binarySearch(arry,target);  // we are returning array.
		System.out.println(Arrays.toString(ans));
	}
	static int [] binarySearch(int [] arry ,int target){
	    int start=0,end=arry.length-1,mid=0;
	      int c=-1,d=-1;
	    while(start<=end)
	    {
	       mid=start+(end-start)/2;
	        
	        if(target==arry[mid])       // we use two binary search to get first and last position.
            {
               c=mid;
	           end=mid-1;
            }
	        else if(target<arry[mid])
	        end=mid-1;
	        else if(target>arry[mid])
	         start=mid+1;
	    }
         start=0;                 // sabko zero kar diye dubara se search karne ke liye.
         end=arry.length-1;  mid=0;
	    while(start<=end)
	    {
	       mid=start+(end-start)/2;
	        
	        if(target==arry[mid])
            {
               d=mid;
	           start=mid+1;
            }
	        else if(target<arry[mid])
	        end=mid-1;
	        else if(target>arry[mid])
	         start=mid+1;
	    }
        return new int[] {c,d};
	}
}
