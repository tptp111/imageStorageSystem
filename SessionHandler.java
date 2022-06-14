import java.util.concurrent.TimeUnit;
//import database to be used


public class SessionHandler
{
    private String emailAddress;
    private String password;

    public SessionHandler()
    {
        emailAddress = " ";
        password = " ";
    }

    public void sessionHandlerStart()
    {
        startMenu(emailAddress, password);
    }

    private void welcomeScreen()
    {
        clearScreen(10);
        System.out.println("\n\t\t                               IMAGE STORAGE SYSTEM" +
                "\r\n\n" + "Welcome to the image storage system, where you can upload images and search for them based on certain characteristics.");
        sleep(5);
        clearScreen(5);
    }

    /**
     * This method will
     *
     */
    public void startMenu(String emailAddress, String password)
    {
        Input input = new Input();
        welcomeScreen();
        System.out.println("1: Login" + "\r\n" + "2: Sign-up");

        boolean flag = false;
        do
        {
            String userInput = input.acceptStringInput("\nPlease enter 1 to login or 2 to signup: ");

            switch (userInput)
            {
                case ("1"):
                    login(emailAddress, password);//, DatabaseManager DB);
                    flag = true;
                    break;
                case ("2"):
                    createUser(emailAddress, password);//, DatabaseManager DB);
                    flag = true;
                    break;
                default:
                    flag = false;
                    System.out.println("Please select either 1 or 2.");
            }
        } while (flag == false);
    }



    /**
     * Creates the account set up screen for JobSeeker and Recruiter.
     *
     * @param emailAddress the email address of the user as a String
     * @param db           The database manager object being used.
     * @return a User object
     */
    private User createUser(String emailAddress, String password)//, DatabaseManager db)
    {
        clearScreen(10);
        User user = new User(emailAddress, password);
        System.out.println("**** SIGN-UP ****\n");
        emailAddress = enterEmail();
        password = enterPassword();

        //user details needs to be entered onto database
        System.out.println("You are now sign-up and will be redirect to the login page.");
        login(emailAddress, password);
        return user;//insertedUser;
    }



    private User login(String email, String password)// DatabaseManager db)
    {
        clearScreen(10);
        System.out.println("**** LOGIN ****\n");
        enterEmail();
        //check if email is already in the database
        //loop:  if email is in database, proceed to ask for password, else if email doesn't exits, return does not exist please try again.
        enterPassword();
        User user = new User(emailAddress, password);
        System.out.println("\nLogin successful");
        userAction();
        return user;
    }


    /**
     * Enter method to ask the user to enter their email address.
     *
     * @return the user's email address as a String.
     */
    private String enterEmail()
    {
        Validation validation = new Validation();
        Input input = new Input();
        String inputEmail;
        inputEmail = input.acceptStringInput("Please enter your email address:");
        while (!validation.isValidEmail(inputEmail))
        {
            inputEmail = input.acceptStringInput("Invalid email.  Please enter your email address again:");
        }
        return inputEmail;
    }

    public String enterPassword()
    {
        Validation validation = new Validation();
        Input input = new Input();
        String inputPassword;
        String confirmedPassword;
        do
        {
            //validation.resetAttempts();
            inputPassword = input.acceptStringInput("\nPlease enter a password that matches the following criteria:\n  1. Has at least 8 characters in length.\n  2. Includes at least one capital and one lower case letter.\n  3. Includes at least one number and one special character.").strip();
            while (!validation.isValidPassword(inputPassword))
            {
                inputPassword = input.acceptStringInput("The password you entered does not match the criteria.  Please ensure your password:\n  1. Has at least 8 characters in length.\n  2. Includes at least one capital and one lower case letter.\n  3. Includes at least one number and one special character.").strip();
            }
            confirmedPassword = input.acceptStringInput("Please re-enter your password: ").strip();

            if (!inputPassword.equals(confirmedPassword))
            {
                System.out.println("Your password does not match. Please try again: ");
            }

        } while (!inputPassword.equals(confirmedPassword));

        return confirmedPassword;
    }





    public void imageUpload()
    {
        clearScreen(10);
        System.out.println("image upload");
    }

    public void submitQuery()
    {
        clearScreen(10);
        System.out.println("Submit a query");

        // TODO: View query results.
    }


    public void userAction()
    {
        clearScreen(10);
        Input input = new Input();
        System.out.println("1: Upload an Image" + "\r\n" + "2: Submit a query");

        boolean flag = false;
        do
        {
            String userInput = input.acceptStringInput("\nPlease enter 1 to upload an image or 2 to submit a query: ");

            switch (userInput)
            {
                case ("1"):
                    imageUpload();
                    flag = true;
                    break;
                case ("2"):
                    submitQuery();
                    flag = true;
                    break;
                default:
                    flag = false;
                    System.out.println("Please select either 1 or 2.");
            }
        } while (flag == false);
    }




    /**
     * This puts a specified delay on moving to the next line of code.
     *
     * @param seconds The delay time, in seconds.
     */
    public static void sleep(int seconds)
    {
        try
        {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (Exception ignored)
        {
        }
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
