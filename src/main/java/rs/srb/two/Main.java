package rs.srb.two;


import rs.srb.one.animal.Cat;
import rs.srb.one.animal.Dog;
import rs.srb.one.human.Employee;
import rs.srb.one.human.Person;
import rs.srb.one.human.Student;
import rs.srb.two.generic.Box;
import rs.srb.two.generic.Pair;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person();
        person1.setName("Petar");
        person1.setSurname("Petrovic");
        person1.setBirthDay(LocalDate.of(1987,4,8));

        Box<Integer,Double,Person> kutija = new Box<>();
        kutija.setUltra(23);
        kutija.setVioletno(12.5);
        kutija.setZracenje(person1);

        Box<Integer, Double, Person> box2 = new Box<>();

        Dog dog = new Dog("kuca");
        Student student = new Student("mica","micovic",LocalDate.of(1984,5,2),265);
        Employee employee = new Employee();
        employee.setName("Dule");
        employee.setSurname("savic");


        Pair pair = new Pair();
        pair.setPerson(student);
        pair.setAnimal(dog);

        Pair<Student, Cat> pair1 = new Pair<>();





    }
}
