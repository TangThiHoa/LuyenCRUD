package service;

import model.OderDetail;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class OderDetailServiceImpl implements OrderDetailService{
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
    public void add(OderDetail oderDetail) {

    }

    @Override
    public OderDetail findById(int id) {
        return null;
    }

    @Override
    public List<OderDetail> findAll() {
        return null;
    }

    @Override
    public boolean delete(int id) {
        return false;
    }

    @Override
    public boolean update(OderDetail oderDetail) throws SQLException {
        return false;
    }

    @Override
    public List<OderDetail> findByName(String name) {
        return null;
    }
}
