package view;

import interface_adapter.EndScreen.EndScreenState;
import interface_adapter.EndScreen.EndScreenViewModel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class EndScreenView extends JPanel implements ActionListener, PropertyChangeListener {

    private final JLabel firstPlayer;
    private final EndScreenViewModel endScreenViewModel;
    public final String viewName;

    public EndScreenView(EndScreenViewModel endScreenViewModel){
        this.endScreenViewModel = endScreenViewModel;
        this.viewName = this.endScreenViewModel.getViewName();
        this.endScreenViewModel.addPropertyChangeListener(this);
        EndScreenState state = this.endScreenViewModel.getState();
        this.firstPlayer = new JLabel("Game Over! " + state.getFirstPlayerName() + " won with a final score of "
        + state.getFirstScore() + " points!");

        JButton playAgain = new JButton("Play Again");
        JButton toMenu = new JButton("Back To Menu");

        this.add(firstPlayer);
        JPanel buttons = new JPanel();
        buttons.add(playAgain);
        buttons.add(toMenu);
        this.add(buttons);

        playAgain.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        if (evt.getSource().equals(playAgain)) {
                            // todo add relevant methods here, call to RunGame
                        }
                    }
                }
        );
        toMenu.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent evt) {
                        if (evt.getSource().equals(toMenu)) {
                            // todo add relevant methods here, call to HomeView
                        }
                    }
                }
        );
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        EndScreenState state = this.endScreenViewModel.getState();
        this.firstPlayer.setText("Game Over! " + state.getFirstPlayerName() + " won with a final score of "
                + state.getFirstScore() + " points!");
    }
}
