package ru.voronezhtsev;

import ru.voronezhtsev.cars.Car;

/**
 * Автоматическая станция мойки автомобилей
 */
public class CarwashStation {

    private static final String WATER = "Вода";
    private static final int WATER_TANK_CAPACITY = 1000;

    private static final String SOUP = "Автошампунь Sonax";
    private static final int SOUP_TANK_CAPACITY = 1000;
    private Tank mWaterTank = new Tank(WATER, WATER_TANK_CAPACITY);
    private Tank mSoupTank = new Tank(SOUP, SOUP_TANK_CAPACITY);

    public void wash(Car car) {

    }

    public void closeForRefillTanks() {

    }

    private void wash() {

    }
}
