package asa.chee.animals;

/**
 * Created by Анастасия on 02.02.2017.
 */
public class Cat extends Animal {

    public Cat(){
        this("Котик","Мяу-мяу ^^");
    }
    protected Cat(String name, String voice) {
        super(name, voice);
    }

}
