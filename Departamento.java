import java.util.ArrayList;

public class Departamento {
    private String nomeDoDepartamento;

    private ArrayList<Produto> produtos;    

    public Departamento(String nomeDoDepartamento, ArrayList<Produto> produtos) {
        this.nomeDoDepartamento = nomeDoDepartamento;
        this.produtos = produtos;
    }

    public String getnomeDoDepartamento() {
        return this.nomeDoDepartamento;
    }

    public void setGepartamentoDoProduto(String nomeDoDepartamento) {
        this.nomeDoDepartamento = nomeDoDepartamento;
    }

    public ArrayList<Produto> getProdutos() {
        return this.produtos;
    }

    public void addProduto(Produto produto) {
        this.produtos.add(produto);
    }
}
