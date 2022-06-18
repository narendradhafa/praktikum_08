//Nama Praktikan  : Narendra Dhafa Ilyaza
//Kelas Praktikan : TI-A

import java.lang.*;

abstract public class Character {
    private int defense, attack, hp;

    abstract public boolean attack();

    void receiveDamage(int damage) {
        int newDamage = damage - getDefense();

        if (getHp() < newDamage) {
            setHp(0);
            return;
        }

        if (newDamage > 0) setHp(getHp() - newDamage);
    }

    void info() {
        System.out.println("-------- STATUS --------");
        System.out.println("Role    : " + getClass().getSimpleName());
        System.out.println("HP      : " + getHp());
        System.out.println("Attack  : " + getAttack());
        System.out.println("Defense : " + getDefense());
    }

    // getter
    public int getDefense() {
        return defense;
    }

    public int getAttack() {
        return attack;
    }

    public int getHp() {
        return hp;
    }

    // setter
    public void setDefense(int defense) {
        this.defense = defense;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
