package com.oocode;

import java.util.List;

@SuppressWarnings({"unused"})
public class PostRoom {
    public void postLetters(List<HeadedLetter> letters) {
        for (HeadedLetter letter : letters) {
            if (letter.isImportant()) {
                letter.sendByCourier();
            } else {
                letter.sendByStandardMail();
            }
        }
    }
}
