import java.util.*;

public class Main {
    public static void add_student(Students new_student, List<Students> list){
        list.add(new_student);
    }

    public static void show_students(List<Students> all_students){

        for(Iterator<Students> studentsIterator = all_students.iterator(); studentsIterator.hasNext(); ){
            Students obj2 = studentsIterator.next();
            System.out.println(obj2.getStudent_id() + " " + obj2.getDirection() + " " + obj2.getName() + obj2.getLast_name());
        }
    }
    public static void main(String[] args){
        List<Students> obj1 = new LinkedList<>();
        
        obj1.add(new Students("Computer Science", "Jack", "Sparrow"));
        add_student(new Students("Science", "John", "Travolta"), obj1);
        add_student(new Students("sfdafas", "aaa", "sdasa"), obj1);
        show_students(obj1);

    }
}
