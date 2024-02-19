import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class DriverTest {

    private Driver driver;

    @BeforeEach
    public void setUp() {
        driver = new Driver("John", 20);
    }

    @Test
    public void testIsAdult() {
        assertThat(driver.isAdult()).isTrue();
    }

    @Test
    public void testStartEngine() {
        // GIVEN
        Car voiture = new Car("Sedan", "Bleu");

        // WHEN
        driver.startCar(voiture);

        // THEN
        assertThat(voiture.getIsStarted()).isEqualTo(true);
    }

    @Test
    public void testStopEngine() {
        // GIVEN
        Car voiture = new Car("Sedan", "Bleu");

        // WHEN
        driver.stopCar(voiture);

        // THEN
        assertThat(voiture.getSpeed()).isEqualTo(0);
    }

    @Test
    public void testChangeSpeed() {
        // GIVEN
        Car voiture = new Car("Sedan", "Bleu");

        // WHEN
        driver.changeSpeed(voiture, 80);

        // THEN
        assertThat(voiture.getSpeed()).isEqualTo(10);
    }
}
