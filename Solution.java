import java.io.*;
import java.util.*;
public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        if(scan.hasNext()){
            String s = scan.nextLine();

            String[] items = s.trim().split("[ !,?.\\_'@]+");

            if(s == ""){
                System.out.println("0");
            }
            else if(s.length() > 400000){
                return;
            }
            else{
               System.out.println(items.length);
            }

            for(int i =0; i< items.length; i++){
                System.out.println(items[i]);
            }
        }else{
            System.out.println("0");
        }
        scan.close();
    }
}
