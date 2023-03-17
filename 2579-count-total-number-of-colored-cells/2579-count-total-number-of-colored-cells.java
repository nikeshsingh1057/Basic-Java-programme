class Solution {
    public long coloredCells(int n) {
        
        int t = n-1;
        long ans = 1l*n*n + 1l*t*t;      // here we multiply with 1l to make it proper long
        return (long)ans;
    }
}