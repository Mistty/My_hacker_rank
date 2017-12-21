import java.io.*;
import java.util.*;

public class Sparse_Arrays {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        List<String> arr = new ArrayList<>();
        for(int i = 0; i<N; i++){
            arr.add(in.next());
        }
        int Q = in.nextInt();
        for(int i = 0; i<Q; i++){
            int count = 0;
            String s = in.next();
            for(int u = 0; u<N; u++){
                if(s.equals(arr.get(u))){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}