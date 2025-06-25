package validate_classname;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassName {
    public static final String CLASSNAME_REGEX = ("^[A-Z]\\d{4}[IHGK]$");
    public static Matcher matcher;

    public ClassName() {
    }

    public boolean validateClassName(String regex) {
        Pattern pattern = Pattern.compile(CLASSNAME_REGEX);
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
