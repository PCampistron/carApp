public class Application {
    public static void main(String[] args) {
        Car myCar = new Car("Sedan", "Bleu");
        Driver me = new Driver("John", 20);

        me.startCar(myCar);
        myCar.speedUp();
        me.changeSpeed(myCar, 80);
        myCar.slowDown();
        me.stopCar(myCar);
        myCar.showDetails();
    }
}