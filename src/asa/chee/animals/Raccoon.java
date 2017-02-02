package asa.chee.animals;

/**
 * Created by Анастасия on 02.02.2017.
 */
public class Raccoon extends Animal {

    public Raccoon(){
        this("Енотик", "Я енотик-полоскун ^^");
    }

    public Raccoon(String name, String voice) {
        super(name, voice);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getVoice() {
        return super.getVoice();
    }


}
