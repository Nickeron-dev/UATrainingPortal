public class MonthMain {
        public static void main(String[] args) {
                Month currentMonth = Month.MARCH;
                int currentMonthIndex = currentMonth.getMonthIndex();
                int currentNumberOfDaysInMonth = currentMonth.getNumberOfDaysInMonth();
                System.out.println(currentMonthIndex + " " + currentNumberOfDaysInMonth);
        }
}
