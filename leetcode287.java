
// find the dublicate number (leet code 287)
import java.util.*;
public class leetcode287
{
  public static void main (String[]args)
  {
    int[] arry = {1,3,4,2,4};

    System.out.println(ans(arry));
    System.out.println(Arrays.toString(arry));
  }
  public static int ans (int[]arry){
       Arrays.sort(arry);            // function to short array in java.
      for(int i=0;i<arry.length-1;i++)
      {
          if(arry[i]==arry[i+1])
          return arry[i];
      }
      return arry.length;
  }

}