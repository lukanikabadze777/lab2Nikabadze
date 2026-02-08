package Monsters;

/**
 * File: Monster.java
 * Name: Luka Nikabadze
 * Course: IST 242, Section 001: Inter Oo App Dev
 * Assignment: Solo Lab 2
 */
public abstract sealed class Monster permits Hydra, Minotaur, MechaBeast {

    private String name;
    private String category;   // Mythic or Sci-Fi
    private String type;       // Hydra / Minotaur / MechaBeast
    private int level;
    private int health;
    private int attack;
    private int defense;
    private SpecialPower specialPower;

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

    // Polymorphism: each child implements this
    public abstract void specialPowers();

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public int getLevel() { return level; }
    public void setLevel(int level) { this.level = level; }

    public int getHealth() { return health; }
    public void setHealth(int health) { this.health = health; }

    public int getAttack() { return attack; }
    public void setAttack(int attack) { this.attack = attack; }

    public int getDefense() { return defense; }
    public void setDefense(int defense) { this.defense = defense; }

    public SpecialPower getSpecialPower() { return specialPower; }
    public void setSpecialPower(SpecialPower specialPower) { this.specialPower = specialPower; }
}
