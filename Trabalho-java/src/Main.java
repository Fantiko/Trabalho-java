/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author jvmfs
 */

import java.util.ArrayList;


public class Main {

    private static final ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    

    public static void main(String[] args) {
       MainFrame academia = new MainFrame();
       academia.exec(clientes);
    }
}
