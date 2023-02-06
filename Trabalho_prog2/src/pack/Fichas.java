
package pack;

import java.util.ArrayList;


public class Fichas {
    private String fichaNome;
    private ArrayList<String> exercicios;

    public Fichas(String fichaNome, ArrayList<String> exercicios) {
        this.fichaNome = fichaNome;
        this.exercicios = exercicios;
    }

    public String getNome() {
        return fichaNome;
    }

    public ArrayList<String> getExercicios() {
        return exercicios;
    }

}
