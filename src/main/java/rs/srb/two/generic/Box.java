package rs.srb.two.generic;

public class Box <U extends Number,V,Z>{
    private U ultra;
    private V violetno;
    private Z zracenje;

    public Box(){

    }

    public U getUltra() {
        return ultra;
    }

    public void setUltra(U ultra) {
        this.ultra = ultra;
    }

    public V getVioletno() {
        return violetno;
    }

    public void setVioletno(V violetno) {
        this.violetno = violetno;
    }

    public Z getZracenje() {
        return zracenje;
    }

    public void setZracenje(Z zracenje) {
        this.zracenje = zracenje;
    }
}
