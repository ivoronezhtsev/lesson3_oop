package ru.voronezhtsev.cars;

public class PassengerCar extends Car {
    public PassengerCar(String name) {
        super(name);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int getType() {
        return Car.PASSENGER_CAR;
    }
}
