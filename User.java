public class User
{

    private String email;
    private String password;


    /**
     * Default constructor which creates the object of the User class.
     */
    public User()
    {
        email = "";
        password = "";
    }

    /**
     * Non-default constructor which creates the object of the User class
     *
     * @param email       Accepts the user's email as a String.
     * @param password    Accepts the user's password as a String.
     */
    public User(String email, String password)
    {
        this.email = email;
        this.password = password;
    }

    /**
     * Display method to print the state of the object.
     */
    public void display()
    {
        System.out.println("email: " + email);
        System.out.println("password: " + password);
    }

    /**
     * Accessor method to get the user's email address.
     *
     * @return The user's email as a string.
     */
    public String getEmail()
    {
        return email;
    }

    /**
     * Accessor method to the get user's password.
     *
     * @return The user's password as a string.
     */
    public String getPassword()
    {
        return password;
    }

    /**
     * Mutator method to set the user's email.
     *
     * @param email The user's email as a string.
     */
    public void setEmail(String email)
    {
        this.email = email;
    }

    /**
     * Mutator method to set the users password.
     *
     * @param password The user's password as a string.
     */
    public void setPassword(String password)
    {
        this.password = password;
    }
}
