package com.pixelpoesie.left_right.app;

/**
 * Created by christophwolff on 25.04.14.
 */
public class LFmodule {

    public String result;

    public String setValue(int value) {

        // -------------------------------------------------------- left
        if (value < 0.5) {

            if (value < 0.1) {
                result = "Left";
            } else if (value < 0.2) {
                result = "Lef";
            } else if (value < 0.3) {
                result = "Le";
            } else if (value < 0.4) {
                result = "L";
            } else {
                result = "L";
            }

        } else { // ---------------------------------------------- right

            if (value < 0.6) {
                result = "";
            } else if (value < 0.7) {
                result = "R";
            } else if (value < 0.8) {
                result = "Ri";
            } else if (value < 0.9) {
                result = "Rig";
            } else {
                result = "Right";
            }
        }
    return result;
    }

}
