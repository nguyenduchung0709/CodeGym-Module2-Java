package validate_email;

public class EmailExampleTest {
    public static EmailExample emailExample = new EmailExample();
    public static final String[] validEmail = new String[]{"a@gmail.com", "abc@gmail.com", "hung123@gmail.com", "123@gmail.com"};
    public static final String[] invalidEmail = new String[]{"@gmail.com", "hung$%#@gmail.com", "@gmail.com", "@@@@@gmail.com"};


    public static void main(String[] args) {
        for (String email : validEmail) {
            boolean isValid = emailExample.validate(email);
            System.out.println("Email: " + email + " isValid: " + isValid);
        }

        for (String email : invalidEmail) {
            boolean isValid = emailExample.validate(email);
            System.out.println("Email: " + email + " isInvalid: " + isValid);
        }
    }
}
