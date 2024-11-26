//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Random;

public class RockPaperScissor {
    private static final String[] computerChoices = new String[]{"Rock", "Paper", "Scissors"};
    private String computerChoice;
    private int computerScore;
    private int playerScore;
    private Random random = new Random();

    public String getComputerChoice() {
        return this.computerChoice;
    }

    public int getComputerScore() {
        return this.computerScore;
    }

    public int getPlayerScore() {
        return this.playerScore;
    }

    public RockPaperScissor() {
    }

    public String playRockPaperScissor(String playerChoice) {
        this.computerChoice = computerChoices[this.random.nextInt(computerChoices.length)];
        String result;
        if (this.computerChoice.equals("Rock")) {
            if (playerChoice.equals("Paper")) {
                result = "Player Wins";
                ++this.playerScore;
            } else if (playerChoice.equals("Scissors")) {
                result = "Computer Wins";
                ++this.computerScore;
            } else {
                result = "Draw";
            }
        } else if (this.computerChoice.equals("Paper")) {
            if (playerChoice.equals("Scissors")) {
                result = "Player Wins";
                ++this.playerScore;
            } else if (playerChoice.equals("Rock")) {
                result = "Computer Wins";
                ++this.computerScore;
            } else {
                result = "Draw";
            }
        } else if (playerChoice.equals("Rock")) {
            result = "Player Wins";
            ++this.playerScore;
        } else if (playerChoice.equals("Paper")) {
            result = "Computer Wins";
            ++this.computerScore;
        } else {
            result = "Draw";
        }

        return result;
    }
}
