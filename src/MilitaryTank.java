public class MilitaryTank implements IVehicle{
    int mileToGo = 2000;
    int minAge = 25;
    Driver driver;
    public MilitaryTank() {
        System.out.println("Tank created 2000 miles to go");
    }

    public void drive() {
        if(driver == null){
            System.out.println("Tank didn’t drive - there’s no driver!");
        }
        else{
            mileToGo -= 10;
            System.out.println("Tank drove 5 miles - "+mileToGo+" miles to go”");
        }
    }


    public void setDriver(Driver drover) {
        if(drover.age >= minAge){
            driver = drover;
        }
        else {
            System.out.println("Driver not changed! Niklas is 21, but must be 25 or older to drive tank");
        }
    }
}
