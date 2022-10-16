// Count Number of Distinct Integers After Reverse Operations

class Solution {
    public int countDistinctIntegers(int[] nums) {
        
        int arr[]=new int[1000001];
        
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            int check=nums[i];
            
            if(arr[check]==0)
            {
                arr[check]++;
                count++;
            }
        }
        
        for(int i=0;i<nums.length;i++)
        {
            int check=reverse(nums[i]);
            
            if(arr[check]==0)
            {   
                arr[check]++;
                count++;
            }
        }
        
        return count;
    }
  // function to reverse number.
    public static int reverse(int number)
    {
        int sum=0;
        int rem=0;
        while(number!=0)
        {
            rem=number%10;
            sum=sum*10+rem;
            number/=10;
        }
        return sum;
    }
}
