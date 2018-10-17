package ru.voronezhtsev.cars;

/**
 * Базовый класс автомобиля, легковой класс
 */
public abstract class Car {
    public static final int PASSENGER_CAR = 1;
    public static final int MINIVAN = 2;
    public static final int JEEP = 3;

    private String mName;
    public Car(String name) {
        mName = name;
    }

    /**
     * Имя( марка + модель или любое друго обозначение автомобиля)
     * @return марка + модель или любое друго обозначение автомобиля, уникальное
     */
    public String getName() {
        return mName;
    }

    /**
     * Вернуть тип автомобиля (Легковой, минивэн, внедорожник)
     * @return тип автомобиля (Легковой, минивэн, внедорожник)
     */
    public abstract int getType();
}
