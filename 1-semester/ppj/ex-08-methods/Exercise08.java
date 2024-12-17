import java.util.*;

public class Exercise08 {
    private static Random random = new Random();
    private static int rollCount = 0;
    private static int[][] results = new int[100][2];
    
    public static void show() {
        if (rollCount == 0) {
            System.out.println("Brak wyników do wyswietlenia.");
            return;
        }

        System.out.println("Wszystkie wyniki losowan:");
        
        for (int i = 0; i < rollCount; i++) {
            System.out.println("Rzut " + (i + 1) + ": " + results[i][0] + " i " + results[i][1]);
        }
    }

    public static void roll() {
        int[] diceRolls = new int[2];
        
        if (rollCount >= 100) {
            System.out.println("Osiągnieto maksymalna liczbę rzutow!");
            return;
        }

        diceRolls[0] = random.nextInt(6) + 1;
        diceRolls[1] = random.nextInt(6) + 1;

        results[rollCount][0] = diceRolls[0];
        results[rollCount][1] = diceRolls[1];
        
        rollCount++;
        
        System.out.println("Wynik rzutu: " + diceRolls[0] + " i " + diceRolls[1]);

    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;

        while (!quit) {
            String method = scanner.nextLine();
            
            switch (method) {
                case "r":
                    roll();
                    break;
                case "s":
                    show();
                    break;
                case "q":
                    quit = true;
                    break;
                default:
                    System.out.println("Niepoprawna metoda!");
            }
        }

        scanner.close();
    }
}
