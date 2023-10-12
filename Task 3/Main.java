import java.util.ArrayList;

public class Main {

    public static void main(String [] args){

        ArrayList<String> student1Courses = new ArrayList<>();
        student1Courses.add("Math");
        student1Courses.add("Danish");
        student1Courses.add("PE");

        Student s1 = new Student("Adolf", student1Courses);


        ArrayList<String> student2Courses = new ArrayList<>();
        student2Courses.add("Math");
        student2Courses.add("Danish");

        Student s2 = new Student("Benny" , student2Courses);


        ArrayList<String> student3Courses = new ArrayList<>();
        student3Courses.add("Math");

        Student s3 = new Student("Charlie" , student3Courses);



        ArrayList<String> teacher1Courses = new ArrayList<>();
        teacher1Courses.add("Math");
        teacher1Courses.add("Danish");

        Teacher t1 = new Teacher("Mr Mercedes", teacher1Courses);

        ArrayList<String> teacher2Courses = new ArrayList<>();
        teacher2Courses.add("Math");
        teacher2Courses.add("PE");

        Teacher t2 = new Teacher("Anja", teacher2Courses);

        ArrayList<String> teacher3Courses = new ArrayList<>();
        teacher3Courses.add("PE");
        teacher3Courses.add("Danish");

        Teacher t3 = new Teacher("Brian", teacher3Courses);

        ArrayList<Person> persons = new ArrayList<>();
        persons.add(s1);
        persons.add(s2);
        persons.add(s3);
        persons.add(t1);
        persons.add(t2);
        persons.add(t3);

        for(int i = 0; i < persons.size(); i++ ){
            persons.add("Java 1.0");
        }




    }
}
