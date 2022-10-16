// Sum of Number and Its Reverse

class Solution {
    public boolean sumOfNumberAndReverse(int num) {
        
        for(int i=0;i<=num;i++)
        {
            if((i+reverse(i))==num)
                return true;
            
        }
        return false;
    }
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
