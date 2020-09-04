public class FlyingCar extends Vehicle {

    private String drive;
    private int range;



    public FlyingCar() {

    }

    @Override
    public void turnOn() {
        System.out.println("Powering Ion thrusters...");
    }

    public FlyingCar(boolean isOperable, int passengerCapacity, String powerSource, int range) {
        super(isOperable, passengerCapacity, powerSource);
        this.range = range;
    }



}
