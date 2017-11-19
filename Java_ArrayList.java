import java.io.*;
import java.util.*;

public class Java_ArrayList {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        ArrayList[] a = new ArrayList[n];
        for(int i=0; i<n; i++){
            int d = in.nextInt();
            a[i] = new ArrayList();
            for(int u=0; u<d; u++){
                a[i].add(in.nextInt());
            }
        }

        int q = in.nextInt();
        for(int i=0; i<q; i++){
            int h = in.nextInt();
            int g = in.nextInt();
            try{
                System.out.println(a[h-1].get(g-1));
            }catch(Exception E){
                System.out.println("ERROR!");
            }
        }
    }
}
