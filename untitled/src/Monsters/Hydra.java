package Monsters;

/**
 * File: Hydra.java
 * Name: Luka Nikabadze
 * Course: IST 242, Section 001: Inter OO App Dev
 * Assignment: Solo Lab 2
 *
 * Description:
 * Concrete monster type: Hydra.
 * This class extends Monster and adds headCount.
 */
public final class Hydra extends Monster {

    /** Number of heads for the Hydra */
    private int headCount;

    /**
     * Default constructor for Hydra.
     */
    public Hydra() {
        super();
        setCategory("Mythic");
        setType("Hydra");
        this.headCount = 5;
    }

    /**
     * Constructs a Hydra with values.
     *
     * @param name monster name
     * @param level monster level
     * @param health monster health
     * @param attack monster attack
     * @param defense monster defense
     * @param headCount number of heads
     */
    public Hydra(String name, int level, int health, int attack, int defense, int headCount) {
        super(name, "Mythic", "Hydra", level, health, attack, defense);
        this.headCount = headCount;
    }

    /**
     * Prints Hydra special power (polymorphism).
     */
    @Override
    public void specialPowers() {
        System.out.println(getName() + " (Hydra) uses: " + getSpecialPower());
    }

    /**
     * Returns head count.
     *
     * @return head count
     */
    public int getHeadCount() {
        return headCount;
    }

    /**
     * Sets head count.
     *
     * @param headCount number of heads
     */
    public void setHeadCount(int headCount) {
        this.headCount = headCount;
    }
}
