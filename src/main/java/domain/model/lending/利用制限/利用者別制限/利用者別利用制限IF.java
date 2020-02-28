package domain.model.lending.利用制限.利用者別制限;

import domain.model.type.unit.日付;
import domain.model.lending.貸出本一覧;
import domain.model.type.unit.冊;

public interface 利用者別利用制限IF {

    冊 現在借りられる冊数(貸出本一覧 現在借りている本一覧, 日付 起算日);
}
