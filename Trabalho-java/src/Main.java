import java.util.ArrayList;

//João Victor Mascarenhas De Faria Santos
//Kaio Stefan Campos Nunes

public class Main {
    private static final ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    
    public static void main(String[] args) {
       MainFrame academia = new MainFrame();
       academia.exec(clientes);
    }
}
