
import java.awt.FlowLayout;
import java.awt.event.*;
import java.util.ArrayList;
import javax.swing.*;

public class BuscarCliente {

    public void buscarCliente(ArrayList<Cliente> clientes) {
        JFrame buscarClienteFrame = new JFrame("Buscar Cliente");
        buscarClienteFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        buscarClienteFrame.setLayout(new FlowLayout());
        buscarClienteFrame.setSize(400, 400);
        buscarClienteFrame.setLocation(700, 400);

        JLabel nomeLabel = new JLabel("Nome do Cliente: ");
        JTextField nomeField = new JTextField(20);

        JButton okBtn = new JButton("OK");
        okBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = nomeField.getText();
                int clienteIndex = -1;
                for (int i = 0; i < clientes.size(); i++) {
                    if (clientes.get(i).getNome().equals(nome)) {
                        clienteIndex = i;
                        break;
                    }
                }
                if (clienteIndex == -1) {
                    JOptionPane.showMessageDialog(null, "Cliente não encontrado!");
                } else {
                    JOptionPane.showMessageDialog(null, clientes.get(clienteIndex).toString());
                }
                buscarClienteFrame.dispose();
            }
        });

        buscarClienteFrame.add(nomeLabel);
        buscarClienteFrame.add(nomeField);
        buscarClienteFrame.add(okBtn);
        buscarClienteFrame.setVisible(true);
    }
}
