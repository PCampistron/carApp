public class Driver {
    private final int ADULT_AGE = 18;
    private String name;
    private int age;

    public Driver(String name, int years) {
        this.name = name;
        this.age = years;
    }

    public boolean isAdult() {
        return age >= ADULT_AGE;
    }

    public void startCar(Car car) {
        if (isAdult()) {
            System.out.println(name + " démarre la voiture.");
            car.startEngine();
        } else {
            System.out.println("Le conducteur n'est pas assez âgé pour conduire.");
        }
    }

    public void stopCar(Car car) {
        System.out.println(name + " arrête la voiture.");
        car.stopEngine();
    }

    public void changeSpeed(Car car, int newSpeed) {
        System.out.println(name + " change la vitesse de la voiture à " + newSpeed);
        car.speedUp();
    }
}