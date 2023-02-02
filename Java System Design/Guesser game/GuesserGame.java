import java.util.Scanner;

class Player {
    Scanner sc = new Scanner(System.in);
    int numGuessed;

    public void guessNum() {
        System.out.println("Hey Player, guess the number");
        numGuessed= sc.nextInt();
    }

}


class Guesser {
    Scanner sc = new Scanner(System.in);
    int numGuessed;

    public void guessTheNumber() {
        System.out.println("Hey Guesser guess the number");
        numGuessed= sc.nextInt();
    }

    
}

class Umpire {

    Guesser guesser;
    Player p1,p2,p3;

    public void getNumberFromGuesser() {
        guesser = new Guesser();
        guesser.guessTheNumber();
    }

    public void collectFromPlayer() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        p1.guessNum();
        p2.guessNum();
        p3.guessNum();
    }

    public void calcResult() {
        System.out.println(guesser.numGuessed + " "+ p1.numGuessed+ " "+ p2.numGuessed+ " "+ p3.numGuessed );
        if (guesser.numGuessed == p1.numGuessed) {
            if (guesser.numGuessed == p2.numGuessed && guesser.numGuessed == p3.numGuessed) {
                System.out.println("All Won the Game!!");
            } else if (guesser.numGuessed == p2.numGuessed) {
                System.out.println("Player 1 and 2 Won!!");
            } else if (guesser.numGuessed == p3.numGuessed) {
                System.out.println("Player 1 and 3 Won!!");
            } else {
                System.out.println("player 1 won!!");
            }
        } else if (guesser.numGuessed == p2.numGuessed) {
            if (guesser.numGuessed == p3.numGuessed) {
                System.out.println("Player 2 and 3 won!!");
            } else {
                System.out.println("Player 2 won");
            }
        } else if (guesser.numGuessed == p3.numGuessed) {
            System.out.println("Player 3 Won!! ");
        } else {
            System.out.println("No one won!!");
        }
    }

}


class GuesserGame {
    public static void main(String[] args) {
        Umpire Up = new Umpire();
        Up.getNumberFromGuesser();
        Up.collectFromPlayer();
        Up.calcResult();
    }
}