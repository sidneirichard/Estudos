package pacotetarefas;

import java.util.Scanner;

public class TarefasTest {
    public static void main(String[] args) {
        ListaDeTarefas listaDeTarefas = new ListaDeTarefas();
        Scanner scanner = new Scanner(System.in);

        int opcao = 0;
        while (opcao != 4) {
            System.out.println("===== Aplicativo de Lista de Tarefas =====");
            System.out.println("1. Adicionar tarefa");
            System.out.println("2. Remover tarefa");
            System.out.println("3. Exibir tarefas");
            System.out.println("4. Sair");
            System.out.println("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o ID da tarefa: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    String descricaoTarefa = scanner.nextLine();
                    Tarefas tarefas = new Tarefas(id, descricaoTarefa);
                    listaDeTarefas.adicionarTarefa(tarefas);
                    System.out.println("Tarefa adicionada com sucesso!");
                    break;

                case 2:
                    System.out.println("Digite o ID da tarefa a ser removida: ");
                    int idRemover = scanner.nextInt();
                    listaDeTarefas.removerTarefas(idRemover);
                    System.out.println("Tarefa removida com sucesso!");
                    break;

                case 3:
                    listaDeTarefas.exibirTarefas();
                    break;

                case 4:
                    System.out.println("Encerrando o aplicativo...");
                    break;

                default:
                    System.out.printf("Opção inválida! Tente novamente.");
            }
            System.out.println();
        }
        scanner.close();
    }
}
