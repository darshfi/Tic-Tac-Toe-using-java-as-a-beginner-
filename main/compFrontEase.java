package main;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static main.backEnd.compWrL;
import static main.frontEnd.la;
import static main.frontEnd.uy;

public class compFrontEase{
    private static JPanel comp = new JPanel(new GridLayout(3,3,3,3));
    public static JButton[] bottons = new JButton[9];
    public static char[] po = new char[9];
    private int o = 0;
    private final ImageIcon cross = new ImageIcon("D:\\tictoe\\Full\\Tic-Tac-Toe-using-java-as-a-beginner-\\main\\images\\ti.png");
    private final ImageIcon circle = new ImageIcon("D:\\tictoe\\Full\\Tic-Tac-Toe-using-java-as-a-beginner-\\main\\images\\dah.png");

    compFrontEase(){
        for (int i = 0; i < 9; i++) {
            bottons[i] = new JButton();
            bottons[i].setBackground(Color.black);
            bottons[i].setPreferredSize(new Dimension(130,130));
            comp.add(bottons[i]);
            bottons[i].setName(String.valueOf(i));
            po[i] = (char) i;
        }
    //input from the user
        bottons[0].addActionListener(_ -> {
            po[0] = 'X';
            bottons[0].setIcon(cross);
            bottons[0].setDisabledIcon(cross);
            bottons[0].setEnabled(false);
            o++;
            //in try and catch because if there is no result then it can continue instead of having to wait to show smthn
            try {
                compWrL();
            } catch (Exception ex) {
                compLogic();
            }
        });

        bottons[1].addActionListener(_ -> {
            po[1] = 'X';
            bottons[1].setIcon(cross);
            bottons[1].setDisabledIcon(cross);
            bottons[1].setEnabled(false);
            o++;
            try {
                compWrL();
            } catch (Exception ex) {
                compLogic();
            }
        });

        bottons[2].addActionListener(_ -> {
            po[2] = 'X';
            bottons[2].setIcon(cross);
            bottons[2].setDisabledIcon(cross);
            bottons[2].setEnabled(false);
            o++;
            try {
                compWrL();
            } catch (Exception ex) {
                compLogic();
            }
        });

        bottons[3].addActionListener(_ -> {
            po[3] = 'X';
            bottons[3].setIcon(cross);
            bottons[3].setDisabledIcon(cross);
            bottons[3].setEnabled(false);
            System.out.println("Wowowwww");
            o++;
            try {
                compWrL();
            } catch (Exception ex) {
                compLogic();
            }
        });

        bottons[4].addActionListener(_ -> {
            po[4] = 'X';
            bottons[4].setIcon(cross);
            bottons[4].setDisabledIcon(cross);
            bottons[4].setEnabled(false);
            o++;
            try {
                compWrL();
            } catch (Exception ex) {
                compLogic();
            }
        });

        bottons[5].addActionListener(_ -> {
            po[5] = 'X';
            bottons[5].setIcon(cross);
            bottons[5].setDisabledIcon(cross);
            bottons[5].setEnabled(false);
            o++;
            try {
                compWrL();
            } catch (Exception ex) {
                compLogic();
            }
        });

        bottons[6].addActionListener(_ -> {
            po[6] = 'X';
            bottons[6].setIcon(cross);
            bottons[6].setDisabledIcon(cross);
            bottons[6].setEnabled(false);
            o++;
            try {
                compWrL();
            } catch (Exception ex) {
                compLogic();
            }
        });

        bottons[7].addActionListener(_ -> {
            po[7] = 'X';
            bottons[7].setIcon(cross);
            bottons[7].setDisabledIcon(cross);
            bottons[7].setEnabled(false);
            o++;
            try {
                compWrL();
            } catch (Exception ex) {
                compLogic();
            }
        });

        bottons[8].addActionListener(_ -> {
            po[8] = 'X';
            bottons[8].setIcon(cross);
            bottons[8].setDisabledIcon(cross);
            bottons[8].setEnabled(false);
            o++;
            try {
                compWrL();
            } catch (Exception ex) {
                compLogic();
            }
        });

        if(o==9){
            JOptionPane.showMessageDialog(null,"It is a draw");
        }//if

        la.setSize(400,442);
        comp.setPreferredSize(new Dimension(400,400));
        comp.setBackground(Color.white);
        uy.setVisible(false);
        la.add(comp);
    }//compFront

