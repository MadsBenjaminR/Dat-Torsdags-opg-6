import java.util.ArrayList;

public class Teacher extends Person{


    ArrayList<String> CanTeach = new ArrayList<>();
    ArrayList<String> CurrentCourses = new ArrayList<>();

    Teacher(String name, ArrayList<String> CanTeach){
        super(name);
        this.CanTeach = CanTeach;
    }


    @Override
    public boolean addCourse(String course) {

        for (int i = 0; i < CanTeach.size(); i++) {
            if (CanTeach.get(i).equals(course)) {
                return false;
            }
        }
        for (int i = 0; i < CurrentCourses.size(); i++) {
            if (CurrentCourses.get(i).equals(course)) {
                return false;
            }

        }
        CurrentCourses.add(course);
        return true;

    }
}
