
import java.util.regex.Matcher;
import java.util.regex.Pattern;
class emailValidator
{
 private Pattern pattern;
 private Matcher matcher;
 private static final String EMAIL_PATTERN="^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"+"[_A-Za-z0-9-]+(\\.[_A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
public emailValidator()
{
    pattern=Pattern.compile(EMAIL_PATTERN);
}
public boolean validate(final String hex)
{
    matcher=pattern.matcher(hex);
    return matcher.matches();
}
}   

