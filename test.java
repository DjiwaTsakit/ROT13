import java.util.Scanner;

public class Rot13 {
    public static String encode(String text) {
        StringBuilder result = new StringBuilder();

        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                char base = Character.isUpperCase(c) ? 'A' : 'a';
                c = (char) (c - base + (c - base + 13) % 26);
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
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            if (choice == 1) {
                System.out.print("Enter text to encode: ");
                String text = scanner.next();
                String encoded = encode(text);
                System.out.println("Encoded: " + encoded);
            } else if (choice == 2) {
                System.out.print("Enter text to decode: ");
                String text = scanner.next();
                String decoded = decode(text);
                System.out.println("Decoded: " + decoded);
            } else {
                System.out.println("Invalid choice");
            }
        }
    }
}
