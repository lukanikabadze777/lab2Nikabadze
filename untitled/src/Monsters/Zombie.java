package Monsters;

public final class Zombie extends Monster {

    private int infectionLevel;

    public Zombie(String name, int health, int infectionLevel) {
        super(name, health);
        this.infectionLevel = infectionLevel;
    }

    public int getInfectionLevel() {
        return infectionLevel;
    }

    public void setInfectionLevel(int infectionLevel) {
        this.infectionLevel = infectionLevel;
    }

    @Override
    public void specialPowers() {
        System.out.println("Zombie power: " + getSpecialPower());
    }
}
