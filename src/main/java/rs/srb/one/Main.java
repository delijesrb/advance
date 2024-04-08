package rs.srb.one;

import rs.srb.one.animal.Cat;
import rs.srb.one.animal.Dog;
import rs.srb.one.human.Employee;
import rs.srb.one.human.Pensioner;
import rs.srb.one.human.Person;
import rs.srb.one.human.Student;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Person person = new Person();
        System.out.println(person.getAge());
        Person person1 = new Person(LocalDate.of(2022,1,1));
        System.out.println(person1.getAge());
        Person person2 = new Person("Nesa","Marjanovi",LocalDate.of(1984,8,1));
        System.out.println(person2.getAge());

        Student student = new Student("Srki", "Radi",LocalDate.of(1988,5,9),198859);

        Employee employee = new Employee();
        employee.setName("Ismet");
        employee.setSurname("Omerovic");
        employee.setBirthDay(LocalDate.of(1988,1,1));
        employee.setSalaryAmount(1500.45);

        Pensioner pensioner = new Pensioner();
        pensioner.setName("Zoran");
        pensioner.setSurname("Radivojevic");
        pensioner.setBirthDay(LocalDate.of(1961,5,20));

         pensioner.printPerson();
         student.printPerson();
         employee.printPerson();

         Cat cat = new Cat("tom");
         Dog dog = new Dog("buvara");

         student.setAnimal(cat);
         student.getAnimal().playSound();
         Person person3 = new Student("ivica","RADIVOJ",LocalDate.of(1984,1,30),1984131);





    }
}
