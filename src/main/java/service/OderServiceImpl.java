package service;

import model.Customer;
import model.Order;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OderServiceImpl implements OrderService {
    CustomerService customerService = new CustometServiceImpl();

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
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("insert into order(id,total,customerId) values (?,?,?)");) {
            preparedStatement.setInt(1, order.getId());
            preparedStatement.setInt(2, order.getTotal());
            preparedStatement.setInt(3, order.getCustomerId().getId());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    @Override
    public Order findById(int id) {
        Order order = new Order();
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("select * from `order` where id = ?");) {
            preparedStatement.setInt(1, id);
            System.out.println(preparedStatement); //in ra câu truy vấn.
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int total= rs.getInt("total");
                int  customerId = rs.getInt("CustomerId"); // lấy ra classId từ bảng student trong db
                Customer customer = customerService.findById(customerId);
                order = new Order(id,total,customer);
            }
        } catch (SQLException e) {
        }
        return order;
    }

    @Override
    public List<Order> findAll() {
        List<Order> orders = new ArrayList<>();
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("select * from `order`");) {
            System.out.println(preparedStatement); //in ra câu truy vấn.
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
//                int time = rs.getInt("time");
                int total= rs.getInt("total");
                int  customerId = rs.getInt("CustomerId"); // lấy ra classId từ bảng student trong db
                Customer customer = customerService.findById(customerId);
                Order order = new Order(id, total, customer);
                orders.add(order);
            }
        } catch (SQLException e) {
        }
        return orders;
    }

    @Override
    public boolean delete(int id) {
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("delete from order where id = ?");) {
            preparedStatement.setInt(1, id);
            System.out.println(preparedStatement); //in ra câu truy vấn.
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
        }
        return false;
    }

    @Override
    public boolean update(Order order) throws SQLException {
        boolean a = false;
        try (
                Connection connection = getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement("update `order` set total =?,customerId=? where id=?");) {
            preparedStatement.setInt(1, order.getTotal());
            preparedStatement.setInt(2, order.getCustomerId().getId());
            preparedStatement.setInt(3, order.getId());
            a = preparedStatement.executeUpdate() > 0;

        }
        return a;
    }

    @Override
    public List<Order> findByName(String name) {
        return null;
    }
}
