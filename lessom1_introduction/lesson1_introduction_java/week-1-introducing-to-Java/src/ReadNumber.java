

import java.util.Scanner;

public class ReadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số: ");
        int num = sc.nextInt();
        String result = "";
        if (num < 0 || num > 999) {
            System.out.println("Chỉ đọc trong phạm vi 0-999");
            return;
        }

        if (num < 10) {
            result = getHangDonVi(num);
        } else if (num > 10 && num < 20) {
            result = getTu11Den19(num);
        } else if (num % 100 == 0) {
            result = getSoTronTram(num);
        } else if (num % 10 == 0) {
            result = getHangChuc(num);
        } else if (num > 19 && num % 10 != 0 && num < 100) {
            int chuc = num / 10 * 10;
            int donVi = num % 10;
            result = getHangChuc(chuc) + " " + getHangDonVi(donVi);
        } else {
            int tram = num / 100 * 100;
            int chucDonVi = num % 100;
            result = getSoTronTram(tram);
            if (chucDonVi == 0) {

            } else if (chucDonVi < 10) {
                result += " " + getHangDonVi(chucDonVi);
            } else if (chucDonVi < 20) {
                result += " " + getTu11Den19(chucDonVi);
            } else {
                int chuc = chucDonVi / 10 * 10;
                int donVi = chucDonVi % 10;
                result += " " + getHangChuc(chuc);
                if (donVi != 0) {
                    result += " " + getHangDonVi(donVi);
                }

            }
        }
        System.out.println(num + ": " + result);
    }





    private static String getSoTronTram(int num) {
        return switch (num) {
          case 100 -> "One hundred";
          case 200 -> "Two hundred";
          case 300 -> "Three hundred";
          case 400 -> "Four hundred";
          case 500 -> "Five hundred";
          case 600 -> "Six hundred";
          case 700 -> "Seven hundred";
          case 800 -> "Eight hundred";
          case 900 -> "Nine hundred";
          default -> "";
        };
    }


    private static String getHangChuc(int num) {
        return switch (num) {
            case 10 -> "Ten";
            case 20 -> "Twenty";
            case 30 -> "Thirty";
            case 40 -> "Forty";
            case 50 -> "Fifty";
            case 60 -> "Sixty";
            case 70 -> "Seventy";
            case 80 -> "Eighty";
            case 90 -> "Ninety";
            default -> "";
        };
    }


    private static String getTu11Den19(int num) {
        return switch (num) {
            case 10 -> "Ten";
            case 11 -> "Eleven";
            case 12 -> "Twelve";
            case 13 -> "Thirteen";
            case 14 -> "Fourteen";
            case 15 -> "Fifteen";
            case 16 -> "Sixteen";
            case 17 -> "Seventeen";
            case 18 -> "Eighteen";
            case 19 -> "Nineteen";
            default -> "";
        };
    }



    private static String getHangDonVi(int num) {
        return switch (num) {
            case 0 -> "Zero";
            case 1 -> "One";
            case 2 -> "Two";
            case 3 -> "Three";
            case 4 -> "Four";
            case 5 -> "Five";
            case 6 -> "Six";
            case 7 -> "Seven";
            case 8 -> "Eight";
            case 9 -> "Nine";
            default -> " ";
        };
    }
}