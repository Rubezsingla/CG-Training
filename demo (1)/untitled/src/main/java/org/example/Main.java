package org.example;
import java.sql.*;

public class Main {

    static final String URL = "jdbc:mysql://localhost:3306/chitkara";
    static final String USER = "root";
    static final String PASS = "rubezsingla123";

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            try (Connection con = DriverManager.getConnection(URL, USER, PASS)) {


                insertStudent(con, 1, "Rubez");


                getStudents(con);


                updateStudent(con, 1, "Singla");


                getStudents(con);


                deleteStudent(con, 1);


                getStudents(con);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void insertStudent(Connection con, int id, String name) throws SQLException {
        String query = "INSERT INTO students (id, name) VALUES (?, ?)";

        try (PreparedStatement ps = con.prepareStatement(query)) {
            ps.setInt(1, id);
            ps.setString(2, name);

            int rows = ps.executeUpdate();
            System.out.println("Inserted: " + rows);
        }
    }


    public static void getStudents(Connection con) throws SQLException {
        String query = "SELECT * FROM students";

        try (Statement st = con.createStatement();
             ResultSet rs = st.executeQuery(query)) {

            System.out.println("---- Students ----");
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " " +
                                rs.getString("name")
                );
            }
        }
    }


    public static void updateStudent(Connection con, int id, String newName) throws SQLException {
        String query = "UPDATE students SET name = ? WHERE id = ?";

        try (PreparedStatement ps = con.prepareStatement(query)) {
            ps.setString(1, newName);
            ps.setInt(2, id);

            int rows = ps.executeUpdate();
            System.out.println("Updated: " + rows);
        }
    }


    public static void deleteStudent(Connection con, int id) throws SQLException {
        String query = "DELETE FROM students WHERE id = ?";

        try (PreparedStatement ps = con.prepareStatement(query)) {
            ps.setInt(1, id);

            int rows = ps.executeUpdate();
            System.out.println("Deleted: " + rows);
        }
    }
}