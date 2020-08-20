public class Main {

    public static void main(String[] args) {

        RentalOffice rentalOffice = new RentalOffice();

        rentalOffice.orderBike(Color.RED, 25, Frame.ALUMINUM, 25);
        rentalOffice.orderBike(Color.GREEN, 85, Frame.STEEL, 40);
        rentalOffice.orderBike(Color.BLUE, 43, Frame.ALUMINUM, 20);

        rentalOffice.rentalIncome();
    }


}
