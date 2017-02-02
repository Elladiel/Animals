package asa.chee.animals;

/**
 * Абстрактный класс, представляющий животное(<code>Animal</code>).
 * Содержит реализованный метод <code>printDisplay</code>.
 *
 * @author  Simonova A.A
 */
public abstract class Animal {
    public static final String OUTPUT_FORMAT_LINE
            = "%s говорит '%s'.";

    private String name;
    private String voice;

    protected Animal(String name, String voice) {
        this.name = name;
        this.voice = voice;
    }

    /**
     * Метод, возвращает название животнго.
     * @return (String) название животного.
     */
    public String getName(){
        return name;
    }

    /**
     * Метод, возвращает голос (слова/говор) животного.
     * @return (String) голос (слова/говор) животного.
     */
    public String getVoice(){ return voice; }

    /**
     * Выводит сообщение по заданому формату
     */
    public void printDisplay() {
        System.out.println(String.format(
                OUTPUT_FORMAT_LINE,
                name,
                voice
        ));
    }
}
