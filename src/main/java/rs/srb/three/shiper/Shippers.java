package rs.srb.three.shiper;

public class Shippers {
    private Integer shipperID;
    private String name;

    public Shippers(Integer shipperID, String name) {
        this.shipperID = shipperID;
        this.name = name;
    }

    public Integer getShipperID() {
        return shipperID;
    }

    public void setShipperID(Integer shipperID) {
        this.shipperID = shipperID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Shippers{" +
                "shipperID=" + shipperID +
                ", name='" + name + '\'' +
                '}';
    }
}
