package domain.model.lending;

import domain.model.type.unit.冊;
import domain.model.type.unit.日付;
import domain.model.lending.利用制限.遅延日数;

import java.util.List;
import java.util.Optional;

public class 貸出本一覧 {

    List<貸出本> values;

    public 貸出本一覧(List<貸出本> values){
        this.values = values;
    }

    public 貸出本一覧 貸付本追加(貸出本 a貸出本){
        List<貸出本> updated = this.values;
        updated.add(a貸出本);
        return new 貸出本一覧(updated);
    }

    public 遅延日数 最大遅延日数(日付 起算日){
        Optional<貸出本> 一番遅延している貸出本
                = this.values
                .stream()
                .max((prev, next) -> prev.遅延している日数(起算日).比較(next.遅延している日数(起算日)));
        if (!一番遅延している貸出本.isPresent()) return new 遅延日数(0L);
        return 一番遅延している貸出本.get().遅延している日数(起算日);
    }

    public 冊 現在貸し出している本の数(){
        return new 冊(this.values.size());
    }
}
