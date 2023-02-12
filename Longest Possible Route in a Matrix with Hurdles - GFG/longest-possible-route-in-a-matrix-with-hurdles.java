//{ Driver Code Starts
import java.io.*;
import java.util.*;


class IntArray
{
    public static int[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = Integer.parseInt(s[i]);
        
        return a;
    }
    
    public static void print(int[] a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
    
    public static void print(ArrayList<Integer> a)
    {
        for(int e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}


class IntMatrix
{
    public static int[][] input(BufferedReader br, int n, int m) throws IOException
    {
        int[][] mat = new int[n][];
        
        for(int i = 0; i < n; i++)
        {
            String[] s = br.readLine().trim().split(" ");
            mat[i] = new int[s.length];
            for(int j = 0; j < s.length; j++)
                mat[i][j] = Integer.parseInt(s[j]);
        }
        
        return mat;
    }
    
    public static void print(int[][] m)
    {
        for(var a : m)
        {
            for(int e : a)
                System.out.print(e + " ");
            System.out.println();
        }
    }
    
    public static void print(ArrayList<ArrayList<Integer>> m)
    {
        for(var a : m)
        {
            for(int e : a)
                System.out.print(e + " ");
            System.out.println();
        }
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int[] a = IntArray.input(br, 2);
            
            
            int[] b = IntArray.input(br, 4);
            
            
            int[][] mat = IntMatrix.input(br, a[0], a[1]);
            
            Solution obj = new Solution();
            int res = obj.longestPath(mat,a[0],a[1],b[0],b[1],b[2],b[3]);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
    
    static int ans=-1;
    static boolean f=false;
    public static int longestPath(int[][] mat,int n,int m,int xs,int ys,int xd,int yd) {
        
        f=false;
        ans=-1;
        
        MaxPath(mat,xs,ys,xd,yd,0);
        
        if(f==false)
            return -1;
            
        return ans;
    }
    public static void MaxPath(int[][] mat,int cr,int cc,int xd,int yd,int count)
    {
        if(cr==xd && cc==yd && mat[cr][cc]!=0)
        {
            f=true;
            ans = Math.max(ans,count);
            return;
        }
        
        if(cr<0 || cc<0 || cr>=mat.length || cc>=mat[0].length || mat[cr][cc]==0)
            return;
        
        mat[cr][cc]=0;
        
        int [] r= {-1,1,0,0};
        int [] c= {0,0,1,-1};
       
        for(int i=0;i<r.length;i++)
        {
            MaxPath(mat,cr+r[i],cc+c[i],xd,yd,count+1);
            
        }
         mat[cr][cc]=1;
    }
}
        
