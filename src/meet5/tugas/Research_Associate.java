package meet5.tugas;

public class Research_Associate extends Employee{
    protected String fieldOfStudy;

    public Research_Associate() {
        super();
        fieldOfStudy = "N/A";
    }

    public Research_Associate(String ssNo, String name, String email, String fieldOfStudy) {
        super(ssNo, name, email);
        this.fieldOfStudy = fieldOfStudy;
    }

    public String getFieldOfStudy() {
        return fieldOfStudy;
    }

    public void setFieldOfStudy(String fieldOfStudy) {
        this.fieldOfStudy = fieldOfStudy;
    }

    @Override
    public double getAttendance() {
        return 0;
    }
}
