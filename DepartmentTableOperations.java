package CollageManagement;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;

public class DepartmentTableOperations {

    Connection con = null;

    public DepartmentTableOperations() {
        con = DBConnection.Connect();
    }

    public int insert(String name) {

        int r = 0;

        if (con == null) {
            System.out.println("database not connected");
        } else {
            try {
                String query = "insert into departments( name) values ('" + name + "')";
                Statement st = con.createStatement();
                r = st.executeUpdate(query);
            } catch (SQLException ex) {
                System.out.println("error in deptInsert " + ex);
            }
        }

        return r;

    }

    public int update(int id, String name) {

        int r = 0;
        String query = "update departments set name='" + name + "' where id=" + id;

        if (con == null) {
            System.out.println("database not connected");
        } else {
            try {
                Statement st = con.createStatement();
                r = st.executeUpdate(query);
            } catch (SQLException ex) {
                System.out.println("error in deptUpdate");
            }
        }

        return r;

    }

    public int delete(int id) {

        int r = 0;
        try {
            String query = "delete from departments where id=" + id;
            Statement st = con.createStatement();
            r = st.executeUpdate(query);
        } catch (SQLException d) {
            System.out.print("Error in Delete " + d.getMessage());
        }
        return r;
    }

    public Vector<Department> viewAll() {
        Vector<Department> list = new Vector<Department>();
        String query = "select id, name from departments";         //order by id desc

        if (con != null) {
            try {
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(query);

                while (rs.next()) {

                    Department d = new Department(rs.getInt("id"), rs.getString("name"));
                    list.add(d);
                }

            } catch (SQLException ex) {
                System.out.println("error in select");
            }
        } else {
            System.out.println("database not connected");
        }

        return list;
    }
}
