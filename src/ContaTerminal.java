import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    try (// conhecer e importar a classe scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US)) {
            // exibir as mensagens para o nosso usuário e obter pela scanner os valores digitados no terminal
                System.out.println("Digite seu nome");
                String nome = scanner.next();

                System.out.println("Digite seu sobrenome");
                String sobrenome = scanner.next();

                System.out.println("Digite o número da sua agência");
                String agencia = scanner.next();

                System.out.println("Digite o número da sua conta");
                int conta = scanner.nextInt();

                System.out.println("Digite seu saldo");
                double saldo = scanner.nextDouble();

            // exibir a mensagem ca conta criada
            System.out.println("Olá " + nome + sobrenome +" , obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + conta + " e seu saldo R$" + saldo + " já está disponível para saque.");
        }
    }
}
