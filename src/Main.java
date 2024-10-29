import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("0.00");
        Scanner sc = new Scanner(System.in);
        CarteiraDigital carteira = new CarteiraDigital();


        int escolha =0;
        String resposta = "";
        double valor = 0.0;

        resposta = df.format(valor);

        System.out.println("Bem-vindo à sua Carteira Digital!");

        do {

            carteira.menu();
            escolha = sc.nextInt();

                if (escolha == 1){
                    System.out.print("Digite o valor para adicionar ao saldo: ");
                    valor = sc.nextDouble();
                    resposta = carteira.adicionarSaldo(valor);
                    System.out.println(resposta);
                }else if (escolha == 2){
                    System.out.print("Digite o valor do pagamento: ");
                    valor = sc.nextDouble();
                    resposta = carteira.realizarPagamento(valor);
                    System.out.println(resposta);
                } else if (escolha == 3) {
                    carteira.verificarSaldo();
                } else if (escolha == 4) {
                    carteira.exibirHistorico();
                } else{
                    System.out.println("\nInforme um valor valido!\n");
                }

        }while (escolha != 5);

        System.out.println("Obrigado por usar a sua Carteira Digital!");

    }
}