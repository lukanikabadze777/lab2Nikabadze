package Monsters;

/**
 * File: Minotaur.java
 * Name: Luka Nikabadze
 * Course: IST 242, Section 001: Inter Oo App Dev
 * Assignment: Solo Lab 2
 */
public final class Minotaur extends Monster {

    private int hornSharpness; // 1-100

    public Minotaur() {
        super();
        setCategory("Mythic");
        setType("Minotaur");
        this.hornSharpness = 50;
    }

    public Minotaur(String name, int level, int health, int attack, int defense, int hornSharpness) {
        super(name, "Mythic", "Minotaur", level, health, attack, defense);
        this.hornSharpness = hornSharpness;
    }

    @Override
    public void specialPowers() {
        System.out.println(getName() + " (Minotaur) uses: " + getSpecialPower());
    }

    public int getHornSharpness() { return hornSharpness; }
    public void setHornSharpness(int hornSharpness) { this.hornSharpness = hornSharpness; }
}
