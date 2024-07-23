package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class frontEnd {
    private boolean i = true;
    public static JButton[] buttons = new JButton[9];
    private final ImageIcon cross = new ImageIcon("D:\\tictoe\\Full\\Tic-Tac-Toe-using-java-as-a-beginner-\\main\\images\\ti.png");
    private final ImageIcon circle = new ImageIcon("D:\\tictoe\\Full\\Tic-Tac-Toe-using-java-as-a-beginner-\\main\\images\\dah.png");
    public static char[] lo = new char[9];
    public static final JFrame la = new JFrame("TIC TAC TOE");
    public static final JPanel ia = new JPanel(new BorderLayout());
    public static final JPanel uy = new JPanel(new GridLayout(2,1));

    frontEnd(){
        //the app icon
        ImageIcon icon = new ImageIcon("D:\\tictoe\\Full\\Tic-Tac-Toe-using-java-as-a-beginner-\\main\\images\\ticta.png");

        //settings for the frame
        la.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        la.setSize(450,650);
        la.setResizable(false);
        la.setIconImage(icon.getImage());

        //images for start page
        ImageIcon fi = new ImageIcon("D:\\tictoe\\Full\\Tic-Tac-Toe-using-java-as-a-beginner-\\main\\images\\fri.png");
        ImageIcon co = new ImageIcon("D:\\tictoe\\Full\\Tic-Tac-Toe-using-java-as-a-beginner-\\main\\images\\compu.png");

        //buttons for mode selection
        JButton comp = new JButton(co);
        comp.setBackground(Color.white);
        comp.setPreferredSize(new Dimension(200,300));
        JButton frid = new JButton(fi);
        frid.setBackground(Color.white);
        frid.setPreferredSize(new Dimension(200,300));

        //actionfor computer button
        comp.addActionListener(_ -> {
            ImageIcon jaj = new ImageIcon("D:\\tictoe\\Full\\Tic-Tac-Toe-using-java-as-a-beginner-\\main\\images\\iai.png");
            ImageIcon pop = new ImageIcon("D:\\tictoe\\Full\\Tic-Tac-Toe-using-java-as-a-beginner-\\main\\images\\okao.jpg");
            JButton ok = new JButton(), woke = new JButton();
            ok.setBackground(new Color(0xF9EBD1));
            ok.setIcon(jaj);
            woke.setBackground(Color.white);
            woke.setIcon(pop);
            uy.add(ok);
            uy.add(woke);

            la.setPreferredSize(new Dimension(400,442));
            ia.setVisible(false);
            la.add(uy);
            //easy mode
            ok.addActionListener(_ -> new compFrontEase());
            //hard mode
            woke.addActionListener(_ -> new compFrontHard());
        });

        //vs friend mode
        frid.addActionListener(_ -> friend());

        //making the mode selection panel visible
        ia.add(comp, BorderLayout.CENTER);
        ia.add(frid, BorderLayout.SOUTH);
        la.add(ia);
        la.setVisible(true);
    }//main.frontEnd

    private static final JPanel oka = new JPanel(new GridLayout(3,3,3,3));
    private static final JPanel frnd = new JPanel();

    //front end(gui) for vs friend mode
    private void friend(){
        frnd.setBackground(Color.white);

        //setting up the buttons and assigning them button click listener for UX
        for (int i = 0; i < 9; i++) {
            buttons[i] = new JButton();
            buttons[i].addActionListener(new ButtonClickListener(buttons[i]));
            buttons[i].setBackground(Color.black);
            buttons[i].setPreferredSize(new Dimension(130,130));
            oka.add(buttons[i]);
            buttons[i].setName(String.valueOf(i));
            //array for the logic
            lo[i] = (char) i;
        }

        la.setSize(400,442);
        oka.setPreferredSize(new Dimension(400,400));
        frnd.add(oka);
        ia.setVisible(false);
        la.add(frnd);
    }//friend
    //UX for the vs friend mode
    private class ButtonClickListener implements ActionListener {
        private int lk = 0;
        private final JButton clickedButton;

        public ButtonClickListener(JButton button) {
            //getting the details for the button clicked
            this.clickedButton = button;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            //till all the buttons are empty or till there is a result, it will continue to go back and forth
            if (clickedButton.getText().isEmpty()) {
                if (i) {
                    //changing the icon of the clicked button to cross for the UI
                    clickedButton.setIcon(cross);
                    //switch to get the name to get the correct index of button clicked and to get whether it's a cross or circle for the main logic
                    switch (clickedButton.getName()){
                        case "0":
                            lo[0] = 'X';
                            break;
                        case "1":
                            lo[1] = 'X';
                            break;
                        case "2":
                            lo[2] = 'X';
                            break;
                        case "3":
                            lo[3] = 'X';
                            break;
                        case "4":
                            lo[4] = 'X';
                            break;
                        case "5":
                            lo[5] = 'X';
                            break;
                        case "6":
                            lo[6] = 'X';
                            break;
                        case "7":
                            lo[7] = 'X';
                            break;
                        case "8":
                            lo[8] = 'X';
                            break;
                        default:
                            System.out.println();
                    }//switch
                    clickedButton.setEnabled(false);
                    clickedButton.setDisabledIcon(cross);
                    lk++;
                    i = false;
                    backEnd.Logic();
                } else {
                    clickedButton.setIcon(circle);
                    switch (clickedButton.getName()){
                        case "0":
                            lo[0] = 'O';
                            break;
                        case "1":
                            lo[1] = 'O';
                            break;
                        case "2":
                            lo[2] = 'O';
                            break;
                        case "3":
                            lo[3] = 'O';
                            break;
                        case "4":
                            lo[4] = 'O';
                            break;
                        case "5":
                            lo[5] = 'O';
                            break;
                        case "6":
                            lo[6] = 'O';
                            break;
                        case "7":
                            lo[7] = 'O';
                            break;
                        case "8":
                            lo[8] = 'O';
                            break;
                        default:
                            System.out.println();
                    }//switch
                    clickedButton.setEnabled(false);
                    clickedButton.setDisabledIcon(circle);
                    lk++;
                    i = true;
                    backEnd.Logic();
                }//else
            }//if
            if(lk == 9){
                JOptionPane.showMessageDialog(null,"It is a draw");
            }//if
        }//action
    }//button click listener
}//class
