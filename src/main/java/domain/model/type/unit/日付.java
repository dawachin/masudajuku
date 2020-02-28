package domain.model.type.unit;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class 日付 {

//    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private LocalDate value;

    @Deprecated
    public 日付() {
    }

    public static 日付 from(String value) {
        return new 日付(LocalDate.parse(value, DateTimeFormatter.ISO_DATE));
    }

    public 日付(LocalDate value) {
        this.value = value;
    }

    public static 日付 distantPast() {
        return new 日付(LocalDate.of(1, 1, 1));
    }

    public static 日付 distantFuture() {
        return new 日付(LocalDate.of(9999, 12, 31));
    }

    public LocalDate value() {
        return value;
    }

    public Long deltaDays(日付 other){return ChronoUnit.DAYS.between(this.value, other.value);}

//    public Year year() {
//        return new Year(value.getYear());
//    }

    public Month month() {
        return Month.of(value.getMonth().getValue());
    }

    public int dayOfMonth() {
        return value.getDayOfMonth();
    }

    public 曜日 dayOfWeek() {
        return 曜日.of(value.getDayOfWeek());
    }

    public boolean hasSameValue(日付 other) {
        return value.equals(other.value);
    }

    public int compareTo(日付 other) {
        return value.compareTo(other.value);
    }

    @Override
    public String toString() {
        return value.format(DateTimeFormatter.ISO_DATE);
    }

    public 日付 plusDays(int days) {
        return new 日付(value.plusDays(days));
    }

    public 日付 previousDay() {
        return new 日付(value.minusDays(1));
    }

    public 日付 nextDay() {
        return new 日付(value.plusDays(1));
    }

    public boolean isAfter(日付 date) {
        return value.isAfter(date.value);
    }

    public String yyyyMMdd() {
        return value.format(DateTimeFormatter.ofPattern("uuuuMMdd"));
    }
}
