package pacotetarefas;

public class Tarefas {
    private int id;
    private String descricao;

    public Tarefas(int id, String descricaoTarefa) {
        this.id = id;
        this.descricao = descricaoTarefa;
    }
    public String toString() {
        return "ID: " + id + ", Descrição: " + descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getDescricaoTarefa() {
        return descricao;
    }

    public void setDescricaoTarefa(String descricaoTarefa) {
        this.descricao = descricaoTarefa;
    }

    public void add(Tarefas tarefas) {
    }
}
