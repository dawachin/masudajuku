package domain.model.lending;

import domain.model.type.unit.日付;

public class 貸出日 {

    日付 value;

    貸出日(日付 a日付){
        this.value = a日付;
    }

    public static 貸出日 from(日付 a日付){return new 貸出日(a日付);}



}
