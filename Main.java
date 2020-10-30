import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        do {
            int counter = 0;
            int guess = -1;
            int number = random.nextInt(10);
            while (counter < 3 && guess != number) {
                System.out.println("Угадайте число от 0 до 9 :");
                guess = scanner.nextInt();
                if (number != guess) {
                    System.out.println("Твоё число " + ((guess > number) ? " больше " : " меньше"));
                    counter++;
                }
            }
            System.out.println("Ты " + ((guess == number) ? " выиграл" : " проиграл"));
            System.out.println("Повторить игру? 1 - да, 0 - нет");
        } while (scanner.nextInt() == 1);
    }
}
