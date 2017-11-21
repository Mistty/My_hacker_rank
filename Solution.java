import java.util.*;

public class Solution {
    //public static boolean canWin(int n,int leap, int[] game) {
    private static boolean canWin(int m, int[] game, int n) {
        if (n < 0 || game[n] == 1) return false;
        if ((n == game.length - 1) || n + m > game.length - 1) return true;

        game[n] = 1;
        return canWin(m, game, n + 1) || canWin(m, game, n - 1) || canWin(m, game, n + m);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n+leap];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game, 0)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
