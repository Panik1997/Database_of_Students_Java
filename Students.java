public class Students extends University {
    private static int student_ID = 1;
    private int student_id;
    private String name;
    private String last_name;

    public Students(String direction, String name, String last_name) {
        super(direction);
        this.student_id = student_ID++;
        this.name = name;
        this.last_name = last_name;

    }

    public String getName() {
        return name;
    }

    public String getLast_name() {
        return last_name;
    }

    public int getStudent_id(){
        return student_id;
    }
}
