package asa.chee.animals;

/**
 * Created by Анастасия on 02.02.2017.
 */
public class Dog extends Animal{


    public Dog() {
        this("Собака", "гав-гав");
    }


    protected Dog(String name, String voice) {
        super(name, voice);
    }
}
