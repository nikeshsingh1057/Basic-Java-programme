
//bianry search in java
public class leetcode852
{
	public static void main(String[] args) {
		int[] arry ={1,2,3,4,4,5,3,2,1,0};
		int ans=binarySearch(arry);
		System.out.println(ans);
	}
	static int binarySearch(int [] arry){
	    int start=0,end=arry.length-1,mid=0;
	    while(start<=end)
	    {
	       mid=start+(end-start)/2;
	       
	          if(arry[mid]>arry[mid+1]){
	          end=mid-1;}
	          else if(arry[mid]<arry[mid+1]){
	          start=mid+1;
	           }
	   
	    }
	    return start;
	}
}
