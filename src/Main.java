public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        Manager manager = new Manager();
        Worker worker = new Worker();
        Accountant accountant = new Accountant();
        Employee employee = new Employee();

        employee.getSalaryMethod(accountant);
        employee.getSalaryMethod(director);
        employee.getSalaryMethod(manager);
        employee.getSalaryMethod(worker);



    }
}