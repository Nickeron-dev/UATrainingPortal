package ua.kpi.tef.util;

import java.time.LocalTime;

/**
 * @author Illia Koshkin
 *
 */
public class TimeUtil {
    public static boolean isBetween(LocalTime lt, LocalTime startTime, LocalTime endTime) {
        return lt.compareTo(startTime) >= 0 && lt.compareTo(endTime) <= 0;
    }
}