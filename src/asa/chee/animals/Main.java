package asa.chee.animals;

/**
 * Created by Анастасия on 02.02.2017.
 */
public class Main {
    public static void main(String... args) {
        Dog dog = new Dog();
        Dog dog1 = new Dog("Собака", "гав-гав");
        Dog dog2 = new Dog("Тузик", "тяф-тяф");

        Cat cat = new Cat();

        Raccoon raccoon = new Raccoon();

        dog.printDisplay();
        dog1.printDisplay();
        dog2.printDisplay();

        cat.printDisplay();

        raccoon.printDisplay();

    }
}
