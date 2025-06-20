public abstract class Character implements Creature {
    protected String name;
    public int hp;

    public Character(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public abstract void attack(Character target);

    public final boolean isAlive() {
        return this.hp > 0;
    }

    public void showStatus() {
        System.out.println(this.name + "：HP " + this.hp);
    }
}
