package ru.voronezhtsev;

import java.util.Locale;

/**
 * Резервуар с жиджкостью
 *
 * @author Воронежцев Игорь 17.10.2018
 */
public class Tank {

    private static final String POUR_PRINT_TEXT = "Взяли [%d] л жидкости [%s]";
    private static final String OVERLOAD_TEXT = "Не возможно налить [%s] [%d] л в резервуар. Произойдет переполнение";

    private String mLiquid;
    private int mVolume;
    private int mCapacity;

    /**
     * Конструктор полного резервуара с жидкостью
     * @param liquid имя жижкости
     * @param capacity емкость резервуара, л
     */
    public Tank(String liquid, int capacity) {
        this(liquid, capacity, capacity);
    }

    public Tank(String liquid, int capacity, int volume) {
        mLiquid = liquid;
        mCapacity = capacity;
        mVolume = volume;
    }

    /**
     * Наполнить резервуар жидкостью
     * @param volume объем, л
     */
    public void fill(int volume) {
        if(mVolume + volume <= mCapacity) {
            mVolume += volume;

        } else {
            System.out.println(String.format(Locale.US, OVERLOAD_TEXT, mLiquid, volume));
        }
    }

    /**
     * Вылить заданный объем жидкости
     * @param volume объем жидкости в литрах
     */
    public void pour(int volume) {
        if(volume < mVolume) {
            mVolume -= volume;
            System.out.println(String.format(Locale.US, POUR_PRINT_TEXT, volume, mLiquid));
        }
    }

    /**
     * Вернуть объем жидкости оставшийся в резервуаре
     * @return объем жидкости оставшийся в резервуаре
     */
    public int getVolume() {
        return mVolume;
    }
}
