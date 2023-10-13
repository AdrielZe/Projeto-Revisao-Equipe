import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TransportSystem transportSystem = new TransportSystem(); // Classe que gerencia o sistema de transporte
        ProductList productList = new ProductList(); // Classe que mantém a lista de produtos

        while (true) {
            System.out.println("Bem-vindo à Amarelinha - Sistema de Transporte");
            System.out.println("1. Consultar Trechos e Modalidades");
            System.out.println("2. Cadastrar transporte");
            System.out.println("3. Dados estatísticos");
            System.out.println("4. Finalizar o programa");
            System.out.print("Escolha a opção (1/2/3/4): ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Opção de Consultar Trechos e Modalidades
                    transportSystem.consultarTrechosEModalidades(); // Implemente este método na classe TransportSystem
                    break;
                case 2:
                    // Opção de Cadastrar transporte
                    productList.listarProdutos(); // Implemente este método na classe ProductList
                    productList.selecionarProdutos(); // Implemente este método na classe ProductList
                    transportSystem.cadastrarTransporte(productList); // Implemente este método na classe TransportSystem
                    break;
                case 3:
                    // Opção de Dados estatísticos
                    transportSystem.exibirDadosEstatisticos(); // Implemente este método na classe TransportSystem
                    break;
                case 4:
                    // Opção de Finalizar o programa
                    System.out.println("O programa foi encerrado. Obrigado por usar a Amarelinha!");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }
    }
}

class ProductList {
    private Map<String, Double> products;

    public ProductList() {
        products = new HashMap<>();
        // Inicialize a lista de produtos com os nomes e pesos
        products.put("Celular", 0.7);
        products.put("Geladeira", 50.0);
        products.put("Air Fryer", 3.5);
        products.put("Cadeira", 5.0);
        products.put("Luminária", 0.8);
        products.put("Lavadora de roupa", 15.0);
        products.put("PlayStation 5", 3.9);
        products.put("Nintendo Switch", 0.3);
    }

    public void listarProdutos() {
        System.out.println("Lista de Produtos Disponíveis:");
        for (String productName : products.keySet()) {
            System.out.println(productName + " - Peso: " + products.get(productName) + " kg");
        }
    }

    public void selecionarProdutos() {
        // Implemente a lógica para permitir ao usuário selecionar produtos e quantidades desejados
    }
}
