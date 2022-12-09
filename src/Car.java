public class Car {
    private int id;
    private int carNumber;

    public Car(int id, int carNumber) {
        this.id = id;
        this.carNumber = carNumber;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", carNumber=" + carNumber +
                '}';
    }
}
