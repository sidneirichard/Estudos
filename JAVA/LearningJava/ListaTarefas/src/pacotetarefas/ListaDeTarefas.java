package pacotetarefas;

import java.util.*;

public class ListaDeTarefas {
    private List<Tarefas> tarefas;

    public ListaDeTarefas() {
        tarefas = new ArrayList<>();
    }

    public void adicionarTarefa(Tarefas tarefa) {
        tarefas.add(tarefa);
    }

    public void removerTarefas(int id) {
        tarefas.removeIf(tarefas -> tarefas.getId() == id);
    }

    public void exibirTarefas() {
        for(Tarefas tarefa : tarefas) {
            System.out.println(tarefa.getId() + ": " + tarefa.getDescricaoTarefa());
        }
    }
}
