public class ContaCorrente {
    String numeroConta;
    double Saldo;

    public ContaCorrente(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public ContaCorrente(double saldo) {
        Saldo = saldo;
    }

    public ContaCorrente() {
        numeroConta = "000000-0";
        Saldo = 0.0;
    }
}
