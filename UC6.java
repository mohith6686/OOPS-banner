/**
 * OOPSBannerApp UC6 - Refactor Banner Logic into Static Functions
 *
 * This use case extends UC5 by creating helper methods
 * for each character pattern (O, P, S).
 *
 * @author Developer
 * @version 6.0
 */

public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] lines = new String[7];

        for (int i = 0; i < 7; i++) {
            lines[i] = String.join(" ",
                    buildO()[i],
                    buildO()[i],
                    buildP()[i],
                    buildS()[i]
            );
        }

        for (String line : lines) {
            System.out.println(line);
        }
    }

    // Helper method for O
    public static String[] buildO() {
        return new String[]{
                " ***  ",
                "*   * ",
                "*   * ",
                "*   * ",
                "*   * ",
                "*   * ",
                " ***  "
        };
    }

    // Helper method for P
    public static String[] buildP() {
        return new String[]{
                "***** ",
                "*   * ",
                "*   * ",
                "***** ",
                "*     ",
                "*     ",
                "*     "
        };
    }

    // Helper method for S
    public static String[] buildS() {
        return new String[]{
                " **** ",
                "*     ",
                "*     ",
                " ***  ",
                "     *",
                "     *",
                "****  "
        };
    }
}