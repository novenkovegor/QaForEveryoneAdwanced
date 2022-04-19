package homework.hw7;

public class Main {

    public static void main(String[] args) {

        Worker worker = new Worker(1000, "Anna");
        Manager manager = new Manager(1000, "Sergey", 56);
        Manager director = new Director(1000, "Ivan", 20);

        System.out.println(director.getSalary());

    }



}
