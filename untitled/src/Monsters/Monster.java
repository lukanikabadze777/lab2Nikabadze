package Monsters;

/**
 * File: Monster.java
 * Name: Luka Nikabadze
 * Course: IST 242, Section 001: Inter OO App Dev
 * Assignment: Solo Lab 2
 *
 * Description:
 * Abstract sealed parent class that represents a Monster.
 * This class demonstrates abstraction and supports polymorphism through
 * the specialPowers() method which is implemented in child classes.
 */
public abstract sealed class Monster permits Hydra, Minotaur, MechaBeast {

    /** Monster name */
    private String name;

    /** Monster category (example: Mythic or Sci-Fi) */
    private String category;

    /** Monster type/species (example: Hydra, Minotaur, MechaBeast) */
    private String type;

    /** Monster level */
    private int level;

    /** Monster health points */
    private int health;

    /** Monster attack stat */
    private int attack;

    /** Monster defense stat */
    private int defense;

    /** Monster special power */
    private SpecialPower specialPower;

    /**
     * Default constructor that sets basic default values.
     */
    public Monster() {
        this.name = "Unknown";
        this.category = "Unknown";
        this.type = "Unknown";
        this.level = 1;
        this.health = 100;
        this.attack = 10;
        this.defense = 5;
        this.specialPower = SpecialPower.LASER_BEAM;
    }

    /**
     * Constructs a Monster using the provided values.
     *
     * @param name monster name
     * @param category monster category
     * @param type monster type/species
     * @param level monster level
     * @param health monster health
     * @param attack monster attack
     * @param defense monster defense
     */
    public Monster(String name, String category, String type, int level, int health, int attack, int defense) {
        this.name = name;
        this.category = category;
        this.type = type;
        this.level = level;
        this.health = health;
        this.attack = attack;
        this.defense = defense;
        this.specialPower = SpecialPower.LASER_BEAM;
    }

    /**
     * Prints the monster's special power.
     * Child classes implement this method (polymorphism).
     */
    public abstract void specialPowers();

    /**
     * Returns the monster name.
     *
     * @return monster name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the monster name.
     *
     * @param name monster name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the monster category.
     *
     * @return category
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the monster category.
     *
     * @param category category
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     * Returns the monster type/species.
     *
     * @return type/species
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the monster type/species.
     *
     * @param type monster type/species
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * Returns the monster level.
     *
     * @return level
     */
    public int getLevel() {
        return level;
    }

    /**
     * Sets the monster level.
     *
     * @param level monster level
     */
    public void setLevel(int level) {
        this.level = level;
    }

    /**
     * Returns the monster health.
     *
     * @return health
     */
    public int getHealth() {
        return health;
    }

    /**
     * Sets the monster health.
     *
     * @param health monster health
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     * Returns the monster attack stat.
     *
     * @return attack
     */
    public int getAttack() {
        return attack;
    }

    /**
     * Sets the monster attack stat.
     *
     * @param attack monster attack stat
     */
    public void setAttack(int attack) {
        this.attack = attack;
    }

    /**
     * Returns the monster defense stat.
     *
     * @return defense
     */
    public int getDefense() {
        return defense;
    }

    /**
     * Sets the monster defense stat.
     *
     * @param defense monster defense stat
     */
    public void setDefense(int defense) {
        this.defense = defense;
    }

    /**
     * Returns the monster special power.
     *
     * @return special power
     */
    public SpecialPower getSpecialPower() {
        return specialPower;
    }

    /**
     * Sets the monster special power.
     *
     * @param specialPower special power
     */
    public void setSpecialPower(SpecialPower specialPower) {
        this.specialPower = specialPower;
    }
}
