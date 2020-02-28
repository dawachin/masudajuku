package domain.model.lending.利用制限;

/**
 * 遅延日数
 *
 */
public class 遅延日数 {

    private Long value;

    public 遅延日数(Long value) {
        this.value = value;
    }

    public int 比較(遅延日数 other) {
        if (this.value > other.value) return 1;
        if (this.value == other.value) return 0;
        if (this.value < other.value) return -1;
        return 0;
    }

    public boolean lessThanEq(遅延日数 other){
        return this.value <= other.value;
    }
    public boolean graterThanEq(遅延日数 other){
        return this.value >= other.value;
    }
}


