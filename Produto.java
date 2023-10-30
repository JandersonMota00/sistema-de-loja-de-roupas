import java.util.ArrayList;

public class Produto {
    private String tipoDeProduto;
    private String marca;
    private String cor;
    private String codigo;
    private double preco;

    private ArrayList<Departamento> departamentos;
    
    public Produto(String tipoDeProduto, String marca, String cor, String codigo) {
        this.tipoDeProduto = tipoDeProduto;
        this.marca = marca;
        this.cor = cor;
        this.codigo = codigo;
    }
    
    public String getTipoDeProduto() {
        return tipoDeProduto;
    }
    public void setTipoDeProduto(String tipoDeProduto) {
        this.tipoDeProduto = tipoDeProduto;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }
    public ArrayList<Departamento> getDepartamentos() {
        return this.departamentos;
    }
    public void setDepartamentos(ArrayList<Departamento> departamentos) {
        this.departamentos = departamentos;
    }

    public void addDepartamentos(Departamento departamento) {
        if(!departamentos.contains(departamento)) {
            departamentos.add(departamento);
            departamentos.addProduto(this);
        }
    }

    @Override
    public boolean equals(object o) {
        Produto p = (Produto) o;
        return this.tipoDeProduto == p.tipoDeProduto;
    }

    public void removeDepartamentos(Departamento departamentos) {}
}
