import devices.Car;

public class Main {
    public static void main(String[] args) {
        Car nissan = new Car("Juke", "Nissan", 2022, 60000.0);
        Car golf = new Car("golf", "Volkswagen", 2004, 25000.0);
        Car nissan2 = new Car("Juke", "Nissan", 2022, 60000.0);

        Human Damian = new Human();
        Damian.Name="Damian";
        Damian.Surname="Kowalski";
        Damian.setSalary(3500.0);
        Damian.getSalary();
        Damian.setCar(nissan);

        System.out.println(nissan==nissan2);
        System.out.println(nissan);
        System.out.println(nissan2);


        }
    }
