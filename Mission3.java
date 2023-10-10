import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Mission3 {
    static int num;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        num = sc.nextInt();

        getClap();
    }

    public static void getClap() {
        int cnt = 0;
        for (int i = 1; i <= num; i++) {
            String str = Integer.toString(i);
            for (int j = 0; j < str.length(); j++) {
                int tmp = Integer.parseInt(str.substring(j, j + 1));
                if (tmp == 3 || tmp == 6 || tmp == 9)
                    cnt++;
            }
        }

        System.out.println(cnt);
    }
}
