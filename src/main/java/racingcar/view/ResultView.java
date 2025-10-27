package racingcar.view;

import racingcar.domain.Car;

import java.util.List;

public class ResultView {

    /**
     * 각 자동차의 현재 위치를 출력
     * 예: pobi : --
     */
    public void printRound(List<Car> cars) {
        for (Car car : cars) {
            StringBuilder sb = new StringBuilder();
            sb.append(car.getName()).append(" : ");
            for (int i = 0; i < car.getPosition(); i++) {
                sb.append("-");
            }
            System.out.println(sb);
        }
        System.out.println();
    }

    /**
     * 최종 우승자를 출력
     */
    public void printWinners(List<String> winners) {
        StringBuilder sb = new StringBuilder();
        sb.append("최종 우승자 : ");
        for (int i = 0; i < winners.size(); i++) {
            sb.append(winners.get(i));
            if (i < winners.size() - 1) {
                sb.append(", ");
            }
        }
        System.out.println(sb);
    }
}
