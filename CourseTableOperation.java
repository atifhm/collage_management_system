package CollageManagement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

/**
 *
 * @author Atif Hyder
 */
public class CourseTableOperation {

    private Connection con = null;

    public CourseTableOperation() {
        con = DBConnection.Connect();
    }

    public int insert(String name, int deptId) {

        int r = 0;
        String query = "insert into courses( name, deptID) values ('" + name + "'," + deptId + ")";

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

    public int update(int id, String name, int deptId) {

        int r = 0;
        String query = "update courses SET name='" + name + "', deptID=" + deptId + " where id=" + id;

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
            String query = "delete from courses where id=" + id;
            Statement st = con.createStatement();
            r = st.executeUpdate(query);
        } catch (SQLException d) {
            System.out.print("Error in Delete " + d.getMessage());
        }
        return r;
    }

    public Vector<Course> viewAll() {

        Vector<Course> list = new Vector<Course>();

        try {
//            String query = "select id, name , price from students";
            String query = "SELECT courses.id, courses.name,departments.name FROM courses JOIN departments ON (courses.deptID=departments.id)";
            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {

                list.add(new Course(rs.getInt(1), rs.getString(2), rs.getString(3)));
            }

        } catch (SQLException e) {
            System.out.print("Error in Select " + e.getMessage());
        }

        return list;
    }

}
