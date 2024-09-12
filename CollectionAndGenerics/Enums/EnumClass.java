package CollectionAndGenerics.Enums;

public class EnumClass {
    enum Grade {
        A, B, C, D, E;

    }

    enum TraficLight {
        RED("Stop"), GREEN("Go"), YELLOW("Start");

        private final String action;

        TraficLight(String action) {
            this.action = action;
        }

    }

    enum WeekDay {
        MONDAY(true),
        TUESDAY(true),
        WEDNESDAY(true),
        THURSDAY(true),
        FRIDAY(true),
        SATURDAY(false),
        SUNDAY(false);

        private final boolean isWeekDay;

        WeekDay(boolean isWeekDay) {
            this.isWeekDay = isWeekDay;
        }

        public String getType() {
            return isWeekDay ? "Weekday" : "Weekend";
        }
    }
}
