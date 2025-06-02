package thuc_hanh_stack_su_dung_linkedlist;

public class GenericStackClient {
    public void stackOfStrings() {
        MyGenericStack<String> stack = new MyGenericStack<>();
        stack.push("One");
        stack.push("Two");
        stack.push("Three");
        stack.push("Four");
        stack.push("Five");

        System.out.println("The size of stack after pushing is: " + stack.size());

        System.out.println("Popping elements from stack:");
        while (!stack.isEmpty()) {
            System.out.printf(" %s " , stack.pop());
        }
        System.out.println("\n The size of stack after popping is: " + stack.size() + "\n");
    }
    public void stackOfIntegers() {
        MyGenericStack<Integer> stack = new MyGenericStack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println("The size of stack after pushing is: " + stack.size());

        System.out.println("Popping elements from stack:");
        while (!stack.isEmpty()) {
            System.out.printf(" %s", stack.pop());
        }

        System.out.println("\n The size of stack after popping is: " + stack.size());


    }

    public static void main(String[] args) {
        GenericStackClient client = new GenericStackClient();
        System.out.println("Stack of strings:");
        client.stackOfStrings();
        System.out.println("Stack of integers:");
        client.stackOfIntegers();
    }
}
