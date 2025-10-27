# java-racingcar-precourse

# feat(input): parse and validate car names

쉼표로 분리, 공백 trim, 이름 길이 ≤ 5, 빈 이름/잘못된 입력이면 IllegalArgumentException 발생.

# feat(input): parse and validate attempt count

입력을 정수로 변환, 양의 정수인지 검사(>0), 실패 시 IllegalArgumentException.

# feat(domain): add Car entity

이름, position 보유. 전진 명령받아 position 증가. 불변성/유효성 검증 포함.

# feat(domain): add Cars collection

List<Car> 관리, 전체 상태 조회/최대 위치 조회/승자 리스트 반환 메서드 제공.

# feat(move): add MoveStrategy and RandomMoveStrategy

MoveStrategy 인터페이스(테스트용 더미 주입 가능). RandomMoveStrategy는 Randoms.pickNumberInRange(0,9) 사용, 값 ≥4면 전진 결정.

# feat(game): implement RacingGame orchestration

시도 횟수만큼 라운드 반복, 각 라운드에서 MoveStrategy로 각 자동차 전진 여부 판단 후 Cars 업데이트. 라운드 결과를 뷰로 전달.

# feat(ui): print round results to console

매 라운드 name : --- 형태로 출력(요구 포맷과 개행 규칙 준수).

# feat(result): compute and print winners

최종 최대 위치를 가진 자동차들(한 명 이상)을 찾아 최종 우승자 : a, b 형식으로 출력.

# test: add unit tests for parser, domain, move strategy, and winner logic

주요 로직(이름/시도 입력 파서, Car/Cars 상태 변경, MoveStrategy 동작, 승자 계산)에 대한 단위 테스트 추가.

# refactor(indent): extract methods to reduce indent depth

메서드 분리로 인덴트 깊이 ≤ 2 보장(코드 가독성·테스트 용이성 개선).
