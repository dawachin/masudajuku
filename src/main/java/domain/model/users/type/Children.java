package domain.model.users.type;

import domain.model.users.年齢;

public class Children implements MemberTypeInterface  {

    private final 年齢 THRESHOLD_LOWER = 年齢.minAge();
    private final 年齢 THRESHOLD_UPPER = new 年齢(15);

    public boolean 判定(年齢 年齢){
        return THRESHOLD_LOWER.isYoungerThan(年齢) && THRESHOLD_UPPER.isOlderThan(年齢);
    }
}
