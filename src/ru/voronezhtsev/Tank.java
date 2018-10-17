package ru.voronezhtsev;

import java.util.Locale;

/**
 * Резервуар с жиджкостью
 *
 * @author Воронежцев Игорь 17.10.2018
 */
public class Tank {

    private static final String FILL_PRINT_TEXT = "Емкость с [%s] наполнена полностью";
    private static final String POUR_PRINT_TEXT = "Взяли [%d] л жидкости [%s]";

    private String mLiquid;
    private int mVolume;
    private int mCapacity;

    /**
     * Конструктор полного резервуара с жидкостью
     * @param liquid имя жижкости
     * @param capacity емкость резервуара, л
     */
    public Tank(String liquid, int capacity) {
        mLiquid = liquid;
        mCapacity = capacity;
        mVolume = capacity;
    }

    /**
     * Наполнить резервуара жидкостью до полна
     */
    public void fill() {
        mVolume = mCapacity;
        System.out.println(String.format(Locale.US, FILL_PRINT_TEXT, mLiquid));
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

}
