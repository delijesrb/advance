package rs.srb.one.human;

import rs.srb.one.animal.Animal;

import java.time.LocalDate;
import java.time.Period;

public class Person {

    private  String name;
    private  String surname;
    private LocalDate birthDay;

    private Animal animal;

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public Person () {
        this("", "", LocalDate.now());
    }

    public Person(LocalDate birthDay) {
        this("","",birthDay);
    }

    public Person(String name, String surname) {
        this(name,surname,LocalDate.now());
    }

    public Person(String name, String surname, LocalDate birthDay) {
        this.name = name;
        this.surname = surname;
        this.birthDay = birthDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public int  getAge (){
        LocalDate now = LocalDate.now();
        Period period = birthDay.until(now);
        int age = period.getYears();
        return  age;
    }
    public void printPerson(){
        System.out.println("ime: "+getName()+"\n\rprezime: "+ getSurname()+"\n\rdatum rodjenja:  "+ getBirthDay()+"\n\rgodine: "+getAge()+"\n");
    }
}
