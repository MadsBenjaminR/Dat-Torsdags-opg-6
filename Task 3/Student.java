import java.util.ArrayList;
public class Student extends Person {


    ArrayList<String> PassedCourses = new ArrayList<>();
    ArrayList<String> CurrentCourses = new ArrayList<>();

    public Student(String name, ArrayList<String> PassedCourses) {
        super(name);
        this.PassedCourses = PassedCourses;
    }

    @Override
    public boolean addCourse(String course) {

        for (int i = 0; i < PassedCourses.size(); i++) {
            if (PassedCourses.get(i).equals(course)) {
                return false;
            }
        }
        for (int i = 0; i < CurrentCourses.size(); i++) {
            if (PassedCourses.get(i).equals(course)) {
                return false;
            }

        }
        CurrentCourses.add(course);
            return true;

    }
}

