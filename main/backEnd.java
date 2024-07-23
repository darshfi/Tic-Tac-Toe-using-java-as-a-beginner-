package main;

import javax.swing.*;

import static main.compFrontEase.bottons;
import static main.compFrontEase.po;
import static main.compFrontHard.battons;
import static main.compFrontHard.no;

public class backEnd{
    //checking all the possibilities for a win by either
    //again we can't use the same for all because the variables will differ

    //'vs friend'
    static void Logic(){
        if(frontEnd.lo[0] == frontEnd.lo[1] && frontEnd.lo[1] == frontEnd.lo[2]){
            JOptionPane.showMessageDialog(null, frontEnd.lo[1] +" is the winner");
            for(int i = 0; i<9; i++){
                frontEnd.buttons[i].setEnabled(false);
            }//for
        }//if
        else if(frontEnd.lo[3] == frontEnd.lo[4] && frontEnd.lo[4] == frontEnd.lo[5]){
            JOptionPane.showMessageDialog(null, frontEnd.lo[4] +" is the winner");
            for(int i = 0; i<9; i++){
                frontEnd.buttons[i].setEnabled(false);
            }//for
        }//elseif1
        else if(frontEnd.lo[6] == frontEnd.lo[7] && frontEnd.lo[7] == frontEnd.lo[8]){
            JOptionPane.showMessageDialog(null, frontEnd.lo[7] +" is the winner");
            for(int i = 0; i<9; i++){
                frontEnd.buttons[i].setEnabled(false);
            }//for
        }//elseif2
        else if(frontEnd.lo[0] == frontEnd.lo[3] && frontEnd.lo[3]== frontEnd.lo[6]){
            JOptionPane.showMessageDialog(null, frontEnd.lo[3] +" is the winner");
            for(int i = 0; i<9; i++){
                frontEnd.buttons[i].setEnabled(false);
            }//for
        }//elseif3
        else if(frontEnd.lo[1] == frontEnd.lo[4] && frontEnd.lo[4]== frontEnd.lo[7]){
            JOptionPane.showMessageDialog(null, frontEnd.lo[4] +" is the winner");
            for(int i = 0; i<9; i++){
                frontEnd.buttons[i].setEnabled(false);
            }//for
        }//elseif4
        else if(frontEnd.lo[2] == frontEnd.lo[5] && frontEnd.lo[5]== frontEnd.lo[8]){
            JOptionPane.showMessageDialog(null, frontEnd.lo[5] +" is the winner");
            for(int i = 0; i<9; i++){
                frontEnd.buttons[i].setEnabled(false);
            }//for
        }//elseif5
        else if(frontEnd.lo[0] == frontEnd.lo[4] && frontEnd.lo[4] == frontEnd.lo[8]){
            JOptionPane.showMessageDialog(null, frontEnd.lo[4] +" is the winner");
            for(int i = 0; i<9; i++){
                frontEnd.buttons[i].setEnabled(false);
            }//for
        }//elseif6
        else if(frontEnd.lo[2] == frontEnd.lo[4] && frontEnd.lo[4] == frontEnd.lo[6]){
            JOptionPane.showMessageDialog(null, frontEnd.lo[4] +" is the winner");
            for(int i = 0; i<9; i++){
                frontEnd.buttons[i].setEnabled(false);
            }//for
        }//elseif6
    }//Logic

    //easy 'vs computer'
    static void compWrL(){
        if(po[0] == po[1] && po[1] == po[2]){
            JOptionPane.showMessageDialog(null, po[1] +" is the winner");
            for(int i = 0; i<9; i++){
                bottons[i].setEnabled(false);
            }//for
        }//if
        else if(po[3] == po[4] && po[4] == po[5]){
            JOptionPane.showMessageDialog(null, po[4] +" is the winner");
            for(int i = 0; i<9; i++){
                bottons[i].setEnabled(false);
            }//for
        }//elseif1
        else if(po[6] == po[7] && po[7] == po[8]){
            JOptionPane.showMessageDialog(null, po[7] +" is the winner");
            for(int i = 0; i<9; i++){
                bottons[i].setEnabled(false);
            }//for
        }//elseif2
        else if(po[0] == po[3] && po[3]== po[6]){
            JOptionPane.showMessageDialog(null, po[3] +" is the winner");
            for(int i = 0; i<9; i++){
                bottons[i].setEnabled(false);
            }//for
        }//elseif3
        else if(po[1] == po[4] && po[4]== po[7]){
            JOptionPane.showMessageDialog(null, po[4] +" is the winner");
            for(int i = 0; i<9; i++){
                bottons[i].setEnabled(false);
            }//for
        }//elseif4
        else if(po[2] == po[5] && po[5]== po[8]){
            JOptionPane.showMessageDialog(null, po[5] +" is the winner");
            for(int i = 0; i<9; i++){
                bottons[i].setEnabled(false);
            }//for
        }//elseif5
        else if(po[0] == po[4] && po[4] == po[8]){
            JOptionPane.showMessageDialog(null, po[4] +" is the winner");
            for(int i = 0; i<9; i++){
                bottons[i].setEnabled(false);
            }//for
        }//elseif6
        else if(po[2] == po[4] && po[4] == po[6]){
            JOptionPane.showMessageDialog(null, po[4] +" is the winner");
            for(int i = 0; i<9; i++){
                bottons[i].setEnabled(false);
            }//for
        }//elseif6
        else{
            throw new RuntimeException("OKKK NEXTTT");
        }//else
    }//compWrL

    //hard 'vs computer'
    static void compHlWrL(){
        if(no[0] == no[1] && no[1] == no[2]){
            JOptionPane.showMessageDialog(null, no[1] +" is the winner");
            for(int i = 0; i<9; i++){
                battons[i].setEnabled(false);
            }//for
        }//if
        else if(no[3] == no[4] && no[4] == no[5]){
            JOptionPane.showMessageDialog(null, no[4] +" is the winner");
            for(int i = 0; i<9; i++){
                battons[i].setEnabled(false);
            }//for
        }//elseif1
        else if(no[6] == no[7] && no[7] == no[8]){
            JOptionPane.showMessageDialog(null, no[7] +" is the winner");
            for(int i = 0; i<9; i++){
                battons[i].setEnabled(false);
            }//for
        }//elseif2
        else if(no[0] == no[3] && no[3]== no[6]){
            JOptionPane.showMessageDialog(null, no[3] +" is the winner");
            for(int i = 0; i<9; i++){
                battons[i].setEnabled(false);
            }//for
        }//elseif3
        else if(no[1] == no[4] && no[4]== no[7]){
            JOptionPane.showMessageDialog(null, no[4] +" is the winner");
            for(int i = 0; i<9; i++){
                battons[i].setEnabled(false);
            }//for
        }//elseif4
        else if(no[2] == no[5] && no[5]== no[8]){
            JOptionPane.showMessageDialog(null, no[5] +" is the winner");
            for(int i = 0; i<9; i++){
                battons[i].setEnabled(false);
            }//for
        }//elseif5
        else if(no[0] == no[4] && no[4] == no[8]){
            JOptionPane.showMessageDialog(null, no[4] +" is the winner");
            for(int i = 0; i<9; i++){
                battons[i].setEnabled(false);
            }//for
        }//elseif6
        else if(no[2] == no[4] && no[4] == no[6]){
            JOptionPane.showMessageDialog(null, no[4] +" is the winner");
            for(int i = 0; i<9; i++){
                battons[i].setEnabled(false);
            }//for
        }//elseif6
        else{
            throw new RuntimeException("OKKK NEXTTT");
        }//else
    }//compHlWrL
}//class
