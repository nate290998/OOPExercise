package example_13.ui;

import java.util.Scanner;

public class ScannerFactory {
    private static Scanner SCANNER;
    // public static Object scanner;

    public static Scanner getScanner() {
        if (SCANNER == null) {
            SCANNER = new Scanner(System.in);
        }
        return SCANNER;
    }
}
