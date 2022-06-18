//Nama Praktikan  : Narendra Dhafa Ilyaza
//Kelas Praktikan : TI-A

import java.util.*;

public class MainClass {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        // create object
        Character titan = new Titan();
        Character[] characters = new Character[3];
        characters[0] = new Magician();
        characters[1] = new Healer();
        characters[2] = new Warrior();

        // Start Menu
        System.out.println("Selamat datang di game Defend FILKOM !");
        System.out.print  ("Silahkan masukkan nama player : ");
        String nama = scanner.nextLine();
        int characterChoice;
        while (true) {
            try {
                System.out.println("""
                Silahkan pilih karakter yang anda inginkan :
                1. Magician
                2. Healer
                3. Warrior""");
                characterChoice = scanner.nextInt();
                if (characterChoice > 3 || characterChoice < 1) {
                    System.out.println("Mohon input angka 1 - 3");
                    continue;
                }
                break;
            } catch (InputMismatchException e) {
                System.out.println("Mohon tidak menginput selain angka");
                scanner.next();
            }
        }
        System.out.println("Selamat datang " + nama + " !");

        // print character status
        characters[characterChoice-1].info();

        // loop for battle
        int n  = 1;
        while(true) {
            System.out.println("======== TURN " + n + " ========");

            // healer healing
            if ((characterChoice == 2) && (n % 2 == 0)) {
                Healer healer = (Healer) characters[1];
                healer.heal();
                System.out.println("Menggunakan Skill Heal");
            }

            // print enemy & player HP
            System.out.println("Enemy's HP\t: " + titan.getHp());
            System.out.println(nama + "'s HP\t: " + characters[characterChoice-1].getHp());

            // player attack
            if(characters[characterChoice-1].attack()) {
                titan.receiveDamage(characters[characterChoice-1].getAttack());
            }
            // enemy attack
            if(titan.attack()) {
                characters[characterChoice-1].receiveDamage(titan.getAttack());
            }
            n++;

            // print winner
            if (titan.getHp() == 0) {
                System.out.println("======== TURN " + n + " ========");
                System.out.println("Enemy's HP\t: " + titan.getHp());
                System.out.println(nama + "'s HP\t: " + characters[characterChoice-1].getHp());
                System.out.println("========================");
                System.out.println(nama + " Menang\n");
                break;
            }
            if (characters[characterChoice-1].getHp() == 0) {
                System.out.println("======== TURN " + n + " ========");
                System.out.println("Enemy's HP\t: " + titan.getHp());
                System.out.println(nama + "'s HP\t: " + characters[characterChoice-1].getHp());
                System.out.println("========================");
                System.out.println("Titan Menang\n");
                break;
            }
        }

        // print player & enemy info after battle
        System.out.println("======== PLAYER ========");
        characters[characterChoice-1].info();
        System.out.println("======== MUSUH =========");
        titan.info();
    }
}