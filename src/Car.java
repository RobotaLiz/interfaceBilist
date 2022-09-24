public class Car implements IVehicle {
    int minAge = 18;
    int mileToGo = 100;
    Driver driver;
    public Car() {
        System.out.println("Car created 100 miles to go");
    }

    public void drive() {
        if(driver == null){
            System.out.println("Car didn’t drive - there’s no driver!");
        }
        else{
            mileToGo -= 10;
            System.out.println("Car drove 10 miles - "+mileToGo+" miles to go”");
        }
    }


    public void setDriver(Driver drover) {
        if(drover.age >= minAge){
            driver = drover;
        }
        else {
            System.out.println("Driver not changed! Emil is 17, must be 18 or older to drive car");
        }
    }
}
