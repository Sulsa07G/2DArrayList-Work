import java.util.ArrayList;

public class Healer extends LivingThing{
    int healValue;

    public Healer(String name, int health, String pieceColor, int healValue){
        super(name, health, pieceColor);
        this.healValue = healValue;
    }

    public void Heal(LivingThing livingThing){
        setHealth(getHealth() + healValue);
    }

    public int getHealValue() {
        return healValue;
    }
}
