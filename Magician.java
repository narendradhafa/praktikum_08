//Nama Praktikan  : Narendra Dhafa Ilyaza
//Kelas Praktikan : TI-A

import java.util.Random;

public class Magician extends Character {
    public Magician() {
        setHp(100);
        setAttack(60);
        setDefense(10);
    }
    Random random = new Random();

    @Override
    public boolean attack() {
        if(getHp() == 0) return false;

        int chance = random.nextInt(100);
        return chance < 35;
    }
}
