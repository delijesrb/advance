package rs.srb.three;

import rs.srb.three.product.Product;
import rs.srb.three.product.ProductDao;

public class Demo2 {
    public static void main(String[] args) {

        ProductDao productDao = new ProductDao();
        for(Product p : productDao.selectAll()){
            System.out.println(p);
        }
    }
}
