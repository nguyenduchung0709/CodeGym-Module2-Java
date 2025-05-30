public class FizzBuzz {
    public static String fizzBuzz(int number) {
        if (number <= 0) {
            throw new IllegalArgumentException("Number must be positive");
        }
        boolean isFizz = number % 3 == 0;
        boolean isBuzz = number % 5 == 0;
        if (isFizz && isBuzz) {
            return "FizzBuzz";
        } else if (isFizz) {
            return "Fizz";
        } else if (isBuzz) {
            return "Buzz";
        } else {
            return String.valueOf(number);
        }
    }

    public static String convert(int number) {
        if (number >= 100) {
            throw new IllegalArgumentException("Number must be less than 100");
        }
        boolean divisibleBy3 = number % 3 == 0;
        boolean divisibleBy5 = number % 5 == 0;
        boolean contains3 = String.valueOf(number).contains("3");
        boolean contains5 = String.valueOf(number).contains("5");

        boolean isFizz = divisibleBy3 || contains3;
        boolean isBuzz = divisibleBy5 || contains5;

        if (isFizz) {
            return "Fizz";
        } else if (isBuzz) {
            return "Buzz";
        } else {
            return translate(number);
        }
    }
    public static String translate(int number){
        boolean hangDonVi = number < 10;
        if (hangDonVi) {
            return toWords(number);
        } else  {
            int hangChuc = number / 10;
            int chuc = number % 10;
            return toWords(hangChuc) + " " + toWords(chuc);
        }
    }
    public static String toWords(int number){
        switch (number){
            case 0: return "không";
            case 1: return "một";
            case 2: return "hai";
            case 3: return "ba";
            case 4: return "bốn";
            case 5: return "năm";
            case 6: return "sáu";
            case 7: return "bảy";
            case 8: return "tám";
            case 9: return "chín";
            default: return "";
        }
    }
}
