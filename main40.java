import java.util.Scanner;

public class Main {
    public static void welcomeUser(String name, int age) {
        System.out.println("Hello, " + name + "!");

        if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are not an adult.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        welcomeUser(name, age);
        scanner.close();
    }
}
