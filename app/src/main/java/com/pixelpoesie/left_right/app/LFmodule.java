package com.pixelpoesie.left_right.app;

/**
 * Created by christophwolff on 25.04.14.
 */
public class LFmodule {

    public String result;

    public String getResult(int value) {

        // -------------------------------------------------------- left
        if (value < 50) {

            if (value < 10) {
                result = "Left";
            } else if (value < 20) {
                result = "Lef";
            } else if (value < 30) {
                result = "Le";
            } else if (value < 40) {
                result = "L";
            } else {
                result = "L";
            }

        } else { // ---------------------------------------------- right

            if (value < 60) {
                result = "";
            } else if (value < 70) {
                result = "R";
            } else if (value < 80) {
                result = "Ri";
            } else if (value < 90) {
                result = "Rig";
            } else {
                result = "Right";
            }
        }
    return result;
    }

}
