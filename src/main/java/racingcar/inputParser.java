package racingcar;

import camp.nextstep.edu.missionutils.Console;
import java.util.ArrayList;
import java.util.List;

public class InputParser {

    private static final int MAX_NAME_LENGTH = 5;

    public static List<String> parseCarNames() {
        System.out.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)");
        String line = Console.readLine();
        List<String> names = splitAndTrim(line);
        validateNames(names);
        System.out.println(names);
        return names;
    }

    private static List<String> splitAndTrim(String line) {
        if (line == null) {
            throw new IllegalArgumentException();
        }

        String[] rawNames = line.split(",");
        List<String> names = new ArrayList<>();

        for (String raw : rawNames) {
            names.add(raw.trim());
        }
        System.out.println(names);
        return names;
    }

    private static void validateNames(List<String> names) {
        if (names.isEmpty()) {
            throw new IllegalArgumentException();
        }

        for (String name : names) {
            if (name.isEmpty()) {
                throw new IllegalArgumentException();
            }
            if (name.length() > MAX_NAME_LENGTH) {
                throw new IllegalArgumentException();
            }
        }
    }
}
