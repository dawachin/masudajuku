package domain.model.type.unit;

public class 冊 {
    private Integer value;

    public 冊(Integer value) {
        if (value < 0){
            this.value = 0;
            return;
        }
        this.value = value;
    }
    public boolean graterThanEq(冊 other){
        return this.value >= other.value;
    }

    public 冊 引く(冊 other){
        return new 冊(this.value - other.value);
    }

}
