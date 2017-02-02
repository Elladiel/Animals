package asa.chee.animals;

/**
 * Класс, представляющий енота.
 * Расширяет класс <code>Animal</code>.
 *
 * author  Simonova A.A
 */
public class Raccoon extends Animal {

    public Raccoon(){
        this("Енотик", "Я енотик-полоскун ^^");
    }

    public Raccoon(String name, String voice) {
        super(name, voice);
    }
}
