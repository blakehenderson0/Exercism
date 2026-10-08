import javax.print.attribute.standard.PrinterMoreInfoManufacturer;

public class CarsAssemble {
    int speed = 1;

    public double productionRatePerHour(int speed) {

        if (speed == 1) {
            speed = 221;
        } else if (speed == 2) {
            speed = 442;
        } else if (speed == 3) {
            speed = 663;
        } else if (speed == 4) {
            speed = 884;
        } else if (speed == 5) {
            speed = 1105;
        } else if (speed == 6) {
            speed = 1326;
        } else if (speed == 7) {
            speed = 1547;
        } else if (speed == 8) {
            speed = 1768;
        } else if (speed == 9) {
            speed = 1989;
        } else if (speed == 10) {
            speed = 2210;
        }

        System.out.println(speed);
        return speed;
    }

    public int workingItemsPerMinute(int speed) {

        speed = speed;


        if (speed <= 442) {
            float yield = speed * 1.0f;
            return speed = (int) yield;
        } else if (speed > 442 && speed <= 1768) {
            float yield = speed * 0.90f;
            return speed = (int) yield;
        } else if (speed == 1989) {
            float yield = speed * 0.80f;
            return speed = (int) yield;
        } else if (speed == 2210) {
            float yield = speed * 0.77f;
            return speed = (int) yield;
        }

        return speed;
    }
}
