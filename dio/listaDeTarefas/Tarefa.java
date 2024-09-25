public class Tarefa {
    //atributo descricao
    private String descricao;

    //Construtor
    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    //Getters
    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "Tarefa [descricao=" + descricao + "]";
    }
        
}
