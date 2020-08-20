import java.math.BigDecimal;
import java.math.RoundingMode;

public class RentalOffice {
    static double rentalIncome = 0;

    void orderBike(Color color, int d, Frame frame, int a) {
        Bike bike = new Bike(color, d, frame);
        int c = 0;
        switch (color) {
            case RED:
                c = 500;
                break;
            case BLUE:
                c = 250;
                break;
            case GREEN:
                c = 100;
                break;
        }

        double result = a * ((frame.getValue() * (c + d / 3.0) / 20));
        rentalIncome += result;
        System.out.println("Ordered for " + a + " days: " + bike + " -> " + format(result));
    }

    void rentalIncome() {
        System.out.println("Rental income: " + format(rentalIncome));
    }


    String format(double d) {
        BigDecimal bigDecimal = new BigDecimal(d);
        return bigDecimal.setScale(2, RoundingMode.HALF_EVEN).toString();
    }

}
