import java.util.*;

//Complete the code
public class Java_Deque
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();
        /*
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            list.add(num);
        }
        */

        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i<n; i++){
            map.put(i, in.nextInt());
        }


        int count = 0;
        Set<Integer> set = new HashSet<>();
        for(int i =0; i<n-m+1; i++){
            for(int u=0; u<m; u++){
                set.add(map.get(i+u));
            }
            count = count>set.size()?count:set.size();
            set.clear();
        }
        System.out.println(count);
    }

}

/*
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        HashSet<Integer> set = new HashSet<>();

        int n = in.nextInt();
        int m = in.nextInt();
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int input = in.nextInt();

            deque.add(input);
            set.add(input);

            if (deque.size() == m) {
                if (set.size() > max) max = set.size();
                int first = deque.remove();
                if (!deque.contains(first)) set.remove(first);
            }
        }

        System.out.println(max);
    }
}
 */

