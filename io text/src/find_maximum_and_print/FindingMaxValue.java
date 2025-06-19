package find_maximum_and_print;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FindingMaxValue {
    public static List<Integer> readFile(String filename) {
        List<Integer> numbers = new ArrayList<>();
        try {
            File file = new File(filename);
            if (!file.exists()) {
                throw new FileNotFoundException(filename + " not found");
            }
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null ) {
                numbers.add(Integer.parseInt(line));
            }
            br.close();

        } catch (Exception e) {
            System.err.println("File " + filename + " not found or content got error");
        }
        return numbers;
    }
    public static void writeFile(String fileName, int maxValue) {
        try {
            FileWriter writer = new FileWriter(fileName, true);
            BufferedWriter bw = new BufferedWriter(writer);
            bw.write("Max Value: " + maxValue);
            bw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 1; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        List<Integer> numbers = readFile("C:\\module2\\io text\\src\\find_maximum_and_print\\numbers.txt");
        int maxValue = findMax(numbers);
        writeFile("C:\\module2\\io text\\src\\find_maximum_and_print\\result.txt", maxValue);
    }
}
