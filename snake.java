
// Snake Gun and water game:
import java.util.*;



public class snake {
    static int you=0, com=0;
    public static void main(String[] args) {
        int n, a;  
        System.out.println("***welcome to snake,water and gun game***");
        System.out.print("enter round:");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int randum = (int) (Math.random() * 3);
        while (n > 0) {
            System.out.println("\npress 0 for snake\npress 1 for gun\npress 2 for water");
            a = sc.nextInt();
            if (a < 3) {
                if (a == randum)
                    System.out.println("***Tie since randum is " + randum);
                else if (a == 0 && randum == 1) {
                    System.out.println("***computer is winner since random is " + randum);
                    com++;
                } else if (a == 0 && randum == 2) {
                    System.out.println("***you are winner since randum is " + randum);
                    you++;
                } else if (a == 1 && randum == 0) {
                    System.out.println("***you are winner since randum is " + randum);
                    you++;
                } else if (a == 1 && randum == 2) {
                    System.out.println("***computer is winner since random is " + randum);
                    com++;
                } else if (a == 2 && randum == 0) {
                    System.out.println("***computer is winner since random is " + randum);
                    com++;
                } else if (a == 2 && randum == 1) {
                    System.out.println("***you are winner since randum is " + randum);
                    you++;
                }
                n--;
            } else
                System.out.println("invalid input");

        }
        if(you==com)
        System.out.print("no one winner Try again both score is "+you+ " "+com);
        else if(you>com)
        System.out.print("over all you are winnner and score is "+you);
        else 
        S.print("over all computer is winner and score is "+com);ystem.out

    }
}
