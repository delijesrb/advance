package rs.srb.three.product;

import rs.srb.three.ConnectionPool;
import rs.srb.three.Dao;

import java.math.BigDecimal;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ProductDao implements Dao<Product> {
    @Override
    public void save(Product t) {

    }

    @Override
    public Product select(long id) {
        return null;
    }

    @Override
    public List<Product> selectAll() {
        List<Product> products = new ArrayList<>();
        try {
            ConnectionPool connectionPool = ConnectionPool.getConnectionPool();
            Connection connection = connectionPool.getConnection();
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM products");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()){
                Long productId = resultSet.getLong(1);
                String name = resultSet.getString("name");
                Integer quantityInStock = resultSet.getInt("quantity_in_stock");
                BigDecimal unitPrice = resultSet.getBigDecimal("unit_price");
                Product product = new Product();
                product.setProducrId(productId);
                product.setName(name);
                product.setQuantityInStock(quantityInStock);
                product.setUnitPrice(unitPrice);

                products.add(product);



            }
           connectionPool.releaseConnection(connection);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return products;
    }

    @Override
    public void update(Product t) {

    }

    @Override
    public void delete(Product t) {

    }
}
