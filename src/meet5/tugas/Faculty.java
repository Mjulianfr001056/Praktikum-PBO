package meet5.tugas;

import java.util.ArrayList;
import java.util.HashMap;

public class Faculty {
    private Employee dean;
    private String name;
    private HashMap<String, Institute> institutes_list = new HashMap<>();

    public Faculty() {
        name = "N/A";
    }

    public Faculty(String name) {
        this.name = name;
    }

    public Employee getDean() {
        return dean;
    }

    public void setDean(Employee dean) {
        this.dean = dean;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addInstitute(String name, String address){
        institutes_list.put(name, new Institute(name, address));
    }

    public Institute findInstitute(String name){
        return institutes_list.get(name);
    }

}
