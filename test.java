import java.util.Scanner;

public class Rot13 {
    public static String encode(String text) {
        StringBuilder result = new StringBuilder();

        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                c = (char) ((c - base + 13) % 26 + base);
            }
            result.append(c);
        }

        return result.toString();
    }

    public static String decode(String text) {
        return encode(text);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Encode");
            System.out.println("2. Decode");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            if (choice == 1) {
                System.out.print("Enter text to encode: ");
                String text = scanner.nextLine();
                String encoded = encode(text);
                System.out.println("Encoded: " + encoded);
            } else if (choice == 2) {
                System.out.print("Enter text to decode: ");
                String text = scanner.nextLine();
                String decoded = decode(text);
                System.out.println("Decoded: " + decoded);
            } else if (choice == 3) {
                break;
            } else {
                System.out.println("Invalid choice");
            }
        }

        scanner.close();
    }
}
