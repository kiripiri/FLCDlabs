import java.util.Scanner;

public class RunFA {
    public static void main(String[] argv) {
        boolean go = true;
        int choice;
        FiniteAutomata fa = new FiniteAutomata();
        System.out.println("0. exit");
        System.out.println("1. see non-terminals");
        System.out.println("2. see terminals");
        System.out.println("3. see initial state");
        System.out.println("4. see final state");
        System.out.println("5. see rules");
        System.out.println("Your choice: ");
        while (go) {
            System.out.print(" ");
            Scanner console = new Scanner(System.in);
            choice = console.nextInt();

            // System.out.println(choice);

            if (choice == 1) {
                System.out.println("Q - " + fa.getNonTerminals());
            }
            if (choice == 2) {
                System.out.println("Σ - " + fa.getTerminals());
            }
            if (choice == 3) {
                System.out.println(fa.getStartingSymbol());
            }
            if (choice == 4) {
                System.out.println("F - " + fa.getFinalState());
            }
            if (choice == 5) {
                System.out.println("Rules - " + fa.getRules());
            }
            if (choice == 0) {
                go = false;
            }
        }
    }
}