    private static final Random shit = new Random();
    //logic for easy mode
    private void compLogic(){
         /*
            it's easy mode so the index for the buttons will be random
            it has recursive calls, so it can run until a free index is chosen
            all 'if' inside the cases are to check if the index is already chosen or not
            the 'po' array is for the logic of win or lose
          */
        int k = shit.nextInt(9)+1;
        if(o<9) {
            switch (k) {
                case 1:
                    if (po[0] == 'X' || po[0] == 'O') {
                        System.out.println("The chosen index is already filled!!!");
                        compLogic();
                    }//if
                    else {
                        po[0] = 'O';
                        bottons[0].setIcon(circle);
                        bottons[0].setDisabledIcon(circle);
                        bottons[0].setEnabled(false);
                        o++;
                        compWrL();
                    }//else
                    break;
                case 2:
                    if (po[1] == 'X' || po[1] == 'O') {
                        System.out.println("The chosen index is already filled!!!");
                        compLogic();
                    }//if
                    else {
                        po[1] = 'O';
                        bottons[1].setIcon(circle);
                        bottons[1].setDisabledIcon(circle);
                        bottons[1].setEnabled(false);
                        o++;
                        compWrL();
                    }//else
                    break;
                case 3:
                    if (po[2] == 'X' || po[2] == 'O') {
                        System.out.println("The chosen index is already filled!!!");
                        compLogic();
                    }//if
                    else {
                        po[2] = 'O';
                        bottons[2].setIcon(circle);
                        bottons[2].setDisabledIcon(circle);
                        bottons[2].setEnabled(false);
                        o++;
                        compWrL();
                    }//else
                    break;
                case 4:
                    if (po[3] == 'X' || po[3] == 'O') {
                        System.out.println("The chosen index is already filled!!!");
                        compLogic();
                    }//if
                    else {
                        po[3] = 'O';
                        bottons[3].setIcon(circle);
                        bottons[3].setDisabledIcon(circle);
                        bottons[3].setEnabled(false);
                        o++;
                        compWrL();
                    }//else
                    break;
                case 5:
                    if (po[4] == 'X' || po[4] == 'O') {
                        System.out.println("The chosen index is already filled!!!");
                        compLogic();
                    }//if
                    else {
                        po[4] = 'O';
                        bottons[4].setIcon(circle);
                        bottons[4].setDisabledIcon(circle);
                        bottons[4].setEnabled(false);
                        o++;
                        compWrL();
                    }//else
                    break;
                case 6:
                    if (po[5] == 'X' || po[5] == 'O') {
                        System.out.println("The chosen index is already filled!!!");
                        compLogic();
                    }//if
                    else {
                        po[5] = 'O';
                        bottons[5].setIcon(circle);
                        bottons[5].setDisabledIcon(circle);
                        bottons[5].setEnabled(false);
                        o++;
                        compWrL();
                    }//else
                    break;
                case 7:
                    if (po[6] == 'X' || po[6] == 'O') {
                        System.out.println("The chosen index is already filled!!!");
                        compLogic();
                    }//if
                    else {
                        po[6] = 'O';
                        bottons[6].setIcon(circle);
                        bottons[6].setDisabledIcon(circle);
                        bottons[6].setEnabled(false);
                        o++;
                        compWrL();
                    }//else
                    break;
                case 8:
                    if (po[7] == 'X' || po[7] == 'O') {
                        System.out.println("The chosen index is already filled!!!");
                        compLogic();
                    }//if
                    else {
                        po[7] = 'O';
                        bottons[7].setIcon(circle);
                        bottons[7].setDisabledIcon(circle);
                        bottons[7].setEnabled(false);
                        o++;
                        compWrL();
                    }//else
                    break;
                case 9:
                    if (po[8] == 'X' || po[8] == 'O') {
                        System.out.println("The chosen index is already filled!!!");
                        compLogic();
                    }//if
                    else {
                        po[8] = 'O';
                        bottons[8].setIcon(circle);
                        bottons[8].setDisabledIcon(circle);
                        bottons[8].setEnabled(false);
                        o++;
                        compWrL();
                    }//else
                    break;
                default:
                    System.out.println("DEFAULT");
            }//switch
        }//if
        else{
            JOptionPane.showMessageDialog(null,"It is a draw");
        }
    }//compLogic
}//class
