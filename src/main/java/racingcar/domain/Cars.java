package racingcar.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cars {

    private final List<Car> cars;

    public Cars(List<String> names) {
        if (names == null || names.isEmpty()) {
            throw new IllegalArgumentException();
        }

        List<Car> list = new ArrayList<>();
        for (String name : names) {
            list.add(new Car(name));
        }

        this.cars = Collections.unmodifiableList(list);
    }

    public List<Car> getCars() {
        return cars;
    }

    public void moveAll(List<Boolean> moves) {
        if (moves.size() != cars.size()) {
            throw new IllegalArgumentException();
        }

        for (int i = 0; i < cars.size(); i++) {
            if (moves.get(i)) {
                cars.get(i).move();
            }
        }
    }

    public int maxPosition() {
        int max = 0;
        for (Car c : cars) {
            if (c.getPosition() > max) {
                max = c.getPosition();
            }
        }
        return max;
    }

    public List<String> winners() {
        int max = maxPosition();
        List<String> result = new ArrayList<>();
        for (Car c : cars) {
            if (c.getPosition() == max) {
                result.add(c.getName());
            }
        }
        return result;
    }
}
