import java.util.*;
import java.util.PriorityQueue;

/*
 * Create the Student and Priorities classes here.
 */
class Student{
    private int id;
    private String name;
    private float cgpa;

    public Student(int id, String name, float cgpa){
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }

    public int getID(){
        return this.id;
    }

    public String getName(){
        return this.name;
    }

    public double getCgpa(){
        return this.cgpa;
    }


}

class Priorities{


    public List<Student> getStudents(List<String> events){

        PriorityQueue < Student > student_queue = new PriorityQueue(Comparator.comparing(Student::getCgpa).reversed().thenComparing(Student::getName).thenComparing(Student::getID));

        List<Student> stu = new ArrayList<> ();
        for(String e: events){  //Scanner还能这么用。。长见识了，省了一大堆字符串字符数组操作
            Scanner in = new Scanner(e);
            String event = in.next();
            if(event.startsWith("ENTER")){
                String name = in.next();
                float cgpa = in.nextFloat();
                int id = in.nextInt();

                Student student = new Student(id, name, cgpa);
                student_queue.add(student);
            }else{
                Student first = student_queue.poll();
            }in.close();
        }
        Student first = student_queue.poll();
        if (first == null){
            return stu;
        }else{
            while(first!=null) {
                stu.add(first);
                first = student_queue.poll();
            }
            return stu;
        }
    }
}

public class Solution {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }
}