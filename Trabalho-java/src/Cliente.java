import java.util.ArrayList;

public class Cliente {
    private String nome;
    private int idade;
    private String CPF;
    private String endereco;
    private ArrayList<Fichas> fichas = new ArrayList<Fichas>();
    
    public void setaTudo(String nome, int idade, String CPF, String endereco){
        this.nome = nome;
        this.idade = idade;
        this.CPF = CPF;
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

    public String getCPF() {
        return CPF;
    }

    public String getEndereco() {
        return endereco;
    }

    public ArrayList<Fichas> getFichas() {
        return fichas;
    }
    
    
    @Override
    public String toString() {
        return  "Nome:" + nome + "\n Idade:" + idade + "\n CPF:" + CPF + "\n Endereco:" + endereco + "\n Fichas:\n" + fichas + "\n";
    }
    
}

