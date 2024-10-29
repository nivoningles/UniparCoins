public class Historico {

    private String tipo;
    private double valor;
    private double saldo;
    private double saldoFinal;

    public Historico(double saldo, String tipo, double valor, double saldoFinal) {
        this.saldo = saldo;
        this.tipo = tipo;
        this.valor = valor;
        this.saldoFinal = saldoFinal;
    }
    public String toString() {
        return "Seu saldo era R$ "+ saldo + "\n" + tipo + "R$ " + valor + "\nSeu saldo final ficou R$ " + saldoFinal + "\n";
    }



}
