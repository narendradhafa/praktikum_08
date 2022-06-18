//Nama Praktikan  : Narendra Dhafa Ilyaza
//Kelas Praktikan : TI-A

import java.util.Random;

public class Healer extends Character {
    public Healer() {
        setHp(70);
        setAttack(10);
        setDefense(10);
    }

    Random random = new Random();

    @Override
    public boolean attack() {
        if(getHp() == 0) return false;

        int chance = random.nextInt(100);
        return chance < 85;
    }

    public void heal() {
        setHp(getHp() + 25);
    }
}