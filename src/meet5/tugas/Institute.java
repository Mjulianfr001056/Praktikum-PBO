package meet5.tugas;

import java.util.ArrayList;

public class Institute {
    private String name;
    private String address;
    private ArrayList<Research_Associate> assigned_associate = new ArrayList<>();

    public Institute(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void assign_associate(Research_Associate assigned_associate){
        this.assigned_associate.add(assigned_associate);
    }


}
