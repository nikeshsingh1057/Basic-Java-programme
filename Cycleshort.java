import java.util.*;
public class Cycleshort {   // cyclic short is valid only if array element in contigeous like [1,3,5,2,4]
    public static void main(String[] args){
    int [] arry ={3,2,4,1,5};
    shortarr(arry);
    System.out.println(Arrays.toString(arry)); // to use arrays to string use import java.util.*;

 }
   public static void shortarr(int[] arry){
        
    int i=0,temp,index;
    while(i<arry.length)
    {
        if(arry[i]!=i+1)
        {
            temp=arry[i];    //to store previous index value
            index=arry[i]-1;   // to get index of correct position.
            arry[i]=arry[index];
            arry[index]= temp;
        }
        else
        i++;
     }
  }
}
