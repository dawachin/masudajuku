package domain.model.users;

public class 年齢 {

    private static final Integer MIN_AGE = 0;
    private static final Integer MAX_AGE = 200;

    private Integer value;

    public 年齢(Integer age){
        this.value = age;
    }

    public static 年齢 maxAge(){
        return new 年齢(MAX_AGE);
    }
    public static 年齢 minAge() {
        return new 年齢(MIN_AGE);
    }

    public boolean isYoungerThan(年齢 other){
        return this.value <= other.value;
    }
    public boolean isOlderThan(年齢 other){
        return this.value >= other.value;
    }
    public boolean isSame(年齢 other){
        return this.value == other.value;
    }

}
