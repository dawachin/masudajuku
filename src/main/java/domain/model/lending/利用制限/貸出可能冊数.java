package domain.model.lending.利用制限;

import domain.model.type.unit.日付;
import domain.model.lending.貸出本一覧;
import domain.model.lending.利用制限.利用者別制限.利用者別利用制限IF;
import domain.model.users.利用者種別;
import domain.model.type.unit.冊;

public class 貸出可能冊数 {

    冊 最大貸出可能冊数;

    private 貸出可能冊数(冊 利用可能冊数){
        this.最大貸出可能冊数 = 利用可能冊数;
    }

    public static 貸出可能冊数 利用者種別と現在借りている本による制限(
            利用者種別 a利用者種別,
            貸出本一覧 現在の借りている本一覧,
            日付 起算日
    ){
        利用者別利用制限IF 利用者別制限規則 = 利用者種別利用制限.of(a利用者種別);
        return new 貸出可能冊数(利用者別制限規則.現在借りられる冊数(現在の借りている本一覧, 起算日));
    }
}
