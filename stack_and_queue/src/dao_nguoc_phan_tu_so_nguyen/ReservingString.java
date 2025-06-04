package dao_nguoc_phan_tu_so_nguyen;

import java.util.Stack;

public class ReservingString {
    public static String reserveString(String input) {
        Stack<String> wStack = new Stack<>();

        String[] words = input.trim().split("\\s+");
        for (String word : words) {
            wStack.push(word);
        }

        StringBuilder outP = new StringBuilder();
        while (!wStack.isEmpty()) {
            String mWord = wStack.pop();
            outP.append(mWord).append(" ");
        }
        return outP.toString().trim();
    }

    public static void main(String[] args) {
        String input = "Hello Im Bot";
        String output = reserveString(input);
        System.out.println("Input: " + input);
        System.out.println("Output: " + output);
    }

}
