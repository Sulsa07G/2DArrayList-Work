public class Monster extends LivingThing{
    int damage;

    public Monster(String name, int health, String pieceColor, int damage){
        super(name, health, pieceColor);
        this.damage = damage;
    }

    public void hurt(LivingThing livingThing){
        setHealth(getHealth() - damage);
    }

    public int getDamage() {
        return damage;
    }
}
