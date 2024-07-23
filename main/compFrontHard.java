package main;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

import static main.backEnd.compHlWrL;
import static main.frontEnd.la;
import static main.frontEnd.uy;

public class compFrontHard{
    private static final JPanel comp = new JPanel(new GridLayout(3,3,3,3));
    public static JButton[] battons = new JButton[9];
    public static char[] no = new char[9];
    private int d = 0;
    private final ImageIcon cross = new ImageIcon("D:\\tictoe\\Full\\Tic-Tac-Toe-using-java-as-a-beginner-\\main\\images\\ti.png");
    private final ImageIcon circle = new ImageIcon("D:\\tictoe\\Full\\Tic-Tac-Toe-using-java-as-a-beginner-\\main\\images\\dah.png");

    compFrontHard(){
        for (int i = 0; i < 9; i++) {
            battons[i] = new JButton();
            battons[i].setBackground(Color.black);
            battons[i].setPreferredSize(new Dimension(130,130));
            comp.add(battons[i]);
            battons[i].setName(String.valueOf(i));
            no[i] = (char) i;
        }//for

    //input from the user
        battons[0].addActionListener(_ -> {
            no[0] = 'X';
            battons[0].setIcon(cross);
            battons[0].setDisabledIcon(cross);
            battons[0].setEnabled(false);
            d++;
            try {
                compHlWrL();
            } catch (Exception ex) {
                compLog();
            }
        });

        battons[1].addActionListener(_ -> {
            no[1] = 'X';
            battons[1].setIcon(cross);
            battons[1].setDisabledIcon(cross);
            battons[1].setEnabled(false);
            d++;
            try {
                compHlWrL();
            } catch (Exception ex) {
                compLog();
            }
        });

        battons[2].addActionListener(_ -> {
            no[2] = 'X';
            battons[2].setIcon(cross);
            battons[2].setDisabledIcon(cross);
            battons[2].setEnabled(false);
            d++;
            try {
                compHlWrL();
            } catch (Exception ex) {
                compLog();
            }
        });

        battons[3].addActionListener(_ -> {
            no[3] = 'X';
            battons[3].setIcon(cross);
            battons[3].setDisabledIcon(cross);
            battons[3].setEnabled(false);
            d++;
            try {
                compHlWrL();
            } catch (Exception ex) {
                compLog();
            }
        });

        battons[4].addActionListener(_ -> {
            no[4] = 'X';
            battons[4].setIcon(cross);
            battons[4].setDisabledIcon(cross);
            battons[4].setEnabled(false);
            d++;
            try {
                compHlWrL();
            } catch (Exception ex) {
                compLog();
            }
        });

        battons[5].addActionListener(_ -> {
            no[5] = 'X';
            battons[5].setIcon(cross);
            battons[5].setDisabledIcon(cross);
            battons[5].setEnabled(false);
            d++;
            try {
                compHlWrL();
            } catch (Exception ex) {
                compLog();
            }
        });

        battons[6].addActionListener(_ -> {
            no[6] = 'X';
            battons[6].setIcon(cross);
            battons[6].setDisabledIcon(cross);
            battons[6].setEnabled(false);
            d++;
            try {
                compHlWrL();
            } catch (Exception ex) {
                compLog();
            }
        });

        battons[7].addActionListener(_ -> {
            no[7] = 'X';
            battons[7].setIcon(cross);
            battons[7].setDisabledIcon(cross);
            battons[7].setEnabled(false);
            d++;
            try {
                compHlWrL();
            } catch (Exception ex) {
                compLog();
            }
        });

        battons[8].addActionListener(_ -> {
            no[8] = 'X';
            battons[8].setIcon(cross);
            battons[8].setDisabledIcon(cross);
            battons[8].setEnabled(false);
            d++;
            try {
                compHlWrL();
            } catch (Exception ex) {
                compLog();
            }
        });

        la.setSize(400,442);
        comp.setPreferredSize(new Dimension(400,400));
        comp.setBackground(Color.white);
        uy.setVisible(false);
        la.add(comp);
    }//main.compFrontHard

    private static final Random shit = new Random();

