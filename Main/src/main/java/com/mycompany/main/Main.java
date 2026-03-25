package com.mycompany.main;

import Labels.Label_Inicio.Inicio;

public class Main {

    public static void main(String[] args) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
      

    }
}
