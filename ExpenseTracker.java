import java.util.ArrayList;
import java.util.Scanner;

class Expense {
    String title;
    double amount;

    Expense(String title, double amount) {
        this.title = title;
        this.amount = amount;
    }
}

public class ExpenseTracker {

    static ArrayList<Expense> expenses = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n===== Expense Tracker =====");
            System.out.println("1. Add Expense");
            System.out.println("2. View Expense");
            System.out.println("3. Total Expense");
            System.out.println("4. Delete Expense");
            System.out.println("5. Exit");
            System.out.print("Choose: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    addExpense();
                    break;
                case 2:
                    viewExpense();
                    break;
                case 3:
                    totalExpense();
                    break;
                case 4:
                    deleteExpense();
                    break;
                case 5:
                    System.out.println("Thank you!");
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }

    static void addExpense() {
        System.out.print("Enter expense title: ");
        String title = sc.nextLine();

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();
        sc.nextLine();

        expenses.add(new Expense(title, amount));
        System.out.println("Expense added successfully");
    }

    static void viewExpense() {
        if (expenses.isEmpty()) {
            System.out.println("No expense found");
            return;
        }

        System.out.println("\n----- Expenses -----");
        for (int i = 0; i < expenses.size(); i++) {
            Expense e = expenses.get(i);
            System.out.println((i + 1) + ". " + e.title + " - $" + e.amount);
        }
    }

    static void totalExpense() {
        double total = 0;
        for (Expense e : expenses) {
            total += e.amount;
        }
        System.out.println("Total Expense = $" + total);
    }

    static void deleteExpense() {
        if (expenses.isEmpty()) {
            System.out.println("No expenses found");
            return;
        }

        viewExpense();

        System.out.print("Enter expense number to delete: ");
        int index = sc.nextInt();
        sc.nextLine();

        if (index >= 1 && index <= expenses.size()) {
            expenses.remove(index - 1);
            System.out.println("Expense deleted successfully.");
        } else {
            System.out.println("Invalid expense number.");
        }
    }
}
