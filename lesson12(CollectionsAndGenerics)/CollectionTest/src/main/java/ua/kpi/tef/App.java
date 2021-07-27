package ua.kpi.tef;

import ua.kpi.tef.model.UserMeal;
import ua.kpi.tef.model.UserMealWithExceed;
import ua.kpi.tef.util.UserMealsUtil;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

/**
 * @author Illia Koshkin
 *
 */
public class App {

    public static void main( String[] args ) {
        List<UserMeal> mealList = Arrays.asList(
                new UserMeal(LocalDateTime.of(2021, Month.JUNE, 12,9,0), "Breakfast", 500),
                new UserMeal(LocalDateTime.of(2021, Month.JUNE, 12,14,0), "Lunch", 1000),
                new UserMeal(LocalDateTime.of(2021, Month.JUNE, 12,21,0), "Dinner", 500),
                new UserMeal(LocalDateTime.of(2021, Month.JUNE, 13,9,0), "Breakfast", 1000),
                new UserMeal(LocalDateTime.of(2021, Month.JUNE, 13,14,0), "Lunch", 500),
                new UserMeal(LocalDateTime.of(2021, Month.JUNE, 13,21,0), "Dinner", 510)
        );
        List<UserMealWithExceed> list = UserMealsUtil.getFilteredWithExceeded(mealList, LocalTime.of(7, 0), LocalTime.of(12,0), 2000);
        list.forEach(System.out::println);
    }
}
