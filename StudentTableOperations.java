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
public class StudentTableOperations {

    private Connection con = null;

    public StudentTableOperations() {
        con = DBConnection.Connect();
    }

    public int insert(String name, String contact) {

        int r = 0;
        String query = "insert into students(name,contact) values ('" + name + "','" + contact + "')";

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

    public int update(int id, String name, String contact) {

        int r = 0;
        String query = "update students set name='" + name + "',contact='" + contact + "' where id=" + id;

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
            String query = "delete from students where id=" + id;
            Statement st = con.createStatement();
            r = st.executeUpdate(query);
        } catch (SQLException d) {
            System.out.print("Error in Delete " + d.getMessage());
        }
        return r;
    }

    public Vector<Student> viewAll() {

        Vector<Student> list = new Vector<Student>();

        try {
//            String query = "select id, name , price from students";
            String query = "SELECT students.id, students.name,students.contact FROM students order by students.id";
            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery(query);

            while (rs.next()) {

                list.add(new Student(rs.getInt("id"), rs.getString("name"), rs.getString("contact")));
            }

        } catch (SQLException e) {
            System.out.print("Error in Select " + e.getMessage());
        }

        return list;
    }//

}
