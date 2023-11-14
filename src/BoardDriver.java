import java.util.Scanner;

public class BoardDriver {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Board b = new Board(8,9);
        while (true){
            b.BuildBoard();
            b.printBoard(false);
            System.out.print("Enter w to go up, a to go left, s to go down, and d to go right -> ");
            char userIn = input.next().charAt(0);
            b.move(userIn);
        }


    }
}
