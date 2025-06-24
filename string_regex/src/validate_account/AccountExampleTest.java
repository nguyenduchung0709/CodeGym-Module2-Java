package validate_account;

public class AccountExampleTest {

    public static final String[] validName = {"123abc", "_abc123", "__________", "123456", "abcdefg"};
    public static final String[] inValidName = {"@name", "NAMEHUWONF", "andy", "duc.hung", "AKJ45"};


    public static void main(String[] args) {
        AccountExample accountExample = new AccountExample();
        for (String name : validName) {
            boolean isValid = accountExample.validate(name);
            System.out.println("Name: " + name + " is a valid name: " + isValid);
        }

        for (String name : inValidName) {
            boolean isValid = accountExample.validate(name);
            System.out.println("Name: " + name + " is not a valid name: " + isValid);
        }
    }
}
