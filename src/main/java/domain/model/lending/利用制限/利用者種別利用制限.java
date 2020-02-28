package domain.model.lending.利用制限;

import domain.model.lending.利用制限.利用者別制限.利用者別利用制限IF;
import domain.model.lending.利用制限.利用者別制限.大人の場合;
import domain.model.lending.利用制限.利用者別制限.子どもの場合;
import domain.model.users.利用者種別;

import java.util.Arrays;

enum 利用者種別利用制限 {
    ADULT(利用者種別.大人, new 大人の場合()),
    CHILDREN(利用者種別.子ども, new 子どもの場合());

    private 利用者種別 a利用者種別;
    private 利用者別利用制限IF a利用者別利用制限IF;

    利用者種別利用制限(利用者種別 a利用者種別, 利用者別利用制限IF a利用者別利用制限IF){
        this.a利用者種別 = a利用者種別;
        this.a利用者別利用制限IF = a利用者別利用制限IF;
    }

    利用者種別 as利用者種別(){
        return this.a利用者種別;
    }

    利用者別利用制限IF as利用者別制限(){
        return this.a利用者別利用制限IF;
    }

    static 利用者別利用制限IF of(利用者種別 a利用者種別) {
        return Arrays.stream(利用者種別利用制限.values())
                .filter(data -> data.as利用者種別().equals(a利用者種別))
                .findFirst()
                .orElse(null).as利用者別制限();
    }
}
