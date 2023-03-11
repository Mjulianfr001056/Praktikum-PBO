package meet5.tugas;

import java.util.ArrayList;

public class Course {
    private String name;
    private String id;
    private float hours;

    public Course(String name, String id, float hours) {
        this.name = name;
        this.id = id;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public float getHours() {
        return hours;
    }

    public void setHours(float hours) {
        this.hours = hours;
    }

    @Override
    public String toString() {
        return "Course[" +
                "name=" + name +
                ",id=" + id +
                ",hours=" + hours +
                ']';
    }
}
