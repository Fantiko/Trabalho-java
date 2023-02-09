
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import javax.swing.*;


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
        addFicha.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frameCadastrarFichas = new JFrame("Cadastrar Ficha");
                frameCadastrarFichas.setLayout(new GridLayout(3, 2));
                frameCadastrarFichas.setSize(400, 400);
                frameCadastrarFichas.setLocation(700, 400);

                JLabel nomeFichaLabel = new JLabel("Nome da Ficha: ");
                JTextField nomeFichaField = new JTextField();
                JLabel exerciciosLabel = new JLabel("Exercicios (separados por vírgula: ");
                JTextField exerciciosField = new JTextField();
                JButton btnInserir = new JButton("OK");
                btnInserir.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String nome = nomeFichaField.getText();
                        ArrayList<String> exercicios = new ArrayList<String>(Arrays.asList(exerciciosField.getText().split(",")));
                        Fichas ficha = new Fichas(nome, exercicios);

                        cliente.getFichas().add(ficha);
                        frameCadastrarFichas.dispose();
                    }
                });
                frameCadastrarFichas.add(nomeFichaLabel);
                frameCadastrarFichas.add(nomeFichaField);
                frameCadastrarFichas.add(exerciciosLabel);
                frameCadastrarFichas.add(exerciciosField);
                frameCadastrarFichas.add(btnInserir);
                frameCadastrarFichas.setVisible(true);
            }
        });
        frameCadastrarCliente.add(nomeLabel);
        frameCadastrarCliente.add(nomeField);
        frameCadastrarCliente.add(idadeLabel);
        frameCadastrarCliente.add(idadeField);
        frameCadastrarCliente.add(cpfLabel);
        frameCadastrarCliente.add(cpfField);
        frameCadastrarCliente.add(enderecoLabel);
        frameCadastrarCliente.add(enderecoField);
        frameCadastrarCliente.add(addFicha);
        frameCadastrarCliente.add(btnOk);
        frameCadastrarCliente.setVisible(true);
    }
}
