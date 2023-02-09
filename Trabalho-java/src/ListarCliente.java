
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author jvmfs
 */
public class ListarCliente {

    public void listar(JFrame mainFrame, ArrayList<Cliente> clientes) {
        String mensagem = null;
        for (Cliente c : clientes) {
            if (mensagem == null) {
                mensagem = "\n" + c.getNome();
            } else {
                mensagem = mensagem + "\n" + c.getNome();
            }
        }
        if (mensagem == null) {
            JOptionPane.showMessageDialog(mainFrame, "Não há clientes cadastrados!");
        } else {
            JOptionPane.showMessageDialog(mainFrame, mensagem);
        }
    }
}
