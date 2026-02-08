package Monsters;

/**
 * File: MechaBeast.java
 * Name: Luka Nikabadze
 * Course: IST 242, Section 001: Inter Oo App Dev
 * Assignment: Solo Lab 2
 */
public final class MechaBeast extends Monster {

    private int armorRating; // 1-100

    public MechaBeast() {
        super();
        setCategory("Sci-Fi");
        setType("MechaBeast");
        this.armorRating = 70;
    }

    public MechaBeast(String name, int level, int health, int attack, int defense, int armorRating) {
        super(name, "Sci-Fi", "MechaBeast", level, health, attack, defense);
        this.armorRating = armorRating;
    }

    @Override
    public void specialPowers() {
        System.out.println(getName() + " (MechaBeast) uses: " + getSpecialPower());
    }

    public int getArmorRating() { return armorRating; }
    public void setArmorRating(int armorRating) { this.armorRating = armorRating; }
}
