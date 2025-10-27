package racingcar.domain;

import java.util.ArrayList;
import java.util.List;
import racingcar.view.ResultView;

public class RacingGame {

    private final Cars cars;
    private final MoveStrategy moveStrategy;
    private final ResultView resultView;

    public RacingGame(Cars cars, MoveStrategy moveStrategy, ResultView resultView) {
        this.cars = cars;
        this.moveStrategy = moveStrategy;
        this.resultView = resultView;
    }

    /**
     * 주어진 시도 횟수만큼 게임을 진행
     */

    public void run(int attempts) {
        for (int i = 0; i < attempts; i++) {
            performRound();
            resultView.printRound(cars.getCars());
        }
        resultView.printWinners(cars.winners());
    }

    private void performRound() {
        List<Boolean> moves = new ArrayList<>();
        for (var car : cars.getCars()) {
            moves.add(moveStrategy.shouldMove());
        }
        cars.moveAll(moves);
    }
}
