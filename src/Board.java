import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Board {
    ArrayList<ArrayList<Space>> board;
    ArrayList<Treasure> remainingTreasures;
    int rows = 0;
    int cols = 0;
    int gazooRow = 0;
    int gazooCol = 0;

    Explorer Gazoo = new Explorer("Gazoo", 20, ConsoleColors.GREEN);

    private static Scanner input = new Scanner(System.in);
    public Board(){
        board = new ArrayList<>();
        cols = 4;
        rows = 4;
        BuildBoard();
    }

    public Board(int rows, int cols){
        board = new ArrayList<>();
        this.cols = cols;
        this.rows = rows;
        BuildBoard();
    }

    public void createTreasures(){
        Treasure treasure1 = new Treasure("Gold", 500);
        Treasure treasure2 = new Treasure("Gold", 500);
        Treasure treasure3 = new Treasure("Gold", 500);
        Treasure treasure4 = new Treasure("Gold", 500);
        Treasure treasure5 = new Treasure("Gold", 500);

    }

    public void printBoard(boolean showContents) {
        String toString;
        {
            String result = "";
            for (int i = 0; i < board.size(); i++) {
                for (int j = 0; j < board.get(i).size(); j++) {
                    result += board.get(i).get(j).getConsoleStr();

                }
                result += System.lineSeparator();
            }
            System.out.println(result);
        }


    }

    public void createHealer(){
        Healer Healer = new Healer("Healer", 1, ConsoleColors.BLUE, 5);

    }

    public void createMonsters(){
        Monster monster1 = new Monster("Razorclaw", 3, ConsoleColors.RED, 9);
        Monster monster2 = new Monster("Gloomfury", 3, ConsoleColors.RED, 8);
        Monster monster3 = new Monster("Fangsnarl", 3, ConsoleColors.RED, 7);
        Monster monster4 = new Monster("Vilespike", 3, ConsoleColors.RED, 6);
        Monster monster5 = new Monster("Grimscowl", 3, ConsoleColors.RED, 5);
    }

    public void BuildBoard(){
        board.clear();
        for(int i = 0; i < this.rows; i++) {
            board.add(new ArrayList<Space>());
            for (int x = 0; x < this.cols; x++) {
                board.get(i).add(new Space());
            }
        }
        board.get(gazooRow).get(gazooCol).setOccupant(Gazoo);
    }

    public void placeEntity(Object entity){

        if (entity instanceof LivingThing){

            LivingThing l = (LivingThing) entity;

            boolean placed = false;

            while (!placed){

                int randRow = ThreadLocalRandom.current().nextInt(rows);

                int randCol = ThreadLocalRandom.current().nextInt(cols);

                Space space = board.get(randRow).get(randCol);

                //if ((!space)) {
                    continue;
                //}

                //space.setOccupant(l);

                //placed = true;

            }

        }else if(entity instanceof Treasure){

            Treasure t = (Treasure) entity;

            boolean placed = false;

            while (!placed){

                int randRow = ThreadLocalRandom.current().nextInt(rows);

                int randCol = ThreadLocalRandom.current().nextInt(cols);

                Space space = board.get(randRow).get(randCol);

                //if (emptySpace(space)){

                    //space.setCache(t);

                    //placed = true;

                //}

            }

        }

    }

    public void placeEntities(ArrayList<?> entityList){

        for (Object entity : entityList) {

            placeEntity(entity);

        }

    }

    public boolean move(char m) {
        if (m == 'w') {
            return moveReal(0, -1);
        } else if (m == 'a') {
            return moveReal(-1, 0);
        } else if (m == 's') {
            return moveReal(0, 1);
        } else if (m == 'd') {
            return moveReal(1, 0);
        } else if (m == 'r') {
            printBoard(true);
        } else {
            System.out.println("Illegal input");
            return false;
        }
        return false;
    }

    public boolean validSpace(int x, int y){
        return x >= 0 && x < board.get(0).size() && y >= 0 && y < board.size();
    }

    public boolean moveReal(int x, int y){
        int newX = gazooCol + x;
        int newY = gazooRow + y;
        if(validSpace(newX, newY)){
            gazooCol = newX;
            gazooRow = newY;
            return true;
        }
        return false;
    }
}
