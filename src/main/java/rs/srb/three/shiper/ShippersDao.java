package rs.srb.three.shiper;

import rs.srb.three.Dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ShippersDao implements Dao<Shippers> {
    @Override
    public void save(Shippers t) {

    }

    @Override
    public Shippers select(long id) {
        return null;
    }

    @Override
    public List<Shippers> selectAll() {
        List<Shippers> shippersc= new ArrayList<>();
        try (Connection connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);){
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM shippers");
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()){
                Integer shipperID = resultSet.getInt("shipper_id");
                String name = resultSet.getString("name");

                Shippers shipper = new Shippers(shipperID,name);
                shippersc.add(shipper);


            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return shippersc;
    }

    @Override
    public void update(Shippers t) {

    }

    @Override
    public void delete(Shippers t) {

    }
}
