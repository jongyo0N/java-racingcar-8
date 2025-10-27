package racingcar;

import racingcar.domain.*;
import racingcar.view.ResultView;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        // TODO: 프로그램 구현
        // 1. 자동차 이름 입력
        List<String> carNames = InputParser.parseCarNames();

        // 2. 시도 횟수 입력
        int attempts = InputParser.parseAttemptCounts();

        // 3. Cars 컬렉션 생성
        Cars cars = new Cars(carNames);

        // 4. MoveStrategy 생성
        MoveStrategy moveStrategy = new RandomMoveStrategy();

        // 5. 결과 출력 뷰 생성
        ResultView resultView = new ResultView();

        // 6. 게임 실행
        RacingGame game = new RacingGame(cars, moveStrategy, resultView);
        game.run(attempts);
    }
}
