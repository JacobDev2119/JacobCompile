import java.util.*;

public class SimpleListManager {
    private static Scanner scanner = new Scanner(System.in);
    private static List<String> itemList = new ArrayList<>();

    public static void addItem() {
        System.out.println("\tADD\n");
        System.out.print("Enter item to add: ");
        String item = scanner.nextLine();

        if (!itemList.contains(item)) {
            itemList.add(item);
            System.out.println("Item added successfully.");
        } else {
            System.out.println("Item already exists.");
        }
    }

    public static void deleteItem() {
        if (!itemList.isEmpty()) {
            System.out.println("\tDELETE\n");

            displayItems();

            System.out.print("Enter item to delete: ");
            String item = scanner.nextLine();

            if (itemList.contains(item)) {
                itemList.remove(item);
                System.out.println("Item deleted successfully.");
            } else {
                System.out.println("Item not found.");
            }
        } else {
            System.out.println("No items in the list.");
        }
    }

    public static void updateItem() {
        if (!itemList.isEmpty()) {
            System.out.println("\tUPDATE\n");

            displayItems();

            System.out.print("Enter item to update: ");
            String oldItem = scanner.nextLine();
            System.out.print("Enter item to replace: ");
            String newItem = scanner.nextLine();

            if (itemList.contains(oldItem)) {
                int index = itemList.indexOf(oldItem);
                itemList.set(index, newItem);
                System.out.println("Item updated successfully.");
            } else {
                System.out.println("Item not found.");
            }
        } else {
            System.out.println("No items in the list.");
        }
    }

    public static void displayItems() {
        if (!itemList.isEmpty()) {
            System.out.println("\tDISPLAY\n");

            for (String item : itemList) {
                System.out.println(item);
            }
        } else {
            System.out.println("No items in the list.");
        }
    }

    public static void main(String[] args) {
        while (true) {
            System.out.println("[1] Add");
            System.out.println("[2] Delete");
            System.out.println("[3] Update");
            System.out.println("[4] Display");
            System.out.println("[5] Exit");
            System.out.print("Please enter your choice: ");
            String choice = scanner.nextLine();

            int option = validateInput(choice);

            switch (option) {
                case 1:
                    addItem();
                    break;
                case 2:
                    deleteItem();
                    break;
                case 3:
                    updateItem();
                    break;
                case 4:
                    displayItems();
                    break;
                case 5:
                    System.out.println("Program finished...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid input. Please enter a valid option.");
            }
        }
    }

    public static int validateInput(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid option.");
            return 0;
        }
    }
}
