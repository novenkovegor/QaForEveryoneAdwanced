package homework.hw7;

public class EmployeeUtils {

    public static Worker findWorkeByNamer(Worker[] workers, String name) {
        for (int i = 0; i < workers.length; i++) {
            if (name.equals(workers[i].getName())) {
                return workers[i];
            }

        }

        return null;
    }

    public static Worker findWorkeBySubNamer(Worker[] workers, String subName) {
        for (int i = 0; i < workers.length; i++) {
            if (workers[i].getName().contains(subName)) {
                return workers[i];
            }

        }

        return null;
    }

    public static double  salaryName(Worker[] workers) {
        double sum = 0;
        for (int i = 0; i < workers.length; i++) {
                sum += workers[i].getSalary();
            }

            return sum;
        }


    }






}

