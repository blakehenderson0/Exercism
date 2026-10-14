import javax.print.attribute.standard.PrinterMoreInfoManufacturer;

public class CarsAssemble {
    public double productionRatePerHour(int speed) {

        double carsPerHour = 221 * speed;

        if (speed <= 4) {
            return carsPerHour;
        } else if (speed <= 8) {
            return carsPerHour = (221 * speed) * 0.90;
        } else if (speed == 9) {
            return carsPerHour = (221 * speed) * 0.80;
        } else {
            return carsPerHour = (221 * speed) * 0.77;
        }
    }

    public int workingItemsPerMinute(int speed) {
        return (int) (productionRatePerHour(speed) / 60);
    }
}
