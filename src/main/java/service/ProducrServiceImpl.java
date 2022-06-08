package service;

import model.Customer;
import model.Product;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProducrServiceImpl implements ProductService {

    protected Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo2006?useSSL=false", "root", "123456");
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }
    @Override
    public void add(Product product) {
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("insert into product(id,name,price,quantity) values (?,?,?,?)");) {
            preparedStatement.setInt(1, product.getId());
            preparedStatement.setString(2, product.getName());
            preparedStatement.setInt(3, product.getPrice());
            preparedStatement.setInt(4, product.getQuantity());
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e);
        }


    }

    @Override
    public Product findById(int id) {
        Product product = new Product();
        try (Connection connection = getConnection();

             PreparedStatement preparedStatement = connection.prepareStatement("select * from product where id = ?");) {
            System.out.println(preparedStatement);
            preparedStatement.setInt(1, id);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                String name = rs.getString("name");
              int price = rs.getInt("price");
              int quantity = rs.getInt("quantity");
              product =  (new Product(id,name,price,quantity));


            }
        } catch (SQLException e) {

        }
        return product;
    }

    @Override
    public List<Product> findAll() {
        List<Product> products = new ArrayList<>();
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("select * from product");) {
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int price = rs.getInt("price");
                int quantity = rs.getInt("quantity");
                products .add(new Product(id,name,price,quantity)) ;
            }
        } catch (SQLException e) {
        }
        return products;
    }

    @Override
    public boolean delete(int id) {
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("delete from product where id = ?");) {
            preparedStatement.setInt(1, id);
            System.out.println(preparedStatement); //in ra câu truy vấn.
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
        }
        return false;

    }

    @Override
    public boolean update(Product product) throws SQLException {
        boolean a = false;
        try (
                Connection connection = getConnection();
                PreparedStatement preparedStatement = connection.prepareStatement("update product set name =? ,price=?,quantity=? where id=?");) {
            preparedStatement.setString(1,product.getName());
            preparedStatement.setInt(2,product.getPrice());
            preparedStatement.setInt(3,product.getQuantity());
            preparedStatement.setInt(4,product.getId());
            a = preparedStatement.executeUpdate() > 0;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return a;
    }

    @Override
    public List<Product> findByName(String name) {
        List<Product> products = new ArrayList<>();
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("select * from product where name like ?");) {
            preparedStatement.setString(1, '%' + name + '%');
            System.out.println(preparedStatement); //in ra câu truy vấn.
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String namefind = rs.getString("name");
                int price = rs.getInt("price");
                int quantity = rs.getInt("quantity");
                products .add(new Product(id,namefind,price,quantity)) ;
            }
        } catch (SQLException e) {
        }
        return products;
    }

    @Override
    public List<Product> Price(int p1,int p2) {
        List<Product> products = new ArrayList<>();
        try (Connection connection = getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement("select * from product where price between ? and ? ");) {
            preparedStatement.setString(1, String.valueOf(p1));
            preparedStatement.setString(2, String.valueOf(p2));
            System.out.println(preparedStatement);
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int price = rs.getInt("price");
                int quantity = rs.getInt("quantity");
                products .add(new Product(id,name,price,quantity)) ;
            }
        } catch (SQLException e) {
        }
        return products;
    }
}
