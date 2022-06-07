import java.util.Scanner;

public class dragonCaveV3 {
    public void main(String[] args) {
        playGame();
    }

    private int choice, outcome;

    private void displayStart()
    {
        System.out.println("\nYou are in place that is full of different dragons. \nThere is a fork in the path ahead that has two caves. \n" +
                "Each cave has a dragon inside of it. \nOne has a friendly dragon inside that will share his treasure with you. \n" +
                "The other has a hungry dragon that will eat you. \nWhich cave will you go into? \n");
    }

    private void setChoice()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Make your choice (1 or 2): ");
        String input = scan.next();
        choice = Integer.parseInt(input);
    }

    public int getChoice()
    {
        setChoice();
        return choice;
    }

    private void setOutcome()
    {
        outcome = (Math.random() <= 0.5) ? 1 : 2;
    }

    public int getOutcome()
    {
        setOutcome();
        return outcome;
    }

    public void computeOutcome()
    {
        if(getOutcome() == getChoice())
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

    public void playGame()
    {
        displayStart();
        computeOutcome();

    }

}
