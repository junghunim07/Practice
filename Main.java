import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static int[] pobi;
    static int[] crong;
    static int result;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pobiMax = 0;
        int crongMax = 0;

        pobi = new int[2];
        crong = new int[2];

        for (int i = 0; i < 2; i++) {
            pobi[i] = sc. nextInt();
        }

        for (int i = 0; i < 2; i++) {
            crong[i] = sc. nextInt();
        }

        pobiMax = Math.max(getSumMax(pobi[0], pobi[1]), getMulMax(pobi[0], pobi[1]));
        crongMax = Math.max(getSumMax(crong[0], crong[1]), getMulMax(crong[0], crong[1]));

        getWinner(pobiMax, crongMax);

        System.out.println(result);
    }

    static int getSumMax(int a, int b) {
        int[] sum = new int[2];

        String str1 = Integer.toString(a);
        String str2 = Integer.toString(b);

        for (int i = 0; i < str1.length(); i++) {
            sum[0] += Integer.parseInt(str1.substring(i, i + 1));
        }
        for (int i = 0; i < str2.length(); i++) {
            sum[1] += Integer.parseInt(str2.substring(i, i + 1));
        }

        return Math.max(sum[0], sum[1]);
    }

    static int getMulMax(int a, int b) {
        int[] mul = new int[2];

        String str1 = Integer.toString(a);
        String str2 = Integer.toString(b);

        for (int i = 0; i < str1.length(); i++) {
            if (i == 0)
                mul[0] += Integer.parseInt(str1.substring(i, i + 1));
            else
                mul[0] *= Integer.parseInt(str1.substring(i, i + 1));
        }
        for (int i = 0; i < str2.length(); i++) {
            if (i == 0)
                mul[1] += Integer.parseInt(str2.substring(i, i + 1));
            else
                mul[1] *= Integer.parseInt(str2.substring(i, i + 1));
        }

        return Math.max(mul[0], mul[1]);
    }

    static void getWinner(int a, int b) {
        if (pobi[1] - pobi[0] > 1 || crong[1] - crong[0] > 1)
            result = -1;
        else {
            if (a > b) {
                result = 1;
            } else if (a < b) {
                result = 2;
            } else {
                result = 0;
            }
        }

    }
}