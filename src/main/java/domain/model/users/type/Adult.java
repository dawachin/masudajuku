package domain.model.users.type;

import domain.model.users.年齢;

public class Adult implements MemberTypeInterface {

    private final 年齢 THRESHOLD_LOWER = new 年齢(16);
    private final 年齢 THRESHOLD_UPPER = 年齢.maxAge();

    public boolean 判定(年齢 年齢){
        return THRESHOLD_LOWER.isYoungerThan(年齢) && THRESHOLD_UPPER.isOlderThan(年齢);
    }
}
