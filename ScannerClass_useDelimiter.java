

import java.util.Scanner;

public class ScannerClass_useDelimiter {
    public static void main(String[] args) {
        Scanner sc = new Scanner("Tapas/Ranjan/Paridas");
        sc.useDelimiter("/");

        while (sc.hasNext()) {
            System.out.println(sc.next());
        }
        sc.close();
    }
}
