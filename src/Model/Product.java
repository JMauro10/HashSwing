package Model;
import java.util.HashMap;

public class Product {
    private String nome;
    private double preco;

    public Product(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco > 0) {
            this.preco = preco;
        } else {
            System.out.println("O preço deve ser maior que 0.");
        }
    }

    @Override
    public String toString() {
        return "Produto: " + nome + ", Preço: R$ " + String.format("%.2f", preco);
    }

}
