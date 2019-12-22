
public class Smileys {

    public static void main(String[] args) {
        // Test your method at least with the following
        // printWithSmileys("Method");
        // printWithSmileys("Beerbottle");
        // printWithSmileys("Interface");
        String testString = "Cannabis";
        printWithSmileys(testString);

    }

    private static void printWithSmileys(String characterString) {
        String copyOfToPrint;
        if (characterString.length() % 2 != 0) {
            copyOfToPrint = ":) " + characterString + "  :)";
        } else {
            copyOfToPrint = ":) " + characterString + " :)";
        }

        int counter = 0;
        for (int i = 0; i < copyOfToPrint.length() / 2 + 1; i++) {
            System.out.print(":)");
            if (i == copyOfToPrint.length() / 2 - 1 && counter == 0) {
                System.out.println();
                System.out.println(copyOfToPrint);
                counter++;
                i = 0;
            }
        }
        System.out.println();
    }
}
