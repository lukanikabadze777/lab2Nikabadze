package Monsters;

/**
 * File: Main.java
 * Name: Luka Nikabadze
 * Course: IST 242, Section 001: Inter OO App Dev
 * Assignment: Solo Lab 2
 *
 * Description:
 * Main driver class that creates and prints 5 monsters.
 * Demonstrates:
 * - Abstraction (Monster class)
 * - Inheritance (Hydra, Minotaur, MechaBeast)
 * - Polymorphism (specialPowers method)
 * - Enumeration (SpecialPower)
 */
public class Main {

    /**
     * Prints one monster's full details using getters.
     *
     * @param m monster object
     */
    private static void printMonster(Monster m) {
        System.out.println("----- Monster -----");
        System.out.println("Name: " + m.getName());
        System.out.println("Category: " + m.getCategory());
        System.out.println("Type: " + m.getType());
        System.out.println("Level: " + m.getLevel());
        System.out.println("Health: " + m.getHealth());
        System.out.println("Attack: " + m.getAttack());
        System.out.println("Defense: " + m.getDefense());
        System.out.println("Special Power: " + m.getSpecialPower());

        if (m instanceof Hydra h) {
            System.out.println("Head Count: " + h.getHeadCount());
            System.out.println("Description: Hydra with " + h.getHeadCount() + " heads.");
        } else if (m instanceof Minotaur mn) {
            System.out.println("Horn Sharpness: " + mn.getHornSharpness());
            System.out.println("Description: Minotaur with horn sharpness " + mn.getHornSharpness() + ".");
        } else if (m instanceof MechaBeast mb) {
            System.out.println("Armor Rating: " + mb.getArmorRating());
            System.out.println("Description: MechaBeast with armor rating " + mb.getArmorRating() + ".");
        }

        System.out.println();
    }

    /**
     * Program entry point.
     *
     * @param args command line arguments
     */
    public static void main(String[] args) {

        // Create 5 monsters, only 3 types
        Monster m1 = new Hydra("Swamp Hydra", 5, 200, 45, 30, 6);
        Monster m2 = new Hydra("Ancient Hydra", 7, 260, 55, 35, 9);

        Monster m3 = new Minotaur("Maze Guard", 4, 180, 50, 20, 65);
        Monster m4 = new Minotaur("Horn King", 6, 220, 60, 28, 90);

        Monster m5 = new MechaBeast("Steel Howl", 7, 240, 58, 45, 92);

        // Set powers using setters (NO repeats)
        m1.setSpecialPower(SpecialPower.POISON_HEADS);
        m2.setSpecialPower(SpecialPower.RAGE_ROAR);
        m3.setSpecialPower(SpecialPower.LABYRINTH_CHARGE);
        m4.setSpecialPower(SpecialPower.STEEL_SHIELD);
        m5.setSpecialPower(SpecialPower.LASER_BEAM);

        Monster[] monsters = { m1, m2, m3, m4, m5 };

        // Print all monsters using getters
        System.out.println("=== PRINT ALL MONSTERS (using getters) ===\n");
        for (Monster m : monsters) {
            printMonster(m);
        }

        // Demonstrate polymorphism
        System.out.println("=== PRINT SPECIAL POWERS (getter + polymorphism) ===\n");
        for (Monster m : monsters) {
            System.out.println(m.getName() + " power (getter): " + m.getSpecialPower());
            m.specialPowers();
        }
    }
}
