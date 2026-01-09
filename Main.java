import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        String jairHenrique = "Jair Henrique";
        System.out.println(jairHenrique);
        String tipoConta = "corrente";
        int opcao;

        double saldoInicial = 2500.00;
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();
        System.out.println("~~~~Dados do cliente~~~");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println();

        System.out.println("nome: " + jairHenrique);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.printf("Saldo inicial: %.2f\n",saldoInicial);
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        do {
            System.out.println("1- Consultar saldos");
            System.out.println("2- Receber valor");
            System.out.println("3- Transferecia de valor");
            System.out.println("4- sair");
            opcao = scanner.nextInt();

            switch(opcao){
                
                case 1:
                    System.out.printf("O saldo atual é: %.2f\n ", saldoInicial);
                    System.out.println();
                    System.out.println("Pressione enter para continuar");
                    scanner.nextLine();
                    break;

                case 2:
                    System.out.println("Quanto voce deseja depositar?");
                    double deposito = scanner.nextDouble();
                    saldoInicial = saldoInicial + deposito;
                    System.out.println("Saldo depositado!");
                    System.out.printf("saldo atualizado: %.2f\n", saldoInicial);
                    System.out.println();
                    System.out.println("Pressione enter para continuar");
                    scanner.nextLine();
                    break;

                case 3:
                    System.out.println("Qual valor você deseja transferir?");
                    double transferir = scanner.nextDouble();
                    if (saldoInicial < transferir){
                        System.out.println("Saldo insuiciente!");
                    }else {
                        saldoInicial = saldoInicial - transferir;
                        System.out.println("Saldo tranferido!");
                        System.out.printf("Saldo atualizado: %.2f",saldoInicial);
                    }
                    System.out.println();
                    System.out.println("Pressione enter para continuar");
                    scanner.nextLine();
                    break;
                case 4:
                    System.out.println("encerrando programa...");
                    break;
                default:
                    System.out.println("opção invalida!");

            }
        }while (opcao != 4);
        System.out.println("Encerrado");



    }
}
