package Monsters;

/**
 * File: MechaBeast.java
 * Name: Luka Nikabadze
 * Course: IST 242, Section 001: Inter OO App Dev
 * Assignment: Solo Lab 2
 *
 * Description:
 * Concrete monster type: MechaBeast.
 * This class extends Monster and adds armorRating.
 */
public final class MechaBeast extends Monster {

    /** Armor rating value (1-100) */
    private int armorRating;

    /**
     * Default constructor for MechaBeast.
     */
    public MechaBeast() {
        super();
        setCategory("Sci-Fi");
        setType("MechaBeast");
        this.armorRating = 70;
    }

    /**
     * Constructs a MechaBeast with values.
     *
     * @param name monster name
     * @param level monster level
     * @param health monster health
     * @param attack monster attack
     * @param defense monster defense
     * @param armorRating armor rating value
     */
    public MechaBeast(String name, int level, int health, int attack, int defense, int armorRating) {
        super(name, "Sci-Fi", "MechaBeast", level, health, attack, defense);
        this.armorRating = armorRating;
    }

    /**
     * Prints MechaBeast special power (polymorphism).
     */
    @Override
    public void specialPowers() {
        System.out.println(getName() + " (MechaBeast) uses: " + getSpecialPower());
    }

    /**
     * Returns armor rating.
     *
     * @return armor rating
     */
    public int getArmorRating() {
        return armorRating;
    }

    /**
     * Sets armor rating.
     *
     * @param armorRating armor rating
     */
    public void setArmorRating(int armorRating) {
        this.armorRating = armorRating;
    }
}
