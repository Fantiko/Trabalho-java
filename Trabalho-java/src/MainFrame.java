

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author jvmfs
 */
public class MainFrame {

    private static JFrame mainFrame = new JFrame("Academia");

    public void exec(ArrayList<Cliente> clientes) {
        JButton btnCadastrarCliente = new JButton("Cadastrar Cliente");
        JButton btnCadastrarFicha = new JButton("Cadastrar Ficha");
        JButton btnListar = new JButton("Listar Clientes");
        JButton btnBuscarCliente = new JButton("Buscar Cliente");
        JButton sair = new JButton("sair");
        mainFrame.setSize(400, 400);
        mainFrame.setLocation(700, 400);
        mainFrame.setLayout(new GridLayout(5, 1));

        btnCadastrarCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CadastrarCliente cadastro = new CadastrarCliente();
                cadastro.cadastrarCliente(clientes);
            }
        });
        btnCadastrarFicha.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CadastrarFicha cadastroF = new CadastrarFicha();
                cadastroF.cadastrarFicha(clientes);
            }
        });
        btnListar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ListarCliente lCliente = new ListarCliente();
                lCliente.listar(mainFrame, clientes);
            }
        });
        btnBuscarCliente.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BuscarCliente bCliente = new BuscarCliente();
                bCliente.buscarCliente(clientes);
            }
        });

        sair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainFrame.dispose();
                SalvarEmArquivo save = new SalvarEmArquivo(clientes);
                save.salvar();
            }
        });
        mainFrame.add(btnCadastrarCliente);
        mainFrame.add(btnCadastrarFicha);
        mainFrame.add(btnListar);
        mainFrame.add(btnBuscarCliente);
        mainFrame.add(sair);
        mainFrame.setVisible(true);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

}
