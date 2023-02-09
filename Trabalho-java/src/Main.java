import java.util.ArrayList;


public class Main {
    private static final ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    
    public static void main(String[] args) {
       MainFrame academia = new MainFrame();
       academia.exec(clientes);
    }
}
