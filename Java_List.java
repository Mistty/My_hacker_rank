import java.io.*;
import java.util.*;

public class Java_List {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i<N; i++){
            list.add(i, in.nextInt());
        }
        List<Integer> listQ = new ArrayList<Integer>();
        int Q = in.nextInt();
        for(int i =0; i<Q; i++){
            String qry = in.next();

            if(qry.startsWith(("Insert"))){
                for(int u = 0; u<2; u++){
                    listQ.add(u, in.nextInt());
                }
                list.add(listQ.get(0), listQ.get(1));
            }else if(qry.startsWith("Delete")){
                list.remove(in.nextInt());
            }
        }

        for(int i =0; i<list.size(); i++){
            System.out.print(list.get(i)+" ");
        }

    }
}
