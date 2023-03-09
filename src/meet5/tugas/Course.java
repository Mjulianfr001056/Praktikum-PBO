package meet5.tugas;

import java.util.ArrayList;

public class Course {
    private String name;
    private String id;
    private float hours;
    private ArrayList<Lecturer> lecturer_list;

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

    public ArrayList<Lecturer> getLecturer_list() {
        return lecturer_list;
    }

    public void add_lecturer(Lecturer lecturer){
        lecturer_list.add(lecturer);
    }
}
