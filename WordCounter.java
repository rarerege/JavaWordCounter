import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text (type 'END' on a new line to finish):");
        StringBuilder text = new StringBuilder();
        String line;
        while (!(line = scanner.nextLine()).equals("END")) {
            text.append(line).append("\n");
        }
        scanner.close();

        String input = text.toString();
        int wordCount = input.trim().isEmpty() ? 0 : input.trim().split("\\s+").length;
        int charCount = input.replace("\n", "").length();
        int paraCount = input.split("\n\n+").length;

        System.out.println("Words: " + wordCount);
        System.out.println("Characters: " + charCount);
        System.out.println("Paragraphs: " + paraCount);
    }
}
