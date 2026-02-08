package Monsters;

/**
 * File: Minotaur.java
 * Name: Luka Nikabadze
 * Course: IST 242, Section 001: Inter OO App Dev
 * Assignment: Solo Lab 2
 *
 * Description:
 * Concrete monster type: Minotaur.
 * This class extends Monster and adds hornSharpness.
 */
public final class Minotaur extends Monster {

    /** Horn sharpness value (1-100) */
    private int hornSharpness;

    /**
     * Default constructor for Minotaur.
     */
    public Minotaur() {
        super();
        setCategory("Mythic");
        setType("Minotaur");
        this.hornSharpness = 50;
    }

    /**
     * Constructs a Minotaur with values.
     *
     * @param name monster name
     * @param level monster level
     * @param health monster health
     * @param attack monster attack
     * @param defense monster defense
     * @param hornSharpness horn sharpness value
     */
    public Minotaur(String name, int level, int health, int attack, int defense, int hornSharpness) {
        super(name, "Mythic", "Minotaur", level, health, attack, defense);
        this.hornSharpness = hornSharpness;
    }

    /**
     * Prints Minotaur special power (polymorphism).
     */
    @Override
    public void specialPowers() {
        System.out.println(getName() + " (Minotaur) uses: " + getSpecialPower());
    }

    /**
     * Returns horn sharpness.
     *
     * @return horn sharpness
     */
    public int getHornSharpness() {
        return hornSharpness;
    }

    /**
     * Sets horn sharpness.
     *
     * @param hornSharpness horn sharpness
     */
    public void setHornSharpness(int hornSharpness) {
        this.hornSharpness = hornSharpness;
    }
}
