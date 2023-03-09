package meet5.tugas;

import java.util.ArrayList;

public class Lecturer extends Research_Associate{
    private ArrayList<Course> course_taught;

    public Lecturer(String ssNo, String name, String email, String fieldOfStudy) {
        super(ssNo, name, email, fieldOfStudy);
    }

    public ArrayList<Course> getCourse_taught() {
        return course_taught;
    }

    public void add_course(Course course){
        course_taught.add(course);
    }
}
