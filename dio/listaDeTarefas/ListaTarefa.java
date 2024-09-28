import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    
    //Atributo Lista
    private List<Tarefa> tarefaLista;

    //Construtor
    public ListaTarefa() {
        this.tarefaLista = new ArrayList<>();
    }

    //Adicionar Tarefas
    public void adicionarTarefa(String descricao){
        tarefaLista.add(new Tarefa(descricao));
    }

    //Remover Tarefas
    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
            for(Tarefa t : tarefaLista){
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    tarefasParaRemover.add(t);
                }
            }
        tarefaLista.removeAll(tarefasParaRemover);        
    }

    //Obter Total de Tarefas
    public int obterNumeroTotalTarefas(){
        return tarefaLista.size();
    }
    
    //Obter Descricoes das Tarefa
    public void obterDescricoesTarefas(){
        System.out.println(tarefaLista);
    }
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

        listatarefa.obterDescricoesTarefas();
    }

}
