//Nama Praktikan  : Narendra Dhafa Ilyaza
//Kelas Praktikan : TI-A

import java.util.Random;

public class Warrior extends Character {
    public Warrior() {
        setHp(80);
        setAttack(25);
        setDefense(30);
    }
    Random random = new Random();

    @Override
    public boolean attack() {
        if(getHp() == 0) return false;

        int chance = random.nextInt(100);
        return chance < 60;
    }
}
