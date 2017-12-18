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
        System.out.print(arr);

        //System.out.print(arr);


    }
}