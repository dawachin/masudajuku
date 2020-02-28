package domain.service;

        import domain.model.type.unit.日付;
        import domain.model.users.利用者情報;
        import domain.model.lending.利用制限.貸出可能冊数;
        import domain.model.lending.貸出日;
        import domain.model.lending.貸出本;
        import domain.model.assets.本;

public class 貸出サービス {

    日付 運用日付;

    public 貸出サービス(日付 運用日付){
        this.運用日付 = 運用日付;
    }

    public void 通常貸出(利用者情報 来訪者, 本 貸出本){

        貸出可能冊数 現在貸し出せる冊数 = 貸出可能冊数.利用者種別と現在借りている本による制限(
                来訪者.利用者種別(),
                来訪者.現在の借りている本一覧(),
                運用日付
        );

        // TODO 貸出可能冊数が0の時エラー

        貸出本 a貸出本 = new 貸出本(貸出本, 貸出日.from(運用日付));

        来訪者.貸付本追加(a貸出本);
    }
}
