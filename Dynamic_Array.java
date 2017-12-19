import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dynamic_Array {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);

        int lastAnswer = 0;

        int N = in.nextInt();
        int Q = in.nextInt();

        //int arr[][] = new int[99][99];
        List[] arrList = new List[N];
        for(int i = 0; i<N; i++){
            arrList[i] = new ArrayList();
        }
        //ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();

        for(int i = 0; i<Q; i++){
            int query = in.nextInt();
            int x = in.nextInt();
            int y = in.nextInt();
            int index = (x^lastAnswer)%N;

            if(query == 1){
                arrList[index].add(y);
            }else{
                int indux = y%(arrList[index].size());
                lastAnswer = (int) arrList[index].get(indux);
                System.out.println(lastAnswer);
            }
//            System.out.println();
//            System.out.println(arrList[0]);
//            System.out.println(arrList[1]);
//            System.out.println(lastAnswer);
//            System.out.println();
        }

    }
}