package ru.voronezhtsev;

import ru.voronezhtsev.cars.Car;
import ru.voronezhtsev.cars.Minivan;

import java.util.Locale;

/**
 * Автоматическая станция мойки автомобилей
 */
public class CarwashStation {

    private static final String CLOSED_MMESSAGE = "Извините мойка закрыта";
    private static final String WASH_MESSAGE = "Автомобиль модель [%s] помыт";
    private static final String NO_ENAUGH_CARWASH_LIQUID = "Извините, недостаточно моющего средства на станции";
    private static final String WATER = "Вода";
    private static final int WATER_TANK_CAPACITY = 1000;
    private static final String SOUP = "Автошампунь Sonax";
    private static final int SOUP_TANK_CAPACITY = 600;

    private static final int CAR_WATER_VOLUME = 80;
    private static final int CAR_SOUP_VOLUME = 20;
    private static final int MINIVAN_WATER_VOLUME = 160;
    private static final int MINIVAN_SOUP_VOLUME = 40;
    private static final int JEEP_WATER_VOLUME = 200;
    private static final int JEEP_SOUP_VOLUME = 60;

    private Tank mWaterTank = new Tank(WATER, WATER_TANK_CAPACITY);
    private Tank mSoupTank = new Tank(SOUP, SOUP_TANK_CAPACITY);

    public void wash(Car car) {
        if(checkEnoughLiquid(car)) {
            System.out.println(String.format(Locale.US, WASH_MESSAGE, car.getName()));
        } else {
            System.out.println(NO_ENAUGH_CARWASH_LIQUID);
        }
    }

    public void closeForRefillTanks() {
        mSoupTank.fill();
        mWaterTank.fill();
    }

    private boolean checkEnoughLiquid(Car car) {
        switch (car.getType()) {
            case Car.PASSENGER_CAR: {
                if (mWaterTank.getVolume() >= CAR_WATER_VOLUME && mSoupTank.getVolume() >= CAR_SOUP_VOLUME) {
                    return true;
                }
            }
            case Car.MINIVAN: {
                if (mWaterTank.getVolume() >= MINIVAN_WATER_VOLUME && mSoupTank.getVolume() >= MINIVAN_SOUP_VOLUME) {
                    return true;
                }
            }
            case Car.JEEP: {
                if (mWaterTank.getVolume() >= JEEP_WATER_VOLUME && mSoupTank.getVolume() >= JEEP_SOUP_VOLUME) {
                    return true;
                }
            }
            default:
                return false;
        }
    }
}
