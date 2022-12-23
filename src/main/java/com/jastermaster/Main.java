package com.jastermaster;

import javafx.application.Application;

import java.net.URL;

public class Main {
    public static void main(String[] args) {
        Application.launch(Program.class, args);
    }

    public static URL getResource(String name) {
        return Main.class.getResource(name);
    }
}