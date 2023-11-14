public class LivingThing {
    String name;
    int health;
    String pieceColor;

    public LivingThing(String name, int health){
        this.name = name;
        this.health = health;
        setPieceColor(ConsoleColors.YELLOW);
    }

    public LivingThing(String name, int health, String pieceColor){
        this.name = name;
        this.health = health;
        this.pieceColor = pieceColor;
    }

    public LivingThing(){

    }

    public String getConsoleStr(){
        return pieceColor + String.valueOf(name.charAt(0)).toUpperCase() + ConsoleColors.RESET + " ";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.trim();
        if(name == ""){
            name = "undefined";
        }
    }
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if(health < 0){
            this.health = health;
        }else{
            health = 0;
        }

    }

    public String getPieceColor() {
        return pieceColor;
    }

    public void setPieceColor(String pieceColor) {
        this.pieceColor = pieceColor;
    }



}
