package CollageManagement;

/**
 *
 * @author Atif Hyder
 */
public class Enrollment {

    private int id;
    private String date;
    private int deptID;
    private int crsID;
    private int stdnID;

    private String deptName;
    private String crsName;
    private String stdnName;

    public Enrollment(int id, String date, int deptID, int crsID, int stdnID) {
        this.id = id;
        this.date = date;
        this.deptID = deptID;
        this.crsID = crsID;
        this.stdnID = stdnID;
    }

    public Enrollment(int id, String date, String deptName, String crsName, String stdnName) {
        this.id = id;
        this.date = date;
        this.deptName = deptName;
        this.crsName = crsName;
        this.stdnName = stdnName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getDeptID() {
        return deptID;
    }

    public void setDeptID(int deptID) {
        this.deptID = deptID;
    }

    public int getCrsID() {
        return crsID;
    }

    public void setCrsID(int crsID) {
        this.crsID = crsID;
    }

    public int getStdnID() {
        return stdnID;
    }

    public void setStdnID(int stdnID) {
        this.stdnID = stdnID;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getCrsName() {
        return crsName;
    }

    public void setCrsName(String crsName) {
        this.crsName = crsName;
    }

    public String getStdnName() {
        return stdnName;
    }

    public void setStdnName(String stdnName) {
        this.stdnName = stdnName;
    }

}
