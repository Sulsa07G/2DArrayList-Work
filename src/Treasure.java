public class Treasure {

    private int value;
    private String description;

    public Treasure(String description, int value){

    }

    public Treasure(){
        value = 5;
        description = "gold";
    }

    public String getConsoleStr(){
        return ConsoleColors.YELLOW + description.charAt(0) + ConsoleColors.RESET;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
