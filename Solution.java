import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        //List<Integer> row[] = new ArrayList<>();
        //List<Integer> arr = new ArrayList<>();
        int[][] arr = new int[6][6];
        for(int n = 0; n<6; n++){
            for(int m = 0; m<6; m++){
                arr[n][m] = in.nextInt();
            }
        }
        //System.out.print(arr);
        int re = -999999999;
        for(int i =0; i<4; i++){
            for(int u = 0; u<4; u++){
                int sum = arr[i][u] + arr[i][u+1] + arr[i][u+2] + arr[i+1][u+1] + arr[i+2][u] + arr[i+2][u+1] + arr[i+2][u+2];
                re = sum>re?sum:re;
            }
        }
        System.out.println(re);

    }
}