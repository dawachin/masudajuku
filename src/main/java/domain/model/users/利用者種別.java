package domain.model.users;

import domain.model.users.type.Adult;
import domain.model.users.type.Children;
import domain.model.users.type.MemberTypeInterface;

import java.util.Arrays;

public enum 利用者種別 {
    大人(new Adult()),
    子ども(new Children());

    private MemberTypeInterface memberType;

    利用者種別(MemberTypeInterface memberType){
        this.memberType = memberType;
    }

    static 利用者種別 of(年齢 現在の年齢){
        return Arrays.stream(利用者種別.values())
                .filter(種別 -> 種別.memberType.判定(現在の年齢))
                .findFirst()
                .orElse(null);
    }
}
