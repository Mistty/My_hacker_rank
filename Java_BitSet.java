import java.io.*;
import java.util.*;

public class Java_BitSet {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);
        for(int i=0; i<n; i++){
            b1.set(i, false);
            b2.set(i, false);
        }

        //System.out.println(b1);

        for(int i =0; i<m; i++){
            String op = in.next();
            int s1 = in.nextInt();
            int s2 = in.nextInt();

            switch(op) {
                case "AND":
                    if(s1 == 1){
                        if(s2 == 1){
                            b1.and(b1);
                        }else{
                            b1.and(b2);
                        }
                    }else{
                        if(s2 == 1){
                            b2.and(b1);
                        }else{
                            b2.and(b2);
                        }
                    }
                    break;

                case "OR":
                    if(s1 == 1){
                        if(s2 == 1){
                            b1.or(b1);
                        }else{
                            b1.or(b2);
                        }
                    }else {
                        if (s2 == 1) {
                            b2.or(b1);
                        } else {
                            b2.or(b2);
                        }
                    }
                    break;

                case "XOR":
                    if(s1 == 1){
                        if(s2 == 1){
                            b1.xor(b1);
                        }else{
                            b1.xor(b2);
                        }
                    }else {
                        if (s2 == 1) {
                            b2.xor(b1);
                        } else {
                            b2.xor(b2);
                        }
                    }
                    break;

                case "FLIP":
                    if(s1==1){
                        b1.flip(s2);
                    }else{
                        b2.flip(s2);
                    }
                    break;

                case "SET":
                    if(s1==1){
                        b1.set(s2);
                    }else{
                        b2.set(s2);
                    }
                    break;

                default:
                    break;

            }
            System.out.println(b1.cardinality()+" "+b2.cardinality());

        }

    }
}