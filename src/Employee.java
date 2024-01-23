public class Employee {
    public final void getSalaryMethod(Employee employee) {
         Employee[] array =new Employee[4];
         array[0]=new Director();
         array[1]=new Manager();
         array[2]=new Worker();
         array[3]=new Accountant();


        for (int i = 0; i < array.length; i++) {
            if (employee instanceof Director ){
                System.out.println("Director's salary~340_000-som");
                return;
            }if (employee instanceof Manager){
                System.out.println("Manager's salary~190_000$");
                return;
            }if (employee instanceof Worker){
                System.out.println("Employee's salary~150_000-rub");
                return;
            }if (employee instanceof Accountant){
                System.out.println("Accountant's salary~2000_000-sum");
                return;

            }
        }





        }


    }



