import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


import java.util.*;

class Students implements Comparable<Students>{
    private int id;
    private String fname;
    private double cgpa;
    public Students(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
    @Override
    public int compareTo(Students st){
        if(this.getCgpa() == st.getCgpa()){
            return this.getFname().compareTo(st.getFname());
        }else{
            if(this.getCgpa() - st.getCgpa() > 0){
                return -1;
            }else{
                return 1;
            }
        }
    }
}

//Complete the code
public class Java_Sort
{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Students> studentList = new ArrayList<Students>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Students st = new Students(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        Collections.sort(studentList);

        for(Students st: studentList){
            System.out.println(st.getFname());
        }
    }
}
