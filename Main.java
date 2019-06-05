import java.util.*;

public class Main {
    public static void add_student(List<Students> all_students, Students new_student){
        all_students.add(new_student);
    }

    public static void show_students(List<Students> all_students){

        for(Iterator<Students> studentsIterator = all_students.iterator(); studentsIterator.hasNext(); ){
            Students obj2 = studentsIterator.next();
            System.out.println(obj2.getStudent_id() + " " + obj2.getDirection() + " " + obj2.getName() + " " + obj2.getLast_name());
        }
    }

    public static void remove_student(List<Students> all_students, int id_student){
        for(Iterator<Students> studentIterator = all_students.iterator(); studentIterator.hasNext(); ){
            Students tmp = studentIterator.next();
            int id_of_student = tmp.getStudent_id();
            if(id_of_student == id_student){
                studentIterator.remove();
            }
        }
    }

    public static void main(String[] args){
        boolean check = true;
        int number;
        String direction_text;
        String name_text;
        String last_name_text;
        List<Students> list_of_students = new LinkedList<>();
        int id_of_student;
        Scanner num = new Scanner(System.in);

        while(check){
            System.out.println("Choose an option below:\n1. Show list of students\n2. Add a student\n3. Delete a student\n4. Exit\n");
            number = num.nextInt();
            switch(number){
                case 1:

                    show_students(list_of_students);
                    break;

                case 2:
                    Scanner temp = new Scanner(System.in);
                    direction_text = temp.nextLine();
                    name_text = temp.nextLine();
                    last_name_text = temp.nextLine();

                    add_student(list_of_students, new Students(direction_text, name_text, last_name_text));
                    break;

                case 3:
                    Scanner temp1 = new Scanner(System.in);
                    id_of_student = temp1.nextInt();

                    remove_student(list_of_students, id_of_student);
                    break;

                case 4:

                    check = false;
                    break;
            }
        }
    }
}
