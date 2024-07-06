import java.util.Scanner;

public class ExamProgram {
    
    public static void viewCourseworkResults() {
        System.out.println("Displaying coursework results...");
    }
    
    public static void viewExamResults() {
        System.out.println("Displaying exam results...");
    }
    
    public static void displayMenu() {
        System.out.println("\nMenu:");
        System.out.println("1. View coursework results");
        System.out.println("2. View exam results");
        System.out.println("3. Exit the program");
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            displayMenu();
            System.out.print("Enter your choice: ");
            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Please enter a number: ");
                scanner.next(); 
            }
            choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    viewCourseworkResults();
                    break;
                case 2:
                    viewExamResults();
                    break;
                case 3:
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
                    break;
            }
        } while (choice != 3);
        
        scanner.close();
    }
}