package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomMoveStrategy implements MoveStrategy {

    private static final int MIN = 0;
    private static final int MAX = 9;
    private static final int THRESHOLD = 4;

    @Override
    public boolean shouldMove() {
        int number = Randoms.pickNumberInRange(MIN, MAX);
        return number >= THRESHOLD;
    }
}
