import java.util.ArrayList;

public class Cliente {
    private String nome;
    private int idade;
    private String numero;
    private String endereco;
    private ArrayList<Fichas> fichas = new ArrayList<Fichas>();
    
    public void setaTudo(String nome, int idade, String numero, String endereco){
        this.nome = nome;
        this.idade = idade;
        this.numero = numero;
        this.endereco = endereco;
    }
    
    public void adicionarFicha(Fichas ficha) {
        this.fichas.add(ficha);
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getNumero() {
        return numero;
    }

    public String getEndereco() {
        return endereco;
    }

    public ArrayList<Fichas> getFichas() {
        return fichas;
    }
    
    
    @Override
    public String toString() {
        StringBuilder aux = new StringBuilder();;
        for(Fichas f :fichas){
            aux.append(f.toString());
        }
        return  "Nome: " + nome + "\nIdade: " + idade + "\nNumero: " + numero + "\nEndereco: " + endereco + "\nFichas" + aux.toString() + "\n";
    }
    
}

