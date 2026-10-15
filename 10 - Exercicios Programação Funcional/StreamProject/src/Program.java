import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Program {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Enter the full file path: ");
        String path = sc.nextLine();
        // relative path: data/Employee.CSV

        ArrayList<Employee> employees = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                String[] employee = line.split(",");
                String name = employee[0];
                String email = employee[1];
                double salary = Double.parseDouble(employee[2]);
                employees.add(new Employee(name, email, salary));
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println("Erro de gravação: " + e.getMessage());
            System.exit(0);
        }

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        
        System.out.println("Email of people whose salary is more than " + salary);
        employees.stream()
                .filter(n -> n.getSalary() > salary)
                .forEach(n -> System.out.println(n.getEmail()));

        double sumSalaryM = 0.0;
        List<Employee> startsWithM = employees.stream()
                .filter(n -> n.getName().charAt(0) == 'M')
                .toList();

        for (Employee employee : startsWithM) {
            sumSalaryM += employee.getSalary();
        }
        System.out.printf("Sum of the salary of people whose name starts with 'M': %.2f\n", sumSalaryM);

        sc.close();
    }
}
