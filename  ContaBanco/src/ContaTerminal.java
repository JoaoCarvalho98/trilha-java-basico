import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe seu nome: ");
            String nomeCliente = scanner.next();
        System.out.print("Informe sua Agencia: ");
            String agencia = scanner.next();
        System.out.print("Informe a sua conta: ");
            int numeroConta = scanner.nextInt();
        System.out.print("Informe o valor a ser depositado: ");
            double saldoDeposito = scanner.nextDouble();            

        System.out.print("Olá Sr(a)" + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + ", conta: "+ numeroConta + " e seu saldo de " + saldoDeposito + " já está disponível para saque!");
    }
}
