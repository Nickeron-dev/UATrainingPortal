package ua.kpi.tef.util;

import ua.kpi.tef.model.UserMeal;
import ua.kpi.tef.model.UserMealWithExceed;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Illia Koshkin
 *
 */
public class UserMealsUtil {
    public static void main(String[] args) {
        List<UserMeal> mealList = Arrays.asList(
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 30,10,0), "Завтрак", 500),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 30,13,0), "Обед", 1000),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 30,20,0), "Ужин", 500),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 31,10,0), "Завтрак", 1000),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 31,13,0), "Обед", 500),
                new UserMeal(LocalDateTime.of(2015, Month.MAY, 31,20,0), "Ужин", 510)
        );
        List<UserMealWithExceed> list = getFilteredWithExceeded(mealList, LocalTime.of(7, 0), LocalTime.of(12,0), 2000);
        list.forEach(System.out::println);
    }

    public static List<UserMealWithExceed>  getFilteredWithExceeded(List<UserMeal> mealList, LocalTime startTime, LocalTime endTime, int caloriesPerDay) {
        Map<LocalDate, Integer> days = mealList
                .stream()
                .map(element -> element.getDateTime().toLocalDate())
                .distinct()
                .collect(Collectors.toMap(key -> key, value -> 0));

        mealList.forEach(element -> days.put(element.getDateTime().toLocalDate(), days.get(element.getDateTime().toLocalDate()) + element.getCalories()));

        return mealList.stream()
                .filter((element) -> TimeUtil.isBetween(element.getDateTime().toLocalTime(), startTime, endTime))
                .map(element -> new UserMealWithExceed(element.getDateTime(), element.getDescription(), element.getCalories(), (days.get(element.getDateTime().toLocalDate())) > caloriesPerDay))
                .collect(Collectors.toList());
    }
}
