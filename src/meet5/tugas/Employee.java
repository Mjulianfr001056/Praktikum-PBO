package meet5.tugas;

public abstract class Employee{
    private String ssNo;
    private String name;
    private String email;
    static protected int counter = 0;

    public Employee() {
        ssNo = "N/A";
        name = "N/A";
        email = "N/A";
        counter++;
    }

    public Employee(String ssNo, String name, String email) {
        this.ssNo = ssNo;
        this.name = name;
        this.email = email;
        counter++;
    }

    abstract public double getAttendance();

    public String getSsNo() {
        return ssNo;
    }

    public void setSsNo(String ssNo) {
        this.ssNo = ssNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static int getCounter() {
        return counter;
    }

    @Override
    public String toString() {
        return "Employee[" +
                "ssNo= " + ssNo +
                ", name='" + name +
                ", email='" + email +
                ']';
    }
}
