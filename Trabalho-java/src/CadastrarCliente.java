
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author jvmfs
 */
public class CadastrarCliente {

    public void cadastrarCliente(ArrayList<Cliente> clientes) {
        JFrame frameCadastrarCliente = new JFrame("Cadastrar Cliente");
        frameCadastrarCliente.setLayout(new GridLayout(5, 2));
        frameCadastrarCliente.setSize(400, 400);
        frameCadastrarCliente.setLocation(700, 400);

        JLabel nomeLabel = new JLabel("Nome: ");
        JTextField nomeField = new JTextField();
        JLabel idadeLabel = new JLabel("Idade: ");
        JTextField idadeField = new JTextField();
        JLabel cpfLabel = new JLabel("CPF: ");
        JTextField cpfField = new JTextField();
        JLabel enderecoLabel = new JLabel("Endereço:");
        JTextField enderecoField = new JTextField();
        JButton addFicha = new JButton("Inserir Ficha");
        JButton btnOk = new JButton("OK");

        Cliente cliente = new Cliente();

        btnOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = nomeField.getText();
                int idade = Integer.parseInt(idadeField.getText());
                String cpf = cpfField.getText();
                String endereco = enderecoField.getText();
                cliente.setaTudo(nome, idade, cpf, endereco);
                for (int i = 0; i < clientes.size(); i++) {
                    if (clientes.get(i).getNome().compareTo(cliente.getNome()) >= 0) {
                        clientes.add(i, cliente);
                        break;
                    }
                }
                if (!clientes.contains(cliente)) {
                    clientes.add(cliente);
                }

                JOptionPane.showMessageDialog(frameCadastrarCliente, "Cliente cadastrado com sucesso!");
                frameCadastrarCliente.dispose();
            }
        });
    }
}
