package Numbers;

public class NumbersGame {
    private String NUMBER;
    private boolean endGame;


    public NumbersGame() {
        NUMBER = createNumber();
        this.endGame = false;
        Game();
    }

    private static String createNumber() {
        StringBuilder string = new StringBuilder();
        while (string.length() != 4) {
            String s = String.valueOf((int) (Math.random() * 10));
            if(!string.toString().contains(s))
            string.append(s);
        }
        return string.toString();
    }

    private void Game() {
        String youString = null;
        Helper.writeMessage("Привет, игра началась.Введи число...");
        System.out.println();

        while (!endGame) {
            youString = Helper.readMessage();
            int count = 0;
            int onPlace = 0;

            if (youString.equals(NUMBER)) {
                Helper.writeMessage("Вы угадали!");
                endGame = true;
            } else if (youString.equalsIgnoreCase("выход")) {
                Helper.writeMessage("Вы вышли из игры");
                endGame = true;
            } else if (youString.equalsIgnoreCase("ответ")) {
                Helper.writeMessage(NUMBER);
            } else {
                for (int i = 0; i < youString.length(); i++) {
                    if(NUMBER.contains(Character.toString(youString.charAt(i)))) {
                        count++;
                    }
                }
                Helper.writeMessage(count + " - ");

                for (int i = 0; i < youString.length(); i++) {
                    if (youString.charAt(i) == NUMBER.charAt(i))
                        onPlace++;
                }
                Helper.writeMessage(onPlace + "\n");
            }
        }
    }

    @Override
    public String toString() {
        return "NumbersGame{" +
                "Number='" + NUMBER + '\'' +
                ", endGame=" + endGame +
                '}';
    }
}
