// Leet code max wealth.
public class MaxWelth {
    public static void main(String[] args) {
        int[][] arry = {
                { 1, 3, 4, 0 },
                { 0, 40, 0 },
                { 7, 5, 6, 0 } };
             int a=check(arry);
             System.out.print(a);
        }
        static int check(int[][] arry){
            int i,j,max=0,s;
            for(i=0;i<arry.length;i++){
                s=0;
                for(j=0;j<arry[i].length;j++){
                    s+=arry[i][j];
                    if(s>max)
                    max=s;
                }
            }
            return max;
        }
}