    private void compLo() {
        /*
        this is for the starting of the game because there would be no correct order
        we cannot use the one from 'compFrontEase' because the variables for both will be different
         */
        int k = shit.nextInt(9)+1;
        if(d<9) {
            switch (k) {
                case 1:
                    if (no[0] == 'X' || no[0] == 'O') {
                        System.out.println("The choosen index is already filled!!!");
                        compLo();
                    }//if
                    else {
                        no[0] = 'O';
                        battons[0].setIcon(circle);
                        battons[0].setDisabledIcon(circle);
                        battons[0].setEnabled(false);
                        d++;
                        compHlWrL();
                    }//else
                    break;
                case 2:
                    if (no[1] == 'X' || no[1] == 'O') {
                        System.out.println("The choosen index is already filled!!!");
                        compLo();
                    }//if
                    else {
                        no[1] = 'O';
                        battons[1].setIcon(circle);
                        battons[1].setDisabledIcon(circle);
                        battons[1].setEnabled(false);
                        d++;
                        compHlWrL();
                    }//else
                    break;
                case 3:
                    if (no[2] == 'X' || no[2] == 'O') {
                        System.out.println("The choosen index is already filled!!!");
                        compLo();
                    }//if
                    else {
                        no[2] = 'O';
                        battons[2].setIcon(circle);
                        battons[2].setDisabledIcon(circle);
                        battons[2].setEnabled(false);
                        d++;
                        compHlWrL();
                    }//else
                    break;
                case 4:
                    if (no[3] == 'X' || no[3] == 'O') {
                        System.out.println("The choosen index is already filled!!!");
                        compLo();
                    }//if
                    else {
                        no[3] = 'O';
                        battons[3].setIcon(circle);
                        battons[3].setDisabledIcon(circle);
                        battons[3].setEnabled(false);
                        d++;
                        compHlWrL();
                    }//else
                    break;
                case 5:
                    if (no[4] == 'X' || no[4] == 'O') {
                        System.out.println("The choosen index is already filled!!!");
                        compLo();
                    }//if
                    else {
                        no[4] = 'O';
                        battons[4].setIcon(circle);
                        battons[4].setDisabledIcon(circle);
                        battons[4].setEnabled(false);
                        d++;
                        compHlWrL();
                    }//else
                    break;
                case 6:
                    if (no[5] == 'X' || no[5] == 'O') {
                        System.out.println("The choosen index is already filled!!!");
                        compLo();
                    }//if
                    else {
                        no[5] = 'O';
                        battons[5].setIcon(circle);
                        battons[5].setDisabledIcon(circle);
                        battons[5].setEnabled(false);
                        d++;
                        compHlWrL();
                    }//else
                    break;
                case 7:
                    if (no[6] == 'X' || no[6] == 'O') {
                        System.out.println("The choosen index is already filled!!!");
                        compLo();
                    }//if
                    else {
                        no[6] = 'O';
                        battons[6].setIcon(circle);
                        battons[6].setDisabledIcon(circle);
                        battons[6].setEnabled(false);
                        d++;
                        compHlWrL();
                    }//else
                    break;
                case 8:
                    if (no[7] == 'X' || no[7] == 'O') {
                        System.out.println("The choosen index is already filled!!!");
                        compLo();
                    }//if
                    else {
                        no[7] = 'O';
                        battons[7].setIcon(circle);
                        battons[7].setDisabledIcon(circle);
                        battons[7].setEnabled(false);
                        d++;
                        compHlWrL();
                    }//else
                    break;
                case 9:
                    if (no[8] == 'X' || no[8] == 'O') {
                        System.out.println("The choosen index is already filled!!!");
                        compLo();
                    }//if
                    else {
                        no[8] = 'O';
                        battons[8].setIcon(circle);
                        battons[8].setDisabledIcon(circle);
                        battons[8].setEnabled(false);
                        d++;
                        compHlWrL();
                    }//else
                    break;
                default:
                    System.out.println("DEFAULT");
            }//switch
        }//if
        else{
            JOptionPane.showMessageDialog(null,"It is a draw");
        }
    }

