//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class RockPaperScissorGUI extends JFrame implements ActionListener {
    JButton rockButton;
    JButton paperButton;
    JButton scissorButton;
    JLabel computerChoice;
    JLabel computerScoreLabel;
    JLabel playerScoreLabel;
    RockPaperScissor rockPaperScissor;

    public RockPaperScissorGUI() {
        super("Rock Paper Scissor");
        this.setSize(450, 574);
        this.setLayout((LayoutManager)null);
        this.setDefaultCloseOperation(3);
        this.setLocationRelativeTo((Component)null);
        this.rockPaperScissor = new RockPaperScissor();
        this.addGuiComponents();
    }

    private void addGuiComponents() {
        this.computerScoreLabel = new JLabel("Computer: 0");
        this.computerScoreLabel.setBounds(0, 43, 450, 30);
        this.computerScoreLabel.setFont(new Font("Dialog", 1, 26));
        this.computerScoreLabel.setHorizontalAlignment(0);
        this.add(this.computerScoreLabel);
        this.computerChoice = new JLabel("?");
        this.computerChoice.setBounds(175, 118, 98, 81);
        this.computerChoice.setFont(new Font("Dialog", 0, 18));
        this.computerChoice.setHorizontalAlignment(0);
        this.computerChoice.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        this.add(this.computerChoice);
        this.playerScoreLabel = new JLabel("Player: 0");
        this.playerScoreLabel.setBounds(0, 317, 450, 30);
        this.playerScoreLabel.setFont(new Font("Dialog", 1, 26));
        this.playerScoreLabel.setHorizontalAlignment(0);
        this.add(this.playerScoreLabel);
        this.rockButton = new JButton("Rock");
        this.rockButton.setBounds(40, 387, 105, 81);
        this.rockButton.setFont(new Font("Dialog", 0, 18));
        this.rockButton.addActionListener(this);
        this.add(this.rockButton);
        this.paperButton = new JButton("Paper");
        this.paperButton.setBounds(165, 387, 105, 81);
        this.paperButton.setFont(new Font("Dialog", 0, 18));
        this.paperButton.addActionListener(this);
        this.add(this.paperButton);
        this.scissorButton = new JButton("Scissors");
        this.scissorButton.setBounds(290, 387, 105, 81);
        this.scissorButton.setFont(new Font("Dialog", 0, 18));
        this.scissorButton.addActionListener(this);
        this.add(this.scissorButton);
    }

    private void showDialog(String message) {
        final JDialog resultDialog = new JDialog(this, "Result", true);
        resultDialog.setSize(227, 124);
        resultDialog.setDefaultCloseOperation(2);
        resultDialog.setResizable(false);
        JLabel resultLabel = new JLabel(message);
        resultLabel.setFont(new Font("Dialog", 1, 18));
        resultLabel.setHorizontalAlignment(0);
        resultDialog.add(resultLabel, "Center");
        JButton tryAgainButton = new JButton("Try Again?");
        tryAgainButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                RockPaperScissorGUI.this.computerChoice.setText("?");
                resultDialog.dispose();
            }
        });
        resultDialog.add(tryAgainButton, "South");
        resultDialog.setLocationRelativeTo(this);
        resultDialog.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String playerChoice = e.getActionCommand();
        String result = this.rockPaperScissor.playRockPaperScissor(playerChoice);
        this.computerChoice.setText(this.rockPaperScissor.getComputerChoice());
        this.computerScoreLabel.setText("Computer: " + this.rockPaperScissor.getComputerScore());
        this.playerScoreLabel.setText("Player: " + this.rockPaperScissor.getPlayerScore());
        this.showDialog(result);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                (new RockPaperScissorGUI()).setVisible(true);
            }
        });
    }
}
