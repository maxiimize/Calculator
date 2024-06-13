import java.util.Scanner;

public class Main {
    public static int add(int a, int b) {
        return a + b;
    }

    public static int sub(int a, int b) {
        return a - b;
    }

    public static int multi(int a, int b) {
        return a * b;
    }

    public static int div(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        int choice = 0;
        while (!exit) {
            System.out.println("Vänligen välj ett alternativ:");
            System.out.println("1. Addera");
            System.out.println("2. Subtrahera");
            System.out.println("3. Dividera");
            System.out.println("4. Multiplicera");
            System.out.println("5. Avsluta");

            System.out.println("Ditt val: ");
            choice = scanner.nextInt();

            if (choice == 5) {
                {
                    exit = true;
                    continue;
                }
            }
            System.out.print("Ange första talet: ");
            int a = scanner.nextInt();
            System.out.print("Ange andra talet: ");
            int b = scanner.nextInt();

            switch (choice) {
                case 1:
                    int addera = add(a, b);
                    System.out.println("Resultatet är: " + addera);
                    break;
                case 2:
                    int subtrahera = sub(a, b);
                    System.out.println("Resultatet är: " + subtrahera);
                    break;
                case 3:
                    int dividera = div(a, b);
                    System.out.println("Resultatet är: " + dividera);
                    break;
                case 4:
                    int multiplicera = multi(a, b);
                    System.out.println("Resultatet är: " + multiplicera);
                    break;
                default:
                    System.out.println("Ogiltigt val. Försök igen.");
            }
            System.out.println("Vill du göra en ny beräkning? ja/nej: ");
            String response = scanner.next();
            if (response.equalsIgnoreCase("nej")) {
                exit = true;
            }
        }
        scanner.close();
        System.out.println("Kalkylatorn har avslutats.");
    }
}

