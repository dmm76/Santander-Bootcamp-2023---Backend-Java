import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> comprasLista;

    public CarrinhoDeCompras() {
        this.comprasLista = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        comprasLista.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> ItensParaRemover = new ArrayList<>();
        for(Item I : comprasLista){
            if(I.getNome().equalsIgnoreCase(nome)){
                ItensParaRemover.add(I);
            }
        }
        comprasLista.removeAll(ItensParaRemover);
    }
    
    public void calcularValorTotal(){
        double valortotalitem = 0.00;
        double valortotalcarrinho = 0.00;

        for(Item I : comprasLista){
            valortotalitem = I.getPreco() * I.getQuantidade();
            valortotalcarrinho += valortotalitem;
        }
        System.out.println("Valor Total da Compra: "+valortotalcarrinho);;
    }
    

    public void exibirItens(){
        System.out.println(comprasLista);
    }
    
        public static void main(String[] args){
    
            CarrinhoDeCompras carrinhodecompras = new CarrinhoDeCompras();
            
            carrinhodecompras.adicionarItem("Sorvete Kbom", 10.00, 3);
            carrinhodecompras.adicionarItem("Sorvete ChicaBom", 10.00, 5);
            
            carrinhodecompras.exibirItens();
    
            //carrinhodecompras.removerItem("Sorvete ChicaBom");
            //carrinhodecompras.exibirItens();

            carrinhodecompras.calcularValorTotal();
        }
    
}
