package domain.model.type.unit;

/**
 * 曜日
 */
public enum 曜日 {
    日(java.time.DayOfWeek.SUNDAY),
    月(java.time.DayOfWeek.MONDAY),
    火(java.time.DayOfWeek.TUESDAY),
    水(java.time.DayOfWeek.WEDNESDAY),
    木(java.time.DayOfWeek.THURSDAY),
    金(java.time.DayOfWeek.FRIDAY),
    土(java.time.DayOfWeek.SATURDAY);

    private final java.time.DayOfWeek dayOfWeek;

    曜日(java.time.DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public static 曜日 of(java.time.DayOfWeek dayOfWeek) {
        for (曜日 value : values()) {
            if (value.dayOfWeek == dayOfWeek) {
                return value;
            }
        }
        throw new IllegalArgumentException(dayOfWeek.toString());
    }
}
