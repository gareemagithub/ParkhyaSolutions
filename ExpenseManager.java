package Projects.Expenses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

class Expense {
    private String date;
    private String item;
    private double cost;

    public Expense(String date, String item, double cost) {
        this.date = date;
        this.item = item;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Item: " + item + ", Cost: " + cost;
    }
}

public class ExpenseManager {
    private static Scanner scanner = new Scanner(System.in);
    private static String password = "admin";  // Default password
    private static double monthlyBudget = 0;
    private static double totalExpenses = 0;
    private static Map<String, List<Expense>> expenses = new HashMap<>();
    
    public static void main(String[] args) {
        while (true) {
            System.out.println("Welcome to the Monthly Expense Manager!");
            if (!authenticate()) {
                System.out.println("Incorrect password. Please try again.");
                continue;
            }
            menu();
        }
    }
    
    public static boolean authenticate() {
        System.out.print("Enter your password: ");
        String enteredPassword = scanner.nextLine();
        return enteredPassword.equals(password);
    }

    public static void menu() {
        System.out.println("\n1. Set Monthly Budget");
        System.out.println("2. Add Expense");
        System.out.println("3. View Expenses by Date");
        System.out.println("4. View Expenses by Month");
        System.out.println("5. Change Password");
        System.out.println("6. Delete Month's Report");
        System.out.println("7. Exit");
        System.out.print("Choose an option: ");
        
        int choice = scanner.nextInt();
        scanner.nextLine(); // Clear the buffer
        
        switch (choice) {
            case 1: setBudget(); break;
            case 2: addExpense(); break;
            case 3: viewExpensesByDate(); break;
            case 4: viewExpensesByMonth(); break;
            case 5: changePassword(); break;
            case 6: deleteMonthReport(); break;
            case 7: System.exit(0);
        }
    }

    // Set Monthly Budget
    public static void setBudget() {
        System.out.print("Enter monthly budget: ");
        monthlyBudget = scanner.nextDouble();
        scanner.nextLine(); // Clear buffer
        totalExpenses = 0;
        System.out.println("Monthly budget set to " + monthlyBudget);
    }

    // Add Expense
    public static void addExpense() {
        if (monthlyBudget <= 0) {
            System.out.println("Please set a budget first.");
            return;
        }

        System.out.print("Enter expense date (YYYY-MM-DD): ");
        String date = scanner.nextLine();

        System.out.print("Enter item name: ");
        String item = scanner.nextLine();

        System.out.print("Enter cost: ");
        double cost = scanner.nextDouble();
        scanner.nextLine(); // Clear buffer

        totalExpenses += cost;

        if (totalExpenses > monthlyBudget) {
            System.out.println("Warning! You have exceeded your budget!");
        }

        Expense expense = new Expense(date, item, cost);

        expenses.putIfAbsent(date, new ArrayList<>());
        expenses.get(date).add(expense);

        System.out.println("Expense added successfully.");
    }

    // View Expenses by Date
    public static void viewExpensesByDate() {
        System.out.print("Enter date (YYYY-MM-DD): ");
        String date = scanner.nextLine();

        if (!expenses.containsKey(date)) {
            System.out.println("No expenses found for this date.");
            return;
        }

        System.out.println("\nExpenses on " + date + ":");
        for (Expense expense : expenses.get(date)) {
            System.out.println(expense);
        }
    }

    // View Expenses by Month
    public static void viewExpensesByMonth() {
        System.out.print("Enter month (YYYY-MM): ");
        String month = scanner.nextLine();

        boolean found = false;

        for (String date : expenses.keySet()) {
            if (date.startsWith(month)) {
                found = true;
                System.out.println("\nExpenses on " + date + ":");
                for (Expense expense : expenses.get(date)) {
                    System.out.println(expense);
                }
            }
        }

        if (!found) {
            System.out.println("No expenses found for this month.");
        }
    }

    // Change Password
    public static void changePassword() {
        System.out.print("Enter old password: ");
        String oldPassword = scanner.nextLine();
        
        if (oldPassword.equals(password)) {
            System.out.print("Enter new password: ");
            password = scanner.nextLine();
            System.out.println("Password changed successfully.");
        } else {
            System.out.println("Incorrect old password.");
        }
    }

    // Delete Month's Report
    public static void deleteMonthReport() {
        System.out.print("Enter month (YYYY-MM) to delete: ");
        String month = scanner.nextLine();

        List<String> toDelete = new ArrayList<>();
        for (String date : expenses.keySet()) {
            if (date.startsWith(month)) {
                toDelete.add(date);
            }
        }

        if (toDelete.isEmpty()) {
            System.out.println("No records found for this month.");
        } else {
            for (String date : toDelete) {
                expenses.remove(date);
            }
            System.out.println("Expenses for " + month + " have been deleted.");
        }
    }
}
