import java.util.ArrayList;
public class Explorer extends LivingThing{
    ArrayList<Treasure> treasures;
    public Explorer(String name, int health, String pieceColor){
        super(name, health, pieceColor);
        treasures = new ArrayList<>();
    }

    public void addTreasure(Treasure treasure){

    }

    public void getTreasureValue(){

    }

    public ArrayList<Treasure> getTreasures() {
        return treasures;
    }
}
