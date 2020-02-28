package domain.model.lending;

import domain.model.type.unit.日付;
import domain.model.lending.利用制限.遅延日数;
import domain.model.assets.本;

public class 貸出本 {

    本 貸出本;

    貸出日 a貸出日;

    返却予定日 a返却予定日;

    public 貸出本(本 本情報, 貸出日 a貸出日){
        this.貸出本 = 本情報;
        this.a貸出日 = a貸出日;
        this.a返却予定日 = 返却予定日.from(a貸出日);
    }

    遅延日数 遅延している日数(日付 起算日){
        return this.a返却予定日.遅延している日数(起算日);
    }

}
