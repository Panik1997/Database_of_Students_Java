import java.io.*;
import java.sql.SQLOutput;
import java.util.*;

public class Main {

    /*public static void add_student(List<Students> all_students, Students new_student){
        all_students.add(new_student);
    }*/


    /*public static void show_students(List<Students> all_students){

        for (Students obj2 : all_students) {
            System.out.println(obj2.getStudent_id() + " " + obj2.getName() + " " + obj2.getLast_name() + " " + obj2.getDirection());
        }
    }*/

    public static void show_students() throws FileNotFoundException{
        File file_tmp = new File("student_database.txt");
        Scanner scanner = new Scanner(file_tmp);
        while(scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }

    }

    /* public static void remove_student(List<Students> all_students, int id_student){
        for(Iterator<Students> studentIterator = all_students.iterator(); studentIterator.hasNext(); ){
            Students tmp = studentIterator.next();
            int id_of_student = tmp.getStudent_id();
            if(id_of_student == id_student){
                studentIterator.remove();
            }
        }
    }*/

    public static void write_to_file(Students student_object) throws IOException{
        student_object.setStudent_ID(student_object.getStudent_id());
        try {
            FileWriter writer = new FileWriter("student_database.txt", true);
            BufferedWriter out = new BufferedWriter(writer);
            out.write(student_object.getStudent_id() + " " + student_object.getName() + " " + student_object.getLast_name() + " " + student_object.getDirection());
            out.close();
            System.out.println("Record saved!");
        } catch (Exception e){
            e.printStackTrace();
        }
    }
    

    public static void main(String[] args) throws IOException{
        boolean check = true;
        int number;
        String direction_text;
        String name_text;
        String last_name_text;
        List<Students> list_of_students = new LinkedList<>();
        Scanner num = new Scanner(System.in);

        while(check){
            System.out.println("Choose an option below:\n1. Show list of students\n2. Add a student\n3. Delete a student\n4. Exit\n");
            number = num.nextInt();
            switch(number){
                case 1:
                    show_students();
                    break;

                case 2:
                    Scanner temp = new Scanner(System.in);
                    System.out.println("Adding new student\nDirection: ");
                    direction_text = temp.nextLine();
                    System.out.println("Name: ");
                    name_text = temp.nextLine();
                    System.out.println("Last name: ");
                    last_name_text = temp.nextLine();
                    Students temp_obj = new Students(name_text, last_name_text, direction_text);
                    write_to_file(temp_obj);

                    /* add_student(list_of_students, new Students(direction_text, name_text, last_name_text));*/
                    break;

                case 3:
                    Scanner temp1 = new Scanner(System.in);
                    System.out.println("Deleting student\nId of a student: ");
                    //id_of_student = temp1.nextInt();

                    // remove_student(list_of_students, id_of_student);
                    break;

                case 4:
                    
                    check = false;
                    break;
            }
        }
    }
}
