package rs.srb.one.animal;

public class Hamster extends Animal{
    public Hamster(String name) {
        super(name);
    }

    @Override
    public void playSound() {
        System.out.println(" hr hr hr hr");
    }
}
