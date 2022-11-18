class Solution {
public int numSubarrayProductLessThanK(int[] arr, int k) {
int product=1;
int ans=0;
int j=0;
for(int i=0;i<arr.length;i++)
{
product*=arr[i];
while(product>=k && j<arr.length)
{
product/=arr[j];
j++;
}
ans += i-j+1;
}
if(ans<0)
return 0;
return ans;
}
}