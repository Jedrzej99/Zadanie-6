package devices;

public class Car {
    final String model;
    final String producer;
    double year;
    public double value;


    public Car(String model, String producer, double year, double value) {
        this.model = model;
        this.producer = producer;
        this.year = year;
        this.value = value;

    }
    public String toString(){
        return model+" "+producer+" "+year+" "+value;
    }
}
