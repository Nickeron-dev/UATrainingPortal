public enum Month {

        JANUARY(1,31), FEBRUARY(2,28), MARCH(3,31),
        APRIL(4,30), MAY(5,31), JUNE(6,30), JULY(7,31),
        AUGUST(8,31), SEPTEMBER(9,30), OCTOBER(10,31),
        NOVEMBER(11,30), DECEMBER(12,31);

        // month index
        private int monthIndex;

        // days amount
        private int numberOfDaysInMonth;

        // Constructor
        Month(int monthIndex, int numberOfDaysInMonth){
                this.monthIndex = monthIndex;
                this.numberOfDaysInMonth = numberOfDaysInMonth;
        }

        // month index getter
        int getMonthIndex() {
                return monthIndex;
        }

        // Days number getter
        int getNumberOfDaysInMonth() {
                return numberOfDaysInMonth;
        }
}
