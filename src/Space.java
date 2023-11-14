import com.sun.jdi.request.ThreadDeathRequest;

public class Space {

    private Treasure cache;

    public Treasure getCache() {
        return cache;
    }

    public Space(Treasure cache){

    }

    public void setCache(Treasure cache) {
        this.cache = null;
    }

    public LivingThing occupant;

    public Space() {
        {
            setOccupant(null);
        }
    }

    public Space(LivingThing occupant){
        this.setOccupant(occupant);
    }

    public String getConsoleStr(){
        if(occupant == null){
            return "- ";
        }else{
            return occupant.getConsoleStr();
        }
    }

    public LivingThing getOccupant() {
        return occupant;
    }

    public void setOccupant(LivingThing occupant) {
        this.occupant = occupant;
    }
}
