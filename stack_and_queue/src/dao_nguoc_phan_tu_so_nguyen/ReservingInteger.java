package dao_nguoc_phan_tu_so_nguyen;

import java.util.Stack;

public class ReservingInteger {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();

        int[] array = {1, 5, 7, 6, 7, 9, 11};

        for (int i = 0; i < array.length; i++){
            stack.push(array[i]);
        }
        System.out.println("Array before reserving: " + stack);

        for (int i = 0; i < array.length; i++){
            array[i] = stack.pop();
        }

        System.out.print("Array after reserving: ");
        for (int show : array) {
            System.out.print(show + " ");
        }
    }
}
