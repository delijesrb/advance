package rs.srb.one.animal;

import rs.srb.one.PersonalTester;
import rs.srb.one.human.Person;

import java.time.LocalDate;

public class FunktionalPerson {
    public static void main(String[] args) {
        Person person = new Person("Ismet","Omerovic", LocalDate.of(1998,8,8));
        PersonalTester punoletan = (p) -> p.getAge() >= 18;
        boolean ismetP = punoletan.test(person);
        System.out.println(ismetP? "jeste":"nije");


    }
}
