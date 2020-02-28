package domain.model.lending;

import domain.model.type.unit.日付;
import domain.model.lending.利用制限.遅延日数;

public class 返却予定日 {

    日付 value;

    private 返却予定日(日付 value){
        this.value = value;
    }

    static 返却予定日 from(貸出日 a貸出日){
        return new 返却予定日(a貸出日.value.plusDays(14));
    }

    遅延日数 遅延している日数(日付 起算日){
        return new 遅延日数(this.value.deltaDays(起算日));
    }




}
