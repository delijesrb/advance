package rs.srb.one.human;

import rs.srb.one.animal.Cat;
import rs.srb.one.animal.Dog;

import java.time.LocalDate;

public class Student extends Person {
    private int indexNumber;



    public Student (String name , String surname , LocalDate birthDay , int indexNumber){
        super(name,surname,birthDay);
    this.indexNumber=indexNumber;

    }
    public int getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(int indexNumber) {
        this.indexNumber = indexNumber;
    }
}
