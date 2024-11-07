package Controller;
import java.util.HashMap;

import Model.Product;

public class ProductController {
        HashMap<String, Product> produtos = new HashMap<>();

        //Cadastrar Produto
        public void cadastrarProduto(String name, Double preco) {
            Product p = new Product(name, preco);
            produtos.put(name, p);
           
        }

        public void deletarProduto(String nome) {
            if (produtos.remove(nome) != null) {
                System.out.println("Produto deletado com sucesso.");
            } else {
                System.out.println("Produto não encontrado.");
            }
        }

        public void alterarPrecoProduto(String nome, double novoPreco) {
            
            if (produtos.containsKey(nome)) {
                System.out.print("Digite o novo preço do produto: ");
    
                if (novoPreco > 0) {
                    produtos.get(nome).setPreco(novoPreco);
                    System.out.println("Preço alterado com sucesso.");
                } else {
                    System.out.println("Erro: o preço deve ser maior que 0.");
                }
            } else {
                System.out.println("Produto não encontrado.");
            }
        }

        public void listaItens(){

            for (Product product : produtos.values()) {

                
                
            }

        }

        public ProductController() {

        }

        public HashMap<String, Product> getProdutos() {
            return produtos;
        }

        public void setProdutos(HashMap<String, Product> produtos) {
            this.produtos = produtos;
        }

        

        
}
