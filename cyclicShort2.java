// Cyclic shorting of arry note this is will work if array is starting from 1 
import java.util.*;
public class cyclicShort2 {
    public static void main(String[] args){
        int [] arry={2,7,3,4,6,1,5};
        shorting(arry);   // for shorting arry in assending order.
        System.out.println(Arrays.toString(arry));
    }
    public static void shorting(int [] arry){
        int i=0,index;
        while(i<arry.length)
        {
            index=arry[i]-1;
            if(arry[i]!=arry[index])  // we can swap here also.
            swap(arry,i,index);
            else
            i++;
        }
    }
    public static void swap(int[] arry, int i, int index){
        int temp= arry[i];       //if index not at correct place then we swap it.
        arry[i]=arry[index];
        arry[index]=temp;
    }
}
