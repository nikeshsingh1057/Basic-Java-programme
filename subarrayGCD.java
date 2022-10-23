//  Number of Subarrays With GCD Equal to K

// Java implementation of the approach
class Main
{

// Function to return the required count
static int cntSubArr(int []arr, int n, int k)
{
	// To store the final answer
	int ans = 0;
    int count=0;
	for (int i = 0; i < n; i++)
	{

		// To store the GCD starting from
		// index 'i'
		int curr_gcd = 0;

		// Loop to find the gcd of each subarray
		// from arr[i] to arr[i...n-1]
		for (int j = i; j < n; j++)
		{
			curr_gcd = __gcd(curr_gcd, arr[j]);
            System.out.print(curr_gcd+"  ");
			// Increment the count if curr_gcd = 1
			ans += (curr_gcd == k) ? 1 : 0;
		}
	}
	System.out.print(count+"   ");

	return ans;
}

static int __gcd(int a, int b)
{
	if (b == 0)
		return a;
	return __gcd(b, a % b);	
}

// Driver code
public static void main(String []args)
{
	int arr[] = {9,3,1,2,6,3};
	int n = arr.length;
    int k=3;    // to check with equal.
	System.out.print(cntSubArr(arr, n, k));
}
}

