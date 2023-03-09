package meet5.tugas;

public class Administrative_Employee extends Employee{
    private int attendance_count;

    public Administrative_Employee() {
        super();
        attendance_count = 0;
    }

    public Administrative_Employee(String ssNo, String name, String email) {
        super(ssNo, name, email);
        attendance_count = 0;
    }

    public Administrative_Employee(String ssNo, String name, String email, int attendance_count) {
        super(ssNo, name, email);
        this.attendance_count = attendance_count;
    }

    @Override
    public double getAttendance() {
        return 0;
    }

    public void attend(){
        attendance_count++;
    }

    @Override
    public String toString() {
        return "Administrative_Employee[" + super.toString() +
                "attendance_count=" + attendance_count +
                ']';
    }
}
