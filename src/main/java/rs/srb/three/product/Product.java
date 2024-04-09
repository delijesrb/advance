package rs.srb.three.product;

import java.math.BigDecimal;
import java.util.Objects;

public class Product implements Comparable<Product> {
    private Long producrId;
    private String name;
    private Integer quantityInStock;
    private BigDecimal unitPrice;

    public Product() {
    }

    public Long getProducrId() {
        return producrId;
    }

    public void setProducrId(Long producrId) {
        this.producrId = producrId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getQuantityInStock() {
        return quantityInStock;
    }

    public void setQuantityInStock(Integer quantityInStock) {
        this.quantityInStock = quantityInStock;
    }

    public BigDecimal getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(BigDecimal unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "id:"+ producrId + ", Ime: "+ name + ", Komada: "+ quantityInStock+", cena:"+unitPrice;
    }
/*
    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Product)){
            return false;
        }
        Product product = (Product) obj;
        return  producrId == product.getProducrId();
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(producrId);
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product product)) return false;
        return Objects.equals(getProducrId(), product.getProducrId()) && Objects.equals(getName(), product.getName()) && Objects.equals(getQuantityInStock(), product.getQuantityInStock()) && Objects.equals(getUnitPrice(), product.getUnitPrice());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProducrId(), getName(), getQuantityInStock(), getUnitPrice());
    }

    @Override
    public int compareTo(Product o) {
       // return producrId.compareTo(o.getProducrId());
        return producrId<o.getProducrId() ? -1 : (producrId==o.getProducrId() ? 0:1);
    }
}
