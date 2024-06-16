import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> carrinhoDeCompras;

    public CarrinhoDeCompras(){
        this.carrinhoDeCompras = new ArrayList<>();
    }
    public void adicionarItem(String nome, double preco, int quantidade){
        carrinhoDeCompras.add(new Item(nome,preco,quantidade));
    }
    public void removerItem(String nome){
        List<Item> itemParaRemover = new ArrayList<>();
        if(!carrinhoDeCompras.isEmpty()){
            for(Item item : carrinhoDeCompras){
                if(item.getNome().equalsIgnoreCase(nome)){
                    itemParaRemover.add(item);
                }
        }carrinhoDeCompras.removeAll(itemParaRemover);
            }
        else {
            System.out.println("A lista está vazia!");
        }

    }
    public double CalcularValorTotal(){
        double total = 0;
        if(!carrinhoDeCompras.isEmpty()) {
            for (Item valor : carrinhoDeCompras) {
                total += valor.getPreco() * valor.getQuantidade();
            }
            return total;
        }
        else{
            throw new RuntimeException("A lista está vazia.");
        }
    }
    public void exibirItens(){
        if (!carrinhoDeCompras.isEmpty()){
            System.out.println(carrinhoDeCompras);
        }
        else {
            System.out.println("A lista está vazia.");
        }

    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras1 = new CarrinhoDeCompras();
        carrinhoDeCompras1.adicionarItem("Computador",3550.0,1);
        carrinhoDeCompras1.adicionarItem("Garrafa de água",150,1);
        carrinhoDeCompras1.adicionarItem("Canecas",20,50);
        carrinhoDeCompras1.removerItem("Garrafa de água");
        carrinhoDeCompras1.exibirItens();
        System.out.println(carrinhoDeCompras1.CalcularValorTotal());

    }
}
