package useDB;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CustomerService {

    public int customerAdd(String name, String email, String password) {
        int status = 0;
        DB db = new DB();
        try {
            String sql = "insert into customer values(default, ?, ?, ? )";
            PreparedStatement pre = db.connect().prepareStatement(sql);
            pre.setString(1, name);
            pre.setString(2, email);
            pre.setString(3, password);
            status = pre.executeUpdate();
        }catch (Exception ex) {
            System.err.println("customerAdd error:" + ex);
        }finally {
            db.close();
        }
        return status;
    }


    public List<Customer> allCustomer() {
        List<Customer> list = new ArrayList<>();
        DB db = new DB();
        try {
            String sql = "select * from customer";
            PreparedStatement pre = db.connect().prepareStatement(sql);
            ResultSet rs = pre.executeQuery();
            while(rs.next()) {
                int cid = rs.getInt("cid");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String password = rs.getString("password");
                Customer c = new Customer(cid, name, email, password);
                list.add(c);
            }
        }catch (Exception ex) {
            System.err.println("allCustomer error: " + ex);
        }finally {
            db.close();
        }
        return list;
    }


    public int customerDelete(int cid) {
        DB db = new DB();
        int status = 0;
        try {
            String sql = "delete from customer where cid = ?";
            PreparedStatement pre = db.connect().prepareStatement(sql);
            pre.setInt(1, cid);
            status = pre.executeUpdate();
        }catch (Exception ex) {
            System.err.println("customerDelete error: " + ex);
        }finally {
            db.close();
        }
        return status;
    }


}
