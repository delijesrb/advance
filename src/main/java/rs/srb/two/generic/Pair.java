package rs.srb.two.generic;

import rs.srb.one.animal.Animal;
import rs.srb.one.human.Person;
import rs.srb.one.human.Student;

public class Pair <K extends Person, U extends Animal>{
    private K person;
    private U animal;

    public K getPerson() {
        return person;
    }

    public void setPerson(Student person) {
        this.person = (K) person;
    }

    public U getAnimal() {
        return animal;
    }

    public void setAnimal(U animal) {
        this.animal = animal;
    }
}
