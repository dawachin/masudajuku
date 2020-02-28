package domain.model.lending.利用制限.利用者別制限;

import domain.model.type.unit.日付;
import domain.model.lending.貸出本一覧;
import domain.model.lending.利用制限.遅延日数;
import domain.model.type.unit.冊;

public class 大人の場合 implements 利用者別利用制限IF {

    final static 冊 最大貸出可能数 = new 冊(5);

    public 冊 現在借りられる冊数(貸出本一覧 現在借りている本一覧, 日付 起算日){

        冊 現在貸し出している本の数 = 現在借りている本一覧.現在貸し出している本の数();
        遅延日数 最大遅延日数 = 現在借りている本一覧.最大遅延日数(起算日);

        if (現在貸し出している本の数.graterThanEq(最大貸出可能数)) return new 冊(0);
        if (最大遅延日数.graterThanEq(new 遅延日数(3L))) return new 冊(0);
        return 最大貸出可能数.引く(現在貸し出している本の数);

    }
}
