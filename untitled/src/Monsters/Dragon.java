package Monsters;

public final class Dragon extends Monster {

    private int fireRange;

    public Dragon(String name, int health, int fireRange) {
        super(name, health);
        this.fireRange = fireRange;
    }

    public int getFireRange() {
        return fireRange;
    }

    public void setFireRange(int fireRange) {
        this.fireRange = fireRange;
    }

    @Override
    public void specialPowers() {
        System.out.println("Dragon power: " + getSpecialPower());
    }
}
