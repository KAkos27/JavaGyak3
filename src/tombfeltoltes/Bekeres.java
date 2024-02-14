package tombfeltoltes;

import java.util.Scanner;

public class Bekeres {

    static Scanner sc = new Scanner(System.in, "windows-1250");

    public static void main(String[] args) {
        System.out.print("db: ");
        final int DB = sc.nextInt();
        sc.nextLine();

        String[] nevek = new String[DB];

        for (int i = 0; i < DB; i++) {
            System.out.printf("%d/%d név: ", DB, i + 1);
            String nev = sc.nextLine();
            nevek[i] = nev;
        }

        for (int i = 0; i < DB; i++) {
            System.out.println(nevek[i]);
        }
    }
}
