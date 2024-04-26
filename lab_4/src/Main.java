import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть текст:");
        String text = scanner.nextLine();

        System.out.println("Введіть короткий рядок:");
        String shortString = scanner.nextLine();

        System.out.println("Введіть ціле число k:");
        int k = scanner.nextInt();

        StringProcessor stringProcessor = new StringProcessor(text, shortString, k);
        stringProcessor.processText();
        System.out.println("Рядок після обробки: " + stringProcessor.getResultString());
        System.out.println("Кількість слів у рядку: " + stringProcessor.getWordCount());
    }
}
