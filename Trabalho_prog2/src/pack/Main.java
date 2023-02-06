
package pack;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;


public class Main {
    private static final ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    private static JFrame mainFrame = new JFrame("Selecione uma Opção");


    public static void main(String[] args) {
        JButton btnCadastrarCliente =  new JButton("Cadastrar Cliente");
        JButton btnCadastrarFicha =  new JButton("Cadastrar Ficha");
        JButton btnBuscarCliente =  new JButton("Buscar Cliente");
        JButton sair =  new JButton("sair");
        mainFrame.setLayout(new GridLayout(4,2));
        mainFrame.setSize(500, 500);

        btnCadastrarCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastrarCliente();
            }

            private void cadastrarCliente() {
                JFrame frameCadastrarCliente = new JFrame("Cadastrar Cliente");
                frameCadastrarCliente.setLayout(new GridLayout(4,2));
                frameCadastrarCliente.setSize(500, 500);

                JLabel nomeLabel = new JLabel("Nome: ");
                JTextField nomeField = new JTextField();
                JLabel idadeLabel = new JLabel("Idade: ");
                JTextField idadeField = new JTextField();
                JLabel cpfLabel = new JLabel("CPF: ");
                JTextField cpfField = new JTextField();
                JLabel enderecoLabel = new JLabel("Endereço:");
                JTextField enderecoField = new JTextField();
                JButton btnOk = new JButton("OK");
                btnOk.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        String nome = nomeField.getText();
                        int idade = Integer.parseInt(idadeField.getText());
                        String cpf = cpfField.getText();
                        String endereco = enderecoField.getText();

                        Cliente cliente = new Cliente(nome,idade,cpf,endereco);
                        clientes.add(cliente);

                        JOptionPane.showMessageDialog(frameCadastrarCliente, "Cliente cadastrado com sucesso!");
                        frameCadastrarCliente.dispose();
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
                frameCadastrarCliente.add(btnOk);
                frameCadastrarCliente.pack();
                frameCadastrarCliente.setVisible(true);
            }

        });
        btnCadastrarFicha.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastrarFicha();
            }

            private void cadastrarFicha(){
                JFrame frameCadastrarFichas = new JFrame("Cadastrar Ficha");
                frameCadastrarFichas.setLayout(new GridLayout(4,2));
                frameCadastrarFichas.setSize(500, 500);

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

                        if(clienteIndex != -1){
                            clientes.get(clienteIndex).getFichas().add(ficha);
                            JOptionPane.showMessageDialog(frameCadastrarFichas, "Fichas cadastrado com sucesso!");
                        }else{
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
                frameCadastrarFichas.pack();
                frameCadastrarFichas.setVisible(true);
            }
        });
        btnBuscarCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buscarCliente();
            }
            private void buscarCliente() {
                JFrame buscarClienteFrame = new JFrame("Buscar Cliente");
                buscarClienteFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                buscarClienteFrame.setLayout(new FlowLayout());
                buscarClienteFrame.setSize(500, 500);
                buscarClienteFrame.setLocationRelativeTo(null);

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
                buscarClienteFrame.pack();
                buscarClienteFrame.setVisible(true);
            }

        });

        sair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainFrame.dispose();
            }
        });
        mainFrame.add(btnCadastrarCliente);
        mainFrame.add(btnCadastrarFicha);
        mainFrame.add(btnBuscarCliente);
        mainFrame.add(sair);
        mainFrame.pack();
        mainFrame.setVisible(true);
    }
}
