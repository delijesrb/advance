package rs.srb.one.machine;

import rs.srb.one.Flyable;

public class Plain implements Flyable {
    @Override
    public void flyable() {
        System.out.println("Moze da leti");
    }
}
