package validate_account;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AccountExample {
    public static final String ACCOUNT_REGEX = "^[_a-z0-9]{6,}$";
    public static Matcher matcher;

    public AccountExample() {
    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(ACCOUNT_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
