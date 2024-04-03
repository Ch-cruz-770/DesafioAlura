import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        String nome = "Robert Downey Jr";
        String tipoDaConta = "Corrente";
        double saldo = 8000.00;
        int opcao = 0;

        System.out.println("********************************************");
        System.out.println("\nNome do Cliente: " + nome);
        System.out.println("Tipo da Conta: " + tipoDaConta);
        System.out.println("Saldo da Conta: " + saldo);
        System.out.println("\n*****************************************");

        String menu = """
                \n******* MENU DE OPÇÕES *******
                1 - Consultar saldo
                2 - Saque
                3 - Deposito            
                4 - Sair
                
                """;

        Scanner scanner = new Scanner(System.in);

        while (opcao != 4){
            System.out.println(menu);
            System.out.println("Escolha uma opção: ");
            opcao = scanner.nextInt();
            
            if (opcao == 1){
                System.out.println("\nSaldo da Conta:R$" + saldo);

            } else if (opcao == 2) {
                System.out.println("Digite o valor do Saque: ");
                double valor = scanner.nextDouble();
                if (valor > saldo){
                    System.out.println("**Saldo Insuficiente!**");
                } else {
                    saldo -= valor;
                    System.out.println("Saque realizado com sucesso!");
                    System.out.println("\nSaldo Atual: " + saldo);
                }
            } else if (opcao == 3) {
                System.out.println("Valor depositado: ");
                double valor = scanner.nextDouble();
                saldo += valor;
                System.out.println("\nSaldo atual: " + saldo);
            } else if (opcao != 4) {
                System.out.println("Opção Inválida");

            }
        }




    }
}
