package CollageManagement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;

/**
 *
 * @author Atif Hyder
 */
public class EnrollmentTableOperations {

    private Connection con = null;

    public EnrollmentTableOperations() {
        con = DBConnection.Connect();
    }

    public int insert(String date, int deptId, int crsID, int stdnID) {

        int r = 0;
        String query = "insert into enrollments( date, deptID,crsID,stdnID) values ('" + date + "'," + deptId + "," + crsID + "," + stdnID + ")";

        if (con == null) {
            System.out.println("database not connected");
        } else {
            try {
                Statement st = con.createStatement();
                r = st.executeUpdate(query);
            } catch (SQLException ex) {
                System.out.println("error in insert");
            }
        }

        return r;

    }

    public int update(int id, String date, int deptId, int crsID, int stdnID) {

        int r = 0;
        String query = "update enrollments set date='" + date + "', deptID=" + deptId + " crsID=" + crsID + "stdnID=" + stdnID + " where id=" + id;

        if (con == null) {
            System.out.println("database not connected");
        } else {
            try {
                Statement st = con.createStatement();
                r = st.executeUpdate(query);
            } catch (SQLException ex) {
                System.out.println("error in update");
            }
        }

        return r;

    }

    public int delete(int id) {

        int r = 0;
        try {
            String query = "delete from enrollments where id=" + id;
            Statement st = con.createStatement();
            r = st.executeUpdate(query);
        } catch (SQLException d) {
            System.out.print("Error in Delete " + d.getMessage());
        }
        return r;
    }

    public Vector<Enrollment> viewAll() {

        Vector<Enrollment> list = new Vector<Enrollment>();

        try {
//            String query = "select id, name , price from students";
            String query = "SELECT enrollments.id,enrollments.date,departments.name,courses.name,students.name FROM enrollments JOIN departments ON (enrollments.deptID=departments.id) JOIN courses ON (enrollments.crsID=courses.id) JOIN students ON (enrollments.stdnID=students.id)";
            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {

                list.add(new Enrollment(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5)));
            }

        } catch (SQLException e) {
            System.out.print("Error in Select " + e.getMessage());
        }

        return list;
    }//

    public String datime() {

        SimpleDateFormat sdf = new SimpleDateFormat("dd-MMMM-yy" + " hh:mm a");

        Date dt1 = new Date();
        String dts1 = sdf.format(dt1);

        return dts1;

    }

}
