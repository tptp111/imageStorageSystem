import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation
{

    public boolean isValidPassword(String password)
    {
        Pattern passwordPattern = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[$&+,:;=?@#|'<>.^*()%!~`{}/-])[A-Za-z\\d$&+,:;=?@#|'<>.^*()%!~`{}/-]{8,}$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = passwordPattern.matcher(password);
        return matcher.find();
    }

    public boolean isValidEmail(String input)
    {
        Pattern emailPattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = emailPattern.matcher(input);
        return matcher.find();
        //return false;
    }
}
