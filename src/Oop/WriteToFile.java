package Oop;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFile {

    private static final String FILE_PATH = "src/Oop/users.txt";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Select an option:");
            System.out.println("1. Add User");
            System.out.println("2. Print Users");
            System.out.println("3. Exit");

            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    addUser(scanner);
                    break;
                case "2":
                    printUsers();
                    break;
                case "3":
                    System.out.println("Exiting the program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addUser(Scanner scanner) {
        try {
            FileWriter writer = new FileWriter(FILE_PATH, true);
            System.out.println("Enter the User details:");

            System.out.print("First Name: ");
            String firstName = scanner.nextLine();

            System.out.print("Last Name: ");
            String lastName = scanner.nextLine();

            System.out.print("Email: ");
            String email = scanner.nextLine();

            System.out.print("Role: ");
            String role = scanner.nextLine();

            User user = new User(firstName, lastName, email, role);

            writer.append(user.toString() + "\n");
            System.out.println("User was successfully added!");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void printUsers() {

        try {
            FileReader reader = new FileReader(FILE_PATH);
            Scanner scanner = new Scanner(reader);

            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
