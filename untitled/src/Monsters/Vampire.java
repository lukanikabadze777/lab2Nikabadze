package Monsters;

public final class Vampire extends Monster {

    private int biteDamage;

    public Vampire(String name, int health, int biteDamage) {
        super(name, health);
        this.biteDamage = biteDamage;
    }

    public int getBiteDamage() {
        return biteDamage;
    }

    public void setBiteDamage(int biteDamage) {
        this.biteDamage = biteDamage;
    }

    @Override
    public void specialPowers() {
        System.out.println("Vampire power: " + getSpecialPower());
    }
}
