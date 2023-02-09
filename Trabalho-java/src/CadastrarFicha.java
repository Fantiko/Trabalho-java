
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.*;

public class CadastrarFicha {

    public void cadastrarFicha(ArrayList<Cliente> clientes) {
        JFrame frameCadastrarFichas = new JFrame("Cadastrar Ficha");
        frameCadastrarFichas.setLayout(new GridLayout(4, 2));
        frameCadastrarFichas.setSize(400, 400);
        frameCadastrarFichas.setLocation(700, 400);

        JLabel clienteBuscaLabel = new JLabel("Nome do cliente: ");
        JTextField clienteBuscaField = new JTextField();
        JLabel nomeFichaLabel = new JLabel("Nome da Ficha: ");
        JTextField nomeFichaField = new JTextField();
        JLabel exerciciosLabel = new JLabel("Exercicios (separados por vírgula: ");
        JTextField exerciciosField = new JTextField();
        JButton btnOk = new JButton("OK");

        btnOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nome = nomeFichaField.getText();
                ArrayList<String> exercicios = new ArrayList<String>(Arrays.asList(exerciciosField.getText().split(",")));
                Fichas ficha = new Fichas(nome, exercicios);

                int clienteIndex = -1;
                String nomeCliente = clienteBuscaField.getText();
                for (int i = 0; i < clientes.size(); i++) {
                    if (clientes.get(i).getNome().equals(nomeCliente)) {
                        clienteIndex = i;
                        break;
                    }
                }

                if (clienteIndex != -1) {
                    clientes.get(clienteIndex).getFichas().add(ficha);
                    JOptionPane.showMessageDialog(frameCadastrarFichas, "Fichas cadastrado com sucesso!");
                } else {
                    //erro
                    JOptionPane.showMessageDialog(frameCadastrarFichas, "Falha ao cadastrar a ficha, individuo nao encontrado!");
                }

                frameCadastrarFichas.dispose();
            }
        });
        frameCadastrarFichas.add(clienteBuscaLabel);
        frameCadastrarFichas.add(clienteBuscaField);
        frameCadastrarFichas.add(nomeFichaLabel);
        frameCadastrarFichas.add(nomeFichaField);
        frameCadastrarFichas.add(exerciciosLabel);
        frameCadastrarFichas.add(exerciciosField);
        frameCadastrarFichas.add(btnOk);
        frameCadastrarFichas.setVisible(true);
    }
}
