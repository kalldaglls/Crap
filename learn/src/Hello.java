import java.util.Random;
import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        String[] words = new String[]{"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        System.out.println(getRandomWord(words));
    }

    static String getRandomWord(String[] array) {
        Random random = new Random();
        int i = random.nextInt(array.length - 1);
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("===========================");
            System.out.println("Угадайте слово!");
            String b = scanner.nextLine();
            if (array[i].equals(b)) {//- с == не работала! - здесь через || нужно прописать условие: если введенное слово не эквивалентно загаданному, но полностью его содержит, то оно считается угаданным!
                System.out.println("Вы угадали!");
                return array[i];
            } else {
                //for (int j = 0; j <= array[i].length() - 1; j++) {
                int j = 0;
                while ((j <= array[i].length() - 1) && (b.length() - 1 >= j)) {
                    if (array[i].charAt(j) == b.charAt(j)) {//что делать, если загаданное число больще, чем введенное(дает ошибку out of range), а мы хотим дальше писать ##? Решено!
                        System.out.print(array[i].charAt(j));
                    } else {
                        if (j < array[i].length() - 1) System.out.print("###");
                        else System.out.println("###");
                    }
                    j++;
                }
            }
        }
    }
}