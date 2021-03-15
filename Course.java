package CollageManagement;
/**
 *
 * @author Atif Hyder
 */
public class Course {

    private int id;
    private String name;
    private int deptID;
    private String deptName;

    public Course(int id, String name, int deptID) {
        this.id = id;
        this.name = name;
        this.deptID = deptID;
    }

    public Course(int id, String name, String deptName) {
        this.id = id;
        this.name = name;
        this.deptName = deptName;
    }

    public Course(int id, String name) {
        this.id = id;
        this.name = name;
    }

    
    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDeptID() {
        return deptID;
    }

    public void setDeptID(int deptID) {
        this.deptID = deptID;
    }

    @Override
    public String toString() {
        return  name ;
    }

}
