//find missing number leet code(268)

import java.util.*;
public class leetcode268
{
  public static void main (String[]args)
  {
    int[] arry = {3,0,1};
   
    System.out.println(ans(arry));
  }
  public static int ans (int[]arry){
       Arrays.sort(arry);            // function to short array in java.
      for(int i=0;i<arry.length;i++)
      {
          if(arry[i]!=i)
          return i;
      }
      return arry.length;
  }
  
}
