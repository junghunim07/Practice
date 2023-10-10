import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Mission2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1;

        str1 = sc.nextLine();

        getDecode(str1);
    }

    public static void getDecode(String a) {
        int cnt = 0;

        for (int i = 0; i < a.length() - 1; i++) {
            if (a.charAt(i) == a.charAt(i + 1)) {
                String a1 = a.substring(0, i);
                String a2 = a.substring(i + 2, a.length());

                a = a1 + a2;
                i--;
                cnt++;
            }
        }

        if (cnt != 0) {
            getDecode(a);
        } else {
            System.out.println(a);
            return;
        }
    }
}