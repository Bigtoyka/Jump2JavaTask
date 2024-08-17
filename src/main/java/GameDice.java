import java.util.Scanner;

public class GameDice {
    private static int count = 0;
    private static int myNumber = 0;
    public static void main(String[] args) {
        int dice = (int) (Math.random()*100 + 1);
        // System.out.println(dice); Раскомить, чтобы узнать загаданное число
        System.out.println("Введи число");
        Scanner scanner = new Scanner(System.in);
        while (true) {
                myNumber = scanner.nextInt();
            if (myNumber > dice) {
                count++;
                System.out.println("Не ожидал от тебя такого. Загаданное число меньше, брат");
            } else if (myNumber < dice) {
                count++;
                System.out.println("Я сам в шоке, но, загаданное число больше, брат");
            }else {
                count++;
                System.out.println("Загаданное число: " + dice);
                System.out.println("Количество попыток: " + count);
                return ;
            }
        }
    }
}
