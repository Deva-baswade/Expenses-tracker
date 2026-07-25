import java.util.ArrayList;
import java.util.Scanner;

class Expense{
    String title;
    double amount;

    Expense(String title,double amount){
        this.title = title;
        this.amount = amount;
    }
}

public class ExpenseTracker{

    static ArrayList<Expense> expense = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args){
        while(true){
            System.out.println("\n===== Expense Tracker ====");
            System.out.println("1.Add Expense");
            System.out.println("2.View Expense");
            System.out.println("3.Total Expense");
            System.out.println("4.Delete Expense");
            System.out.println("5.Exist");
            System.out.print("Choose");

            int choice = sc.nextInt();
            sc.nextLine();

            switch(choice){
                case 1:
                    addExpense():
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
                case 5 :
                    System.out.println("thanku you!");
                    return;
                default:
                    System.out.println("invalid choice");
            }

        }
    }


}

