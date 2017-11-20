import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.*;
import java.io.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

class Java_Hashset {
    public static void main(String[] argh) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String[] pair_left = new String[t];
        String[] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        Set<String> hset = new HashSet<String>();
        for(int i = 0; i<t; i++){
            hset.add(pair_left[i]+" "+pair_right[i]);
            System.out.println(hset.size());
        }
    }
}