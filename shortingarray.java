
// shorting array element in java.
import java.util.*;

public class shortingarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array");
        int a = sc.nextInt();
        System.out.println("enter " + a + " element in array");
        int[] arry;
        arry = new int[a];
        for (int i = 0; i < arry.length; i++)
            arry[i] = sc.nextInt();
        System.out.println("orignal array");
        for (int i = 0; i < arry.length; i++)
            System.out.print(arry[i] + " ");
        for (int i = 0; i < a; i++) {
            for (int j = i+1; j < a; j++) {
                if (arry[i] > arry[j]) {
                    int temp = arry[i];
                    arry[i] = arry[j];
                    arry[j] = temp;
                }
            }
        }
        System.out.println("upadated  array");
       for(int i = 0;i < a;i++)
       System.out.print(arry[i] + " ");

    }
}
