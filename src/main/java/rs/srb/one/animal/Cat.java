package rs.srb.one.animal;

public class Cat extends Animal{
    public Cat(String name) {
        super(name);
    }

    @Override
    public void playSound() {
        System.out.println("mjau mjau mjau..");
    }
}
