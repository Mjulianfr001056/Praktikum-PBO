package meet5.tugas;

public class Administrative_Employee extends Employee{
    private double attendance_count;

    public Administrative_Employee() {
        super();
        attendance_count = 0;
    }

    public Administrative_Employee(String ssNo, String name, String email) {
        super(ssNo, name, email);
        attendance_count = 0;
    }

    public Administrative_Employee(String ssNo, String name, String email, double attendance_count) {
        super(ssNo, name, email);
        this.attendance_count = attendance_count;
    }

    @Override
    public double getAttendance() {
        return attendance_count/25 * 100;
    }

    public void attend(){
        attendance_count++;
    }

    @Override
    public String toString() {
        return "Administrative_Employee[" + super.toString() +
                ", attendance=" + getAttendance() + '%' +
                ']';
    }
}
