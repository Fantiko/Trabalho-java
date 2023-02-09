
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


/**
 *
 * @author jvmfs
 */
public class SalvarEmArquivo {
    ArrayList<Cliente> clientes;

    public SalvarEmArquivo(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
    
    public void salvar(){
        try (FileWriter writer = new FileWriter("clientes.txt")) {
            for (Cliente Client : clientes) {
                writer.write(Client.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
