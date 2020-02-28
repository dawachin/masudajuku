package domain.model.users;

import domain.model.lending.貸出本;
import domain.model.lending.貸出本一覧;

public class 利用者情報 {

    年齢 会員年齢;

    貸出本一覧 a借りている本一覧;

    public 利用者情報(年齢 現在の年齢, 貸出本一覧 a借りている本一覧){
        this.会員年齢 = 現在の年齢;
        this.a借りている本一覧 = a借りている本一覧;
    }

    public 貸出本一覧 現在の借りている本一覧(){
        return this.a借りている本一覧;
    }

    public 利用者種別 利用者種別(){
        return 利用者種別.of(会員年齢);
    }

    public 利用者情報 貸付本追加(貸出本 a貸出本){
        貸出本一覧 新しい一覧 = a借りている本一覧.貸付本追加(a貸出本);
        利用者情報 更新された利用者 = new 利用者情報(this.会員年齢, 新しい一覧);
        return 更新された利用者;
    }
}
