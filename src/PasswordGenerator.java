import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Character> letters = new ArrayList<>();
        for (char c = 'a'; c <= 'z'; c++) {
            letters.add(c);
        }
        for (char c = 'A'; c <= 'Z'; c++) {
            letters.add(c);
        }

        String symbols = "!@#$%^&*()-_+=[]{|\\:;<>,./`~";

        List<Character> numbers = new ArrayList<>();
        for (char c = '0'; c <= '9'; c++) {
            numbers.add(c);
        }

        System.out.println("Welcome to the password generator script.\nGive us details about the password you want");

        System.out.print("How many letters? ");
        int inLetters = scanner.nextInt();

        System.out.print("How many symbols? ");
        int inSymbols = scanner.nextInt();

        System.out.print("How many numbers? ");
        int inNumbers = scanner.nextInt();

        List<Character> passwordChars = new ArrayList<>();

        Random random = new Random();

        // Generate random letters
        for (int i = 0; i < inLetters; i++) {
            passwordChars.add(letters.get(random.nextInt(letters.size())));
        }

        // Generate random symbols
        for (int i = 0; i < inSymbols; i++) {
            passwordChars.add(symbols.charAt(random.nextInt(symbols.length())));
        }

        // Generate random numbers
        for (int i = 0; i < inNumbers; i++) {
            passwordChars.add(numbers.get(random.nextInt(numbers.size())));
        }

        // Shuffle the password to randomize the order of characters
        Collections.shuffle(passwordChars);

        // Convert the password list to a string
        StringBuilder password = new StringBuilder();
        for (Character c : passwordChars) {
            password.append(c);
        }

        System.out.println("Generated password: " + password);
    }
}
