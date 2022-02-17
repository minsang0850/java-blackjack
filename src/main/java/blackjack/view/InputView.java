package blackjack.view;

import blackjack.domain.user.Player;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class InputView {

    private static final Scanner scanner = new Scanner(System.in);

    private InputView() {
    }

    public static List<String> getPlayerNames() {
        System.out.println("게임에 참여할 사람의 이름을 입력하세요.(쉼표 기준으로 분리)");
        String playerNames = scanner.nextLine();
        return Arrays.stream(playerNames.split(","))
            .map(String::trim)
            .collect(Collectors.toList());
    }

    public static String getDrawRequest(Player player) {
        System.out.printf("%s는 한장의 카드를 더 받겠습니까?(예는 y, 아니오는 n)", player.name());
        return scanner.nextLine();
    }
}