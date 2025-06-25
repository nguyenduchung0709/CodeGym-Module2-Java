package validate_classname;

public class ClassNameTest {
    public static String[] validClassName = {"C0223G", "A7483I", "I2749K", "D9802I"};
    public static String[] inValidClassName = {"9876", "a0978I", "A9870U", "O98730", "$09781"};

    public static void main(String[] args) {
        ClassName className = new ClassName();
        for (String name : validClassName) {
            boolean isValid = className.validateClassName(name);
            System.out.println("ClassName " + name + " isValid: " + isValid);
        }

        for (String name : inValidClassName) {
            boolean inValid = className.validateClassName(name);
            System.out.println("ClassName " + name + " isValid: " + inValid);
        }
    }
}
