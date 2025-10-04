// Find the employee with the maximum salary (using a simple Employee class with name and salary).
// Output: Employee{name="X", salary=...}

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Employee{
    String name;
    double salary;


    Employee(String name, double salary){
        this.salary = salary;
        this.name = name;
    }

    public String toString(){
        return name + "( " + salary + " )";
    }
    
}

public class Test19{
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
        new Employee("Alice", 50000),
        new Employee("Bob", 70000),
        new Employee("Charlie", 60000)
    );
    Employee maxSalary = employees.stream()
                                .max(Comparator.comparingDouble(e -> e.salary))
                                .get();
    System.out.println(maxSalary);
    }   
}