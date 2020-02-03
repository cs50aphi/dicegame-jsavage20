import java.util.Scanner;


public class dieDriver
{

    public static void main(String[] args)
    {
        boolean gameOver = false;
        int location1 = 0;
        int location2 = 0;
        int goal = 100;
        int bust = 0;
        // create players
        Die p1 = new Die();
        Die p2 = new Die();
        Die rando = new Die();
        Scanner kb = new Scanner(System.in);
        //while gameOver is false
        // roll for p1
        while (!gameOver)
        {
            int rebut = rando.roll();
            int tempRoll1 = p1.roll();
            int tempRoll2 = p2.roll();
            //p1
             //check to see if p1 has won
            if (location1 + tempRoll1 == goal) {
                System.out.println("p1 rolled a " + tempRoll1);
                System.out.println("player 1 has a score of 100! p1 has rolled a " + tempRoll1);
                System.out.println();
                System.out.println("player 2: roll a higher number to win!");
                lastRoll();
                System.out.println("you rolled a " + rebut);
                if (rebut >= tempRoll1)
                {
                    System.out.println("PLAYER 2 HAS WONNNNNN!");
                }
                System.out.println("sorry player 1 has won");
                gameOver = true;
                break;
            }
            else if (location1 + tempRoll1 < goal && !gameOver) {
                location1 += tempRoll1;
                System.out.println("p1 rolled a " + tempRoll1);

            }
            else {
                bust = location1 + tempRoll1;
                System.out.println("you went over, your score is: " + bust);
            }
            //player2
            if (location2 + tempRoll2 == goal) {
                System.out.println("p2 rolled a " + tempRoll2);
                System.out.println("player 2 has a score of 100!");
                System.out.println();
                System.out.println("player 1: roll a higher number to win!");
                lastRoll();
                System.out.println("you rolled a " + rebut);
                if (rebut >= tempRoll2)
                {
                    System.out.println("PLAYER 1 HAS WONNNNNN!");
                }
                System.out.println("sorry, player 2 won");
                gameOver = true;
                break;
            }
            else if (location2 + tempRoll2 < goal && !gameOver) {
                location2 += tempRoll2;
                System.out.println("p2 rolled a " + tempRoll2);

            }
            else {
                bust = location2 + tempRoll2;
                System.out.println("you went over, your score is: " + bust);
            }
            if (!gameOver)
            {
                System.out.println("player 1 is at " + location1);
                System.out.println("player 2 is at " + location2);
                pause();
            }

        }
        // if p1 has won set gameOver to true
        // add roll to location 1
        // repeat for player 2
        // Scanner kb = new Scanner(System.in);
        // System.out.println("How many sides to the die? ");
        // int s = kb.nextInt();
        // Die d = new Die(s);
        // int roll = d.roll();
        // System.out.println("you rolled a " + roll);
    }
    public static void pause()
    {
        Scanner i = new Scanner(System.in);
        System.out.println("Press any key to continue");
        i.nextLine();
    }
    public static void lastRoll()
    {
        Scanner i = new Scanner(System.in);
        System.out.println("Press any key to roll the die");
        i.nextLine();
    }
}