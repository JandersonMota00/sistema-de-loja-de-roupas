import java.util.ArrayList;

public class Carrinho {
    private int quantidade;

    private ArrayList<Produto> produtos;

    public Carrinho(String produtos, int quantidade) {
        this.produtos = new ArrayList<>();
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public ArrayList<Produto> getProdutos() {
        return produtos;
    }
}
