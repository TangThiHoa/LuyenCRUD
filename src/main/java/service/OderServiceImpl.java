package service;

import model.Order;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class OderServiceImpl implements OrderService{
    protected Connection getConnection() {
        //connection là class của thư viện ,mới thêm vào
        //kết nối dự án jave với CSDL
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");       //Đường truyền kết nối CSDL
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo2006?useSSL=false", "root", "123456");        //jdbcURL:đường truyền đến mySQL, jdbcUsername:, jdbcPassword
//       connection cần DriverManager để kết nối được với đường truyền

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return connection;
    }

    @Override
    public void add(Order order) {

    }

    @Override
    public Order findById(int id) {
        return null;
    }

    @Override
    public List<Order> findAll() {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public boolean update(Order order) throws SQLException {
        return false;
    }

    @Override
    public List<Order> findByName(String name) {
        return null;
    }
}
