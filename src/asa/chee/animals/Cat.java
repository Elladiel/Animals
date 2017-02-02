package asa.chee.animals;

/**
 * Класс, представляющий кошку.
 * Расширяет класс <code>Animal</code>.
 *
 * author  Simonova A.A
 */
public class Cat extends Animal {

    public Cat(){
        this("Котик","Мяу-мяу ^^");
    }
    protected Cat(String name, String voice) {
        super(name, voice);
    }

}
