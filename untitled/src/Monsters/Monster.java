package Monsters;

/**
 * Abstract Monster parent class
 */
public abstract sealed class Monster
        permits Vampire, Zombie, Dragon {

    private String name;
    private int health;
    private SpecialPower specialPower;

    public Monster(String name, int health) {
        this.name = name;
        this.health = health;
    }

    /** Getters & Setters */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public SpecialPower getSpecialPower() {
        return specialPower;
    }

    public void setSpecialPower(SpecialPower specialPower) {
        this.specialPower = specialPower;
    }

    /** Polymorphic method */
    public abstract void specialPowers();
}
