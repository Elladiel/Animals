package asa.chee.animals;

/**
 * Created by Анастасия on 02.02.2017.
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
