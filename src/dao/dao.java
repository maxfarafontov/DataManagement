package dao;

import data.user;
import data.car;
import data.master;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class dao {
    public static String DATABASE = null;
    public static final String URL = "jdbc:mysql://localhost:3306/" + DATABASE;
    public static String USERNAME = null;
    public static String PASSWORD = null;
    public List<user> users = new ArrayList();
    public List<car> cars = new ArrayList();
    public List<master> masters = new ArrayList();



    private Connection connection;
    private Statement st;


    public dao() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public List<user> getUsers() {
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            st = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        String sql = "SELECT * FROM user";
        try {
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                users.add(new user(rs.getInt("ID"), rs.getString("FirstName"), rs.getString("LastName"), rs.getString("Email"),
                        rs.getInt("Age"), rs.getInt("PSeries"), rs.getInt("PNumber")));
            }
            rs.close();
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (st != null)
                    connection.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
            try {
                if (connection != null)
                    connection.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        return users;
    }
    public user getUserById(int id) {
        String q = "SELECT ID,FirstName,LastName,Email,Age,PSeries,PNumber FROM user WHERE ID=" + id;
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            st = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        try {
            ResultSet rs = st.executeQuery(q);
            if (rs.next()) {
                user user = new user(rs.getInt("ID"), rs.getString("FirstName"), rs.getString("LastName"), rs.getString("Email"),
                        rs.getInt("Age"), rs.getInt("PSeries"), rs.getInt("PNumber"));
                return user;
            }
            rs.close();
        } catch (SQLException e) {
        }
        return null;
    }
    public void addUser(user u) {
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            st = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        String q = "INSERT INTO (FirstName,LastName,Email,Age,PSeries,PNumber) VALUES " + u.toString() + ";";
        try {
            st.executeUpdate(q);
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (st != null)
                    connection.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
            try {
                if (connection != null)
                    connection.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
    public void deleteUser(int id) {
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            st = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        String q = "DELETE from user where ID =" + id;
        try {
            st.executeUpdate(q);
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                if (st != null)
                    connection.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
            try {
                if (connection != null)
                    connection.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
    public void updateUser(user u) {
        String q = "UPDATE user SET FirstName ='" + u.getFirstName() + "',LastName='" + u.getLastName() + "',Email='" + u.getEmail() +
                "',Age=" + u.getAge() + ",PSeries='" + u.getPSeries() + "',PNumber='" + u.getPNumber() + "' WHERE ID=" + u.getID();
        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            st = connection.createStatement();
            st.executeUpdate(q);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (st != null)
                    connection.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
            try {
                if (connection != null)
                    connection.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }

}