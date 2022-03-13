
// Display Two D array;
public class array2d {
    public static void main(String[] args) {
        int[][] arry = {
                { 1, 33, 45, 54 },
                { 32, 35, 64 },
                { 67, 45, 86, 86 } };
             Display(arry);
    }

  static void Display(int[][] arry){
      int i,j;
  for(i=0;i<arry.length;i++)
  {
      for(j=0;j<(arry[i].length);j++)
      System.out.print(arry[i][j]+ " ");
      System.out.print("\n");
  }
}
}
