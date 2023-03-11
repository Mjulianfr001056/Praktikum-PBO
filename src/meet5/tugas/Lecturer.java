package meet5.tugas;

import java.util.ArrayList;

public class Lecturer extends Research_Associate{

    public Lecturer(String ssNo, String name, String email, String fieldOfStudy) {
        super(ssNo, name, email, fieldOfStudy);
    }

    public Lecturer(String ssNo, String name, String email, String fieldOfStudy, double realTeachingHour) {
        super(ssNo, name, email, fieldOfStudy, realTeachingHour);
    }

    @Override
    public String toString() {
        return "Lecturer[" + super.toString() +
                ",Attendance= " + String.format("%.2f", super.getAttendance()) + '%' +
                "]";
    }
}
