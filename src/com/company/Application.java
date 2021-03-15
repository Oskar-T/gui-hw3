package com.company;

public class Application {
    public Application() {
        gui = new GUI(this);
        textLength = 0;
    }

    public int textLength;

    private GUI gui;
}
