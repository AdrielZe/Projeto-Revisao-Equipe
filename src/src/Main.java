import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TransportSystem transportSystem = new TransportSystem(); //Criar classe com esse nome para respresentar o sistema de transporte
        ListaDeProdutos productList = new ListaDeProdutos(); // Classe que mantém a lista de produtos

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
                    transportSystem.consultarTrechosEModalidades(); // Criar esse método na classe TransportSystem
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
