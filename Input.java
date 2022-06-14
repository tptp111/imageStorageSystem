import java.util.Scanner;

public class Input
{

    public Input()
    {

    }

    public char acceptCharInput(String displayMessage,int position)
    {
        Scanner console = new Scanner(System.in);
        System.out.println(displayMessage);
        String input = console.nextLine();
        /*if(input.length() - 1 < position)
        {
            System.out.println("Invalid Input");
        }*/
        return input.charAt(position);
    }

    public double acceptDoubleInput(String displayMessage)
    {
        Scanner console = new Scanner(System.in);
        System.out.println(displayMessage);
        double input = console.nextDouble();
        console.nextLine();
        return input;
    }

    public int acceptIntegerInput(String displayMessage)
    {
        Scanner console = new Scanner(System.in);
        System.out.println(displayMessage);
        int input = console.nextInt();
        console.nextLine();
        return input;
    }

    public String acceptStringInput(String displayMessage)
    {
        Scanner console = new Scanner(System.in);
        System.out.println(displayMessage);
        String input = console.nextLine();
        return input;
    }

    /**
     * This method pushes the console with a specified number of empty new lines.
     *
     * @param lines The specified number of lines.
     */
    public static void clearScreen(int lines)
    {
        for (int i = 0; i < lines; i++)
        {
            System.out.println();
        }
    }
}