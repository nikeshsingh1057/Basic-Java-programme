//to print range of charector b/w two charctor.

public class charrange {
    public static void charRange(char ch1, char ch2){   //ch1 is charactor 1 and ch2 is charactor 2;

        int count=0;
      while(ch1<=ch2){
          count++;
          System.out.print(ch1+" "); 
          if(count==5){
              System.out.print("\n");
              count=0;
          }
          ch1++;
      }
    }
    public static void main(String[] args){
        charRange('*','z');         // it will catch itself 
    }
}
