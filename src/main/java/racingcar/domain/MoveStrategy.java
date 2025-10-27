package racingcar.domain;

public interface MoveStrategy {
    /**
     * 자동차가 이동할지 여부를 결정
     */
    boolean shouldMove();
}
