
//import SessionHandler;

public class ImageStorageSystem
{

    public static void main(String[] args)
    {
        ImageStorageSystem program = new ImageStorageSystem();
        program.run();
        //program.exit();
    }

    public void run()
    {
        SessionHandler sessionHandler = new SessionHandler();
        sessionHandler.sessionHandlerStart();
    }
}
