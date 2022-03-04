import java.util.*;

public class twinprime {
    public static int checkPrimee(int n) {

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return 0;
        }

        return 1;
    }

    

    public static void main(String[] args) {
        System.out.print("enter range:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        for (; a < b; a++) {
            if ((checkPrimee(a) == 1) && (checkPrimee(a + 2) == 1))
                System.out.print(a + " " + (a + 2));
        }

    }
}
