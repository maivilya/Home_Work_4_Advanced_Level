package com.example.java_fx_app_home_work;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            new Chat();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
