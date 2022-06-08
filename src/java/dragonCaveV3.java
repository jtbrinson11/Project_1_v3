import java.util.Scanner;

public class dragonCaveV3 {
    protected static int choice, outcome;

    private static void displayStart()
    {
        System.out.println("\nYou are in place that is full of different dragons. \nThere is a fork in the path ahead that has two caves. \n" +
                "Each cave has a dragon inside of it. \nOne has a friendly dragon inside that will share his treasure with you. \n" +
                "The other has a hungry dragon that will eat you. \nWhich cave will you go into? \n");
    }

    public static void setChoice(int input)
    {
        choice = input;
    }

    public static int getChoice()
    {
        return choice;
    }

    public static void processOutcome()
    {
        outcome = (Math.random() <= 0.5) ? 1 : 2;

        if(outcome == getChoice())
        {
            System.out.println("You approach the cave and carefully step in . . . \n" +
                    "It's dark, cold, and moist . . . \n" +
                    "You hear a noise! A dragon is staring directly at you! \n" +
                    "It charges towards you, and eats you where you stand! \nThe End");
        }
        else
        {
            System.out.println("You approach the cave and carefully step in . . . \n" +
                    "You have a strange feeling walking inside . . . \n" +
                    "You spot a dragon! But it's just sitting there. \n" +
                    "It moves off to the side, to share its treasure with you. \nThe End");
        }
    }

    public static void playGame()
    {
        displayStart();

        Scanner scan = new Scanner(System.in);
        System.out.println("Make your choice (1 or 2): ");
        String input = scan.next();
        try {
            choice = Integer.parseInt(input);
        }
        catch (Exception e)
        {
            choice = 1;
            System.out.println("Oops, invalid input. Setting to default 1 . . .\n");
        }
        setChoice(choice);
        processOutcome();
    }

    public static void main(String[] args) {

        playGame();
    }

}
