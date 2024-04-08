package rs.srb.one;

import rs.srb.one.animal.Bird;
import rs.srb.one.machine.Plain;

public class FlyTester {
    public static void main(String[] args) {

        Bird bird = new Bird("twiti");
        Plain plain = new Plain();


        Flyable flyable = () -> System.out.println("heli i moh´gu da letim");
        flyable.flyable();



    }
}
