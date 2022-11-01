package com.example.fx_crossknots;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import java.util.Arrays;


public class Controller {
    String toPut = "O";
    String[] arr = {"a", "b", "c", "d", "e", "f", "g", "h", "i"};
    boolean hasWon = false;


    @FXML
    void clickBtns(ActionEvent event) {

        //trick!
        if(hasWon) { return; }

        Button temp = (Button) event.getSource();
        int id = Integer.parseInt(temp.getId());
        check();
        temp.setText(toPut);
        arr[id] = toPut;
        System.out.println(Arrays.toString(arr));
        check4Vic();
    }


    public void check() {
        if(toPut.equals("O")){
            toPut = "X";
        } else {
            toPut = "O";
        }
    }

    public void check4Vic() {
        if(arr[0].equals(arr[1]) && arr[1].equals(arr[2])) {
            hasWon = true;
            System.out.println("Win... 0-1-1-2 You WON!");
        }
        else if(arr[3].equals(arr[4]) && arr[4].equals(arr[5])) {
            hasWon = true;
            System.out.println("Win... 3-4-4-5 You WON!");
        }
        else if(arr[6].equals(arr[7]) && arr[7].equals(arr[8])) {
            hasWon = true;
            System.out.println("Win... 6-7-7-8 You WON!");
        }

        else if(arr[0].equals(arr[4]) && arr[4].equals(arr[8])) {
            hasWon = true;
            System.out.println("Win... 0-4-4-8 You WON!");
        }
        else if(arr[2].equals(arr[4]) && arr[4].equals(arr[6])) {
            hasWon = true;
            System.out.println("Win... 2-4-4-6 You WON!");
        }

    }

} //END