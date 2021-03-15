package CollageManagement;

public class Department {

    private int id;
    private String Name;

    public Department(int id, String Name) {
        this.id = id;
        this.Name = Name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    @Override //anotation
    public String toString() {
        return Name;
    }

}
