


package arraysdemo;

public class InsertionSortDemo2 {

    // Insertion sort algorithm to sort employees by salaries in descending order
    public static void insertionSortBySalariesDescending(String[] names, double[] salaries) {
        int n = salaries.length;
        for (int i = 1; i < n; i++) {
            double keySalary = salaries[i];
            String keyName = names[i];
            int j = i - 1;

            // Move elements of salaries[0..i-1], that are less than keySalary,
            // to one position ahead of their current position
            while (j >= 0 && salaries[j] < keySalary) {
                salaries[j + 1] = salaries[j];
                names[j + 1] = names[j];
                j = j - 1;
            }
            salaries[j + 1] = keySalary;
            names[j + 1] = keyName;
        }
    }

    // Utility method to print employees and their salaries
    public static void printEmployeesAndSalaries(String[] names, double[] salaries) {
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + ": $" + salaries[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Array of employee names
        String[] employees = {"Alice", "Bob", "Charlie", "Diana", "Eve"};
        // Corresponding array of employee salaries
        double[] salaries = {55000, 70000, 45000, 60000, 80000};

        System.out.println("Unsorted employees and salaries:");
        printEmployeesAndSalaries(employees, salaries);

        insertionSortBySalariesDescending(employees, salaries);

        System.out.println("Sorted employees and salaries by salaries (descending):");
        printEmployeesAndSalaries(employees, salaries);
    }
}
