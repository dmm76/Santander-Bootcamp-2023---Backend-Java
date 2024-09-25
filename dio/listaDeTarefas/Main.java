public class Main {
    public static void main(String[] args){
        ListaTarefa listatarefa = new ListaTarefa();

        System.out.println("O nº total de tarefas é: " +listatarefa.obterNumeroTotalTarefas()); 

        listatarefa.adicionarTarefa("Tarefa 1");
        listatarefa.adicionarTarefa("Tarefa 1");
        listatarefa.adicionarTarefa("Tarefa 1");
        listatarefa.adicionarTarefa("Tarefa 2");
        listatarefa.adicionarTarefa("Tarefa 3");
        listatarefa.adicionarTarefa("Tarefa 4");
        System.out.println("O nº total de tarefas é: " +listatarefa.obterNumeroTotalTarefas()); 

    }
}