    private void compLog(){
        /*
        first we will be checking if there are any possibilities where the computer can win or can stop the user for winning
        if there are none then it will go to the 'complo' to get a random index
         */
        if(no[0] == no[1] || no[1] == no[2] || no[0] == no[2]){
            if(no[0] == no[1]){
                if(no[2] == 'X' || no[2] == 'O') {
                    compLo();
                }//if
                else{
                    no[2] = 'O';
                    battons[2].setIcon(circle);
                    battons[2].setDisabledIcon(circle);
                    battons[2].setEnabled(false);
                    d++;
                    compHlWrL();
                }//else
            }//if
            else if(no[1] == no[2]){
                if(no[0] == 'X' || no[0] == 'O'){
                    compLo();
                }//if
                else {
                    no[0] = 'O';
                    battons[0].setIcon(circle);
                    battons[0].setDisabledIcon(circle);
                    battons[0].setEnabled(false);
                    d++;
                    compHlWrL();
                }//else
            }//elseif1
            else {
                if(no[1] == 'X' || no[1] == 'O'){
                    compLo();
                }//if
                else {
                    no[1] = 'O';
                    battons[1].setIcon(circle);
                    battons[1].setDisabledIcon(circle);
                    battons[1].setEnabled(false);
                    d++;
                    compHlWrL();
                }//else(in)
            }//else(out)
        }//if
        else if(no[3] == no[4] || no[4] == no[5] || no[3] == no[5]){
            if(no[3] == no[4]){
                if(no[5] == 'X' || no[5] == 'O') {
                    compLo();
                }//if
                else{
                    no[5] = 'O';
                    battons[5].setIcon(circle);
                    battons[5].setDisabledIcon(circle);
                    battons[5].setEnabled(false);
                    d++;
                    compHlWrL();
                }//else
            }//if
            else if(no[4] == no[5]){
                if(no[3] == 'X' || no[3] == 'O'){
                    compLo();
                }//if
                else {
                    no[3] = 'O';
                    battons[3].setIcon(circle);
                    battons[3].setDisabledIcon(circle);
                    battons[3].setEnabled(false);
                    d++;
                    compHlWrL();
                }//else
            }//elseif1
            else {
                if(no[4] == 'X' || no[4] == 'O'){
                    compLo();
                }//if
                else {
                    no[4] = 'O';
                    battons[4].setIcon(circle);
                    battons[4].setDisabledIcon(circle);
                    battons[4].setEnabled(false);
                    d++;
                    compHlWrL();
                }//else(in)
            }//else(out)
        }//elseif1
        else if(no[6] == no[7] || no[7] == no[8] || no[6] == no[8]){
            if(no[6] == no[7]){
                if(no[8] == 'X' || no[8] == 'O') {
                    compLo();
                }//if
                else{
                    no[8] = 'O';
                    battons[8].setIcon(circle);
                    battons[8].setDisabledIcon(circle);
                    battons[8].setEnabled(false);
                    d++;
                    compHlWrL();
                }//else
            }//if
            else if(no[7] == no[8]){
                if(no[6] == 'X' || no[6] == 'O'){
                    compLo();
                }//if
                else {
                    no[6] = 'O';
                    battons[6].setIcon(circle);
                    battons[6].setDisabledIcon(circle);
                    battons[6].setEnabled(false);
                    d++;
                    compHlWrL();
                }//else
            }//elseif1
            else {
                if(no[7] == 'X' || no[7] == 'O'){
                    compLo();
                }//if
                else {
                    no[7] = 'O';
                    battons[7].setIcon(circle);
                    battons[7].setDisabledIcon(circle);
                    battons[7].setEnabled(false);
                    d++;
                    compHlWrL();
                }//else(in)
            }//else(out)
        }//elseif2
        else if(no[0] == no[3] || no[3] == no[6] || no[0] == no[6]){
            if(no[0] == no[3]){
                if(no[6] == 'X' || no[6] == 'O'){
                    compLo();
                }//if
                else{
                    no[6] = 'O';
                    battons[6].setIcon(circle);
                    battons[6].setDisabledIcon(circle);
                    battons[6].setEnabled(false);
                    d++;
                    compHlWrL();
                }//else
            }//if
            else if(no[3] == no[6]){
                if(no[0] == 'X' || no[0] == 'O'){
                    compLo();
                }//if
                else{
                    no[0] = 'O';
                    battons[0].setIcon(circle);
                    battons[0].setDisabledIcon(circle);
                    battons[0].setEnabled(false);
                    d++;
                    compHlWrL();
                }//else
            }//elseif1
            else{
                if(no[3] == 'X' || no[3] == 'O'){
                    compLo();
                }//if
                else{
                    no[3] = 'O';
                    battons[3].setIcon(circle);
                    battons[3].setDisabledIcon(circle);
                    battons[3].setEnabled(false);
                    d++;
                    compHlWrL();
                }//else(in)
            }//else(out)
        }//elseif3
        else if (no[1] == no[4] || no[4] == no[7] || no[1] == no[7]){
            if(no[1] == no[4]){
                if(no[7] == 'X' || no[7] == 'O'){
                    compLo();
                }//if
                else{
                    no[7] = 'O';
                    battons[7].setIcon(circle);
                    battons[7].setDisabledIcon(circle);
                    battons[7].setEnabled(false);
                    d++;
                    compHlWrL();
                }//else
            }//if
            else if(no[4] == no[7]){
                if(no[1] == 'X' || no[1] == 'O'){
                    compLo();
                }//if
                else{
                    no[1] = 'O';
                    battons[1].setIcon(circle);
                    battons[1].setDisabledIcon(circle);
                    battons[1].setEnabled(false);
                    d++;
                    compHlWrL();
                }//else
            }//elseif1
            else{
                if(no[4] == 'X' || no[4] == 'O'){
                    compLo();
                }//if
                else{
                    no[4] = 'O';
                    battons[4].setIcon(circle);
                    battons[4].setDisabledIcon(circle);
                    battons[4].setEnabled(false);
                    d++;
                    compHlWrL();
                }//else(in)
            }//else(out)
        }//elseif4
        else if (no[2] == no[5] || no[5] == no[8] || no[2] == no[8]){
            if(no[2] == no[5]){
                if(no[8] == 'X' || no[8] == 'O'){
                    compLo();
                }//if
                else{
                    no[8] = 'O';
                    battons[8].setIcon(circle);
                    battons[8].setDisabledIcon(circle);
                    battons[8].setEnabled(false);
                    d++;
                    compHlWrL();
                }//else
            }//if
            else if(no[5] == no[8]){
                if(no[2] == 'X' || no[2] == 'O'){
                    compLo();
                }//if
                else{
                    no[2] = 'O';
                    battons[2].setIcon(circle);
                    battons[2].setDisabledIcon(circle);
                    battons[2].setEnabled(false);
                    d++;
                    compHlWrL();
                }//else
            }//elseif1
            else{
                if(no[5] == 'X' || no[5] == 'O'){
                    compLo();
                }//if
                else{
                    no[5] = 'O';
                    battons[5].setIcon(circle);
                    battons[5].setDisabledIcon(circle);
                    battons[5].setEnabled(false);
                    d++;
                    compHlWrL();
                }//else(in)
            }//else(out)
        }//elseif5
        else if(no[0] == no[4] || no[4] == no[8] || no[0] == no[8]){
            if(no[0] == no[4]){
                if(no[8] == 'X' || no[8] == 'O'){
                    compLo();
                }//if
                else{
                    no[8] = 'O';
                    battons[8].setIcon(circle);
                    battons[8].setDisabledIcon(circle);
                    battons[8].setEnabled(false);
                    d++;
                    compHlWrL();
                }//else
            }//if
            else if(no[4] == no[8]){
                if(no[0] == 'X' || no[0] == 'O'){
                    compLo();
                }//if
                else{
                    no[0] = 'O';
                    battons[0].setIcon(circle);
                    battons[0].setDisabledIcon(circle);
                    battons[0].setEnabled(false);
                    d++;
                    compHlWrL();
                }//else
            }//elseif1
            else{
                if(no[4] == 'X' || no[4] == 'O'){
                    compLo();
                }//if
                else{
                    no[4] = 'O';
                    battons[4].setIcon(circle);
                    battons[4].setDisabledIcon(circle);
                    battons[4].setEnabled(false);
                    d++;
                    compHlWrL();
                }//else(in)
            }//else(out)
        }//elseif6
        else if(no[2] == no[4] || no[4] == no[6] || no[2] == no[6]){
            if(no[2] == no[4]){
                if(no[6] == 'X' || no[6] == 'O'){
                    compLo();
                }//if
                else{
                    no[6] = 'O';
                    battons[6].setIcon(circle);
                    battons[6].setDisabledIcon(circle);
                    battons[6].setEnabled(false);
                    d++;
                    compHlWrL();
                }//else
            }//if
            else if(no[4] == no[6]){
                if(no[2] == 'X' || no[2] == 'O'){
                    compLo();
                }//if
                else{
                    no[2] = 'O';
                    battons[2].setIcon(circle);
                    battons[2].setDisabledIcon(circle);
                    battons[2].setEnabled(false);
                    d++;
                    compHlWrL();
                }//else
            }//elseif1
            else{
                if(no[4] == 'X' || no[4] == 'O'){
                    compLo();
                }//if
                else{
                    no[4] = 'O';
                    battons[4].setIcon(circle);
                    battons[4].setDisabledIcon(circle);
                    battons[4].setEnabled(false);
                    d++;
                    compHlWrL();
                }//else(in)
            }//else(out)
        }//elseif7
        else{
            compLo();
        }//else
    }//compLo
}//class
