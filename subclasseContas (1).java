public class ContaCorrente extends Conta {
    private static final double TAXA = 0.05;

    public ContaCorrente(int numero, String titular, double saldo) {
        super(numero, titular, saldo);
    }

    @Override
    public void sacar(double valor) {
        super.sacar(valor + TAXA);
    }

    @Override
    public void depositar(double valor) {
        super.depositar(valor - TAXA);
    }
}

public class ContaPoupanca extends Conta {
    public ContaPoupanca(int numero, String titular, double saldo) {
        super(numero, titular, saldo);
    }

    public void atualizaSaldo(double percentual) {
        double novoSaldo = getSaldo() * (1 + percentual / 100);
        setSaldo(novoSaldo);
    }

    private void setSaldo(double saldo) {
        super.depositar(saldo - getSaldo());
    }
}
