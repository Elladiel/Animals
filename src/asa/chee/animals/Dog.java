package asa.chee.animals;

/**
 * Класс, представляющий собаку.
 * Расширяет класс <code>Animal</code>.
 *
 * author  Simonova A.A
 */
public class Dog extends Animal{


    public Dog() {
        this("Собака", "гав-гав");
    }


    protected Dog(String name, String voice) {
        super(name, voice);
    }
}
