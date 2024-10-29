import java.text.DecimalFormat;
import java.util.List;
import java.util.ArrayList;

public class CarteiraDigital {

    static DecimalFormat df = new DecimalFormat("0.00");
    static double saldo = 0.0;
    static double saldoAnterior = 0.0;
    public static List<Historico>historicoDeTransacoes =  new ArrayList<>();

    public void menu(){

        System.out.println("\nEscolha uma opção:\n" +
                "1 - Adicionar Saldo\n" +
                "2 - Realizar Pagamento\n" +
                "3 - Verificar Saldo\n" +
                "4 - Exibir Historico\n" +
                "5 - Sair");


    } public static String adicionarSaldo(double valorAdicionado) {

        saldoAnterior = saldo;
        saldo = saldo + valorAdicionado;
        historicoDeTransacoes.add(new Historico(saldoAnterior,"Adicionado o valor de ",valorAdicionado, saldo) );

        return "Saldo adicionado com sucesso!";

    } public static String realizarPagamento(double valorSubtraido) {

        saldoAnterior = saldo;
        saldo = saldo - valorSubtraido;

        if (saldo <= 0) {
            saldo = saldo + valorSubtraido;
            return "Erro saldo insuficiente para operação";
        } else {
            historicoDeTransacoes.add(new Historico(saldoAnterior,"Subtraido o valor de : ",valorSubtraido, saldo) );
            return "Pagamento realizado com sucesso!";
        }

    }public void verificarSaldo() {

        String saldoConvertido = "";
        saldoConvertido = df.format(saldo);
        System.out.println("Seu saldo atual é: " + saldoConvertido);

    } public void exibirHistorico() {
        System.out.println("\nHistórico de Transações:\n");
        for (Historico transacao : historicoDeTransacoes) {
            System.out.println(transacao);
        }
    }
}
