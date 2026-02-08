package Monsters;

/**
 * File: Hydra.java
 * Name: Luka Nikabadze
 * Course: IST 242, Section 001: Inter Oo App Dev
 * Assignment: Solo Lab 2
 */
public final class Hydra extends Monster {

    private int headCount;

    public Hydra() {
        super();
        setCategory("Mythic");
        setType("Hydra");
        this.headCount = 5;
    }

    public Hydra(String name, int level, int health, int attack, int defense, int headCount) {
        super(name, "Mythic", "Hydra", level, health, attack, defense);
        this.headCount = headCount;
    }

    @Override
    public void specialPowers() {
        System.out.println(getName() + " (Hydra) uses: " + getSpecialPower());
    }

    public int getHeadCount() { return headCount; }
    public void setHeadCount(int headCount) { this.headCount = headCount; }
}
