package rs.srb.three;

import rs.srb.three.product.Product;
import rs.srb.three.product.ProductDao;
import rs.srb.three.product.ProductTester;
import rs.srb.three.shiper.Shippers;
import rs.srb.three.shiper.ShippersDao;

import java.util.*;

public class Demo {
    public static void main(String[] args) {

        ProductDao productDao = new ProductDao();
        List<Product> products =  productDao.selectAll();
        for (Product e : products){
            System.out.println(e);
        }
        ProductTester productTester = (p)->p.getQuantityInStock()>0;
        System.out.println(productTester);

        Set<Product> productSet = new HashSet<>(products);
        productSet = new LinkedHashSet<>(products);
        productSet = new TreeSet<>(products);
        for(Product p : productSet){
            System.out.println(p);
        }
        ShippersDao shippersDao = new ShippersDao();

        for (Shippers s : shippersDao.selectAll()){
            System.out.println(s);
        }


    }
    private static class ProductConsumer{

    }
}
