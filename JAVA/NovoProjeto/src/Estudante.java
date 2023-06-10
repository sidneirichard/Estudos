import java.util.ArrayList;
import java.util.Comparator;

public class Alunos {
    public String id;
    public String nome;
    public double gpa;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double media) {
        if (gpa >= 0 && gpa <= 4) {
            this.gpa = gpa;
        }else{
            this.gpa = 0;
        }
    }
    public Estudande(String nome, String id, double gpa){
        
    }
}
