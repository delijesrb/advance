package rs.srb.one.human;

import rs.srb.one.animal.Cat;
import rs.srb.one.animal.Dog;
import rs.srb.one.animal.Hamster;

public class Pensioner extends Person {
    private double pensionAmount;


    public double getPensionAmount() {
        return pensionAmount;
    }

    public void setPensionAmount(double pensionAmount) {
        this.pensionAmount = pensionAmount;
    }
}
