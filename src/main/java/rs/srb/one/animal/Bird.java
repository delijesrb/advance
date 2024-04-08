package rs.srb.one.animal;

import rs.srb.one.Flyable;

public class Bird extends Animal implements Flyable {
    public Bird(String name) {
        super(name);
    }

    @Override
    public void playSound() {
        System.out.println("ciu cui cui");
    }

    @Override
    public void flyable() {
        System.out.println("Ja imam krila i letim");
    }
}
