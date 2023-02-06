
package pack;

import javax.swing.JOptionPane;
import java.util.ArrayList;


public class Main {

    private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    private static void main(String[] args) {
        int escolha = 0;
        while (escolha != 4) {
            escolha = Integer.parseInt(JOptionPane.showInputDialog("Selecione Uma opção:\n 1 - Cadastrar Cliente\n2 - Cadastrar ficha\n3 - Buscar Cliente\n4 - Sair"));
            switch (escolha) {
                case 1:
                    cadastrarCliente();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Saindo do Programa");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalido");
                    break;
            }
        }
    }

    private static void cadastrarCliente() {
        String nome = JOptionPane.showInputDialog("Nome: ");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade: "));
        String CPF = JOptionPane.showInputDialog("CPF: ");
        String endereco = JOptionPane.showInputDialog("Endereço: ");

        Cliente cliente = new Cliente(nome, idade, CPF, endereco);
        clientes.add(cliente);

        JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
    }

}
