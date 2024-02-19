public class Car {
    private final int MAX_SPEED = 120;
    private final int SPEED_STEP = 10;

    private String model;
    private String color;
    private int speed;
    private Boolean isStarted;

    public Car(String model, String color) {
        this.model = model;
        this.color = color;
        this.speed = 0;
    }

    public int getSpeed() {
        return this.speed;
    }

    public Boolean getIsStarted() {
        return this.isStarted;
    }

    public void speedUp() {
        if (maxSpeedReached()) {
            speed += SPEED_STEP;
            showDetails();
        } else {
            System.out.println("La vitesse maximale est atteinte.");
        }
    }

    public void slowDown() {
        if (isStopped()) {
            speed -= SPEED_STEP;
            showDetails();
        } else {
            System.out.println("La voiture est déjà à l'arrêt.");
        }
    }

    private boolean isStopped() {
        return 0 <= speed - SPEED_STEP;
    }

    private boolean maxSpeedReached() {
        return speed + SPEED_STEP <= MAX_SPEED;
    }

    public void startEngine() {
        isStarted = true;
    }

    public void stopEngine() {
        isStarted = false;
    }

    public void showDetails() {
        System.out.println("Modèle : " + model);
        System.out.println("Couleur : " + color);
        System.out.println("Vitesse actuelle : " + speed);
    }
}
