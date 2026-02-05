package Monsters;

public class Main {

    public static void main(String[] args) {

        Monster m1 = new Vampire("Dracula", 100, 25);
        Monster m2 = new Zombie("Walker", 80, 10);
        Monster m3 = new Dragon("Smaug", 200, 50);
        Monster m4 = new Vampire("Blade", 120, 30);
        Monster m5 = new Zombie("Rotter", 70, 15);

        m1.setSpecialPower(SpecialPower.REGENERATION);
        m2.setSpecialPower(SpecialPower.POISON);
        m3.setSpecialPower(SpecialPower.INVISIBILITY);
        m4.setSpecialPower(SpecialPower.LIGHTNING);
        m5.setSpecialPower(SpecialPower.ICE_BLAST);

        Monster[] monsters = {m1, m2, m3, m4, m5};

        for (Monster m : monsters) {
            System.out.println("Name: " + m.getName());
            System.out.println("Health: " + m.getHealth());
            System.out.println("Power: " + m.getSpecialPower());
            m.specialPowers();
            System.out.println();
        }
    }
}
