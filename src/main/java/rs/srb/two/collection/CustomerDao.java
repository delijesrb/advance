package rs.srb.two.collection;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
/*povezivanje na bazu sa tabelom customer*/
public class CustomerDao implements Dao<Customer>{
    @Override
    public List<Customer> selectAll() {
        List<Customer> customers = new ArrayList<>();
        try {
            //conekcija
            Connection connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);

            //upit ili statment ili preparedstatement ili callable statement
            Statement statement = connection.createStatement();

            // ResultSet -> kolekcija elemenata ili redova baze
            ResultSet resultSet = statement.executeQuery("SELECT * FROM customers");
            while (resultSet.next()){
                Long customerId =  resultSet.getLong(1);//inex kolone
                String firstName = resultSet.getString("first_name");
                String lastName = resultSet.getString("last_name");
                LocalDate birthDate = resultSet.getDate("birth_date").toLocalDate();
                String phone= resultSet.getString("phone");
                String address=resultSet.getString("address");
                String city = resultSet.getString("city");
                String state = resultSet.getString("state");
                int points = resultSet.getInt("points");
                Customer customer = new Customer(customerId,firstName,lastName,birthDate,phone,address,city,state,points);
                customers.add(customer);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        return customers;
    }

    @Override
    public Customer selectWhere(Long id) {
        return null;
    }
}
