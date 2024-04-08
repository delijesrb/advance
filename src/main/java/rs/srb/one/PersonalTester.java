package rs.srb.one;

import rs.srb.one.human.Person;

@FunctionalInterface
public interface PersonalTester {
    boolean test(Person person);

}