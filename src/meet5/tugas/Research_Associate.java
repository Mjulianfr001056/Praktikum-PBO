package meet5.tugas;

import java.util.ArrayList;

public class Research_Associate extends Employee{
    protected String fieldOfStudy;
    private double teachingHour;
    private double realTeachingHour;

    public Research_Associate() {
        super();
        fieldOfStudy = "N/A";
    }

    public Research_Associate(String ssNo, String name, String email, String fieldOfStudy) {
        super(ssNo, name, email);
        this.fieldOfStudy = fieldOfStudy;
    }

    public Research_Associate(String ssNo, String name, String email, String fieldOfStudy, double realTeachingHour) {
        super(ssNo, name, email);
        this.fieldOfStudy = fieldOfStudy;
        this.realTeachingHour = realTeachingHour;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    public void setTeachingHour(ArrayList<Teaching> daftar_ajar) {
        double result = 0;
        for(Teaching t : daftar_ajar){
            if(t.getLecturer().getName().equals(super.getName())){
                result += t.getCourse().getHours();
            }
        }
        teachingHour = result;
    }

    @Override
    public double getAttendance() {
       return teachingHour == 0 ? 0 : realTeachingHour/teachingHour * 100;
    }

    @Override
    public String toString() {
        return "Research_Associate[" + super.toString() +
                ",fieldOfStudy=" + fieldOfStudy + ']';
    }
}
