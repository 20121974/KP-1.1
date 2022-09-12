public class Main {
    public class Easy {
        private static Employee[] employees = new Employee[10];
    }

    public static void main(String[] args) {
        Employee fio1 = new Employee("Иван", "Иванов", "Иванович", 1, 50000);
        Employee fio2 = new Employee("Петр", "Петров", "Петрович", 1, 50000);
        Employee fio3 = new Employee("Сидор", "Сидоров", "Сидорович", 2, 55000);
        Employee fio4 = new Employee("Илья", "Наумов", "Ильич", 2, 55000);
        Employee fio5 = new Employee("Петр", "Боев", "Иванович", 3, 60000);
        Employee fio6 = new Employee("Игорь", "Мазилов", "Сергеевич", 3, 60000);
        Employee fio7 = new Employee("Антон", "Ветров", "Олегович", 4, 65000);
        Employee fio8 = new Employee("Олег", "Красулин", "Антонович", 4, 65000);
        Employee fio9 = new Employee("Роман", "Морозов", "Иванович", 5, 70000);
        Employee fio10 = new Employee("Денис", "Баев", "Иванович", 5, 70000);

        Easy.employees[0] = fio1;
        Easy.employees[1] = fio2;
        Easy.employees[2] = fio3;
        Easy.employees[3] = fio4;
        Easy.employees[4] = fio5;
        Easy.employees[5] = fio6;
        Easy.employees[6] = fio7;
        Easy.employees[7] = fio8;
        Easy.employees[8] = fio9;
        Easy.employees[9] = fio10;
    }

    public static void printEmployees() {
        for (Employee employee : Easy.employees) {
            System.out.println(employee);
        }
    }

    public static int calculateTotalSalary() {
        int sum = 0;
        for (Employee employee : Easy.employees) {
            sum = sum + employee.getSalary();
        }
        return sum;
    }

    public static Employee findEmployeeWithMinSalary() {
        Employee result = Easy.employees[0];
        int minSalary = Easy.employees[0].getSalary();
        for (Employee employee : Easy.employees) {
            if (Easy.employees[0].getSalary() < minSalary) {
                minSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static Employee findEmployeeWithMaxSalary() {
        Employee result = Easy.employees[0];
        int maxSalary = Easy.employees[0].getSalary();
        for (Employee employee : Easy.employees) {
            if (Easy.employees[0].getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                result = employee;
            }
        }
        return result;
    }

    public static float calculateAverageSalary() {
        float averageSalary = calculateTotalSalary() / (float) Easy.employees.length;
        return averageSalary;
    }

    public static void printFullNames() {
        for (Employee employee : Easy.employees) {
            System.out.println(employee.getLastName());
        }
    }
}