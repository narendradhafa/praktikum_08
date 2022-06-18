//Nama Praktikan  : Narendra Dhafa Ilyaza
//Kelas Praktikan : TI-A

import java.util.Random;

public class Titan extends Character {
    public Titan() {
        setHp(200);
        setAttack(45);
        setDefense(0);
    }
    Random random = new Random();

    @Override
    public boolean attack() {
        if(getHp() == 0) return false;

        int chance = random.nextInt(100);
        return chance < 40;
    }
}
