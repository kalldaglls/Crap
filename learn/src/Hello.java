import java.util.Random;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] words = new String[]{"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        System.out.println(getRandomWord(words));
    }

    static String getRandomWord(String[] array) {
        Random random = new Random();
        int i = random.nextInt(array.length - 1);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            String b = scanner.nextLine();
            if (array[i] == b) System.out.println("Вы угадали!");
            else {
                for (int j = 0; j <= array[i].length() - 1; j++) {
                    if (array[i].charAt(i) == b.charAt(i)) {
                        System.out.println(i + " " + "символ верный!");
                        System.out.println();//Можно ли вывести сумму i и 1, а также текст?
                    } else System.out.println(i + " " + "символ ложный!");

                }
            }
        }
    }

    static void guessWord(String[] words) {
        System.out.println("Guess word: " + " ");


    }
}
