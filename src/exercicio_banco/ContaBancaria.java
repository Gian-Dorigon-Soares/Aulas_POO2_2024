package exercicio_banco;

public class ContaBancaria {
    private int numeroConta;
    private double saldoConta;

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldoConta() {
        return saldoConta;
    }

    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }

    public ContaBancaria(int numeroConta, double saldoConta) {
        setNumeroConta(numeroConta);
        setSaldoConta(saldoConta);
    }

    public ContaBancaria() {
        setNumeroConta(0);
        setSaldoConta(0.0);
    }

    public boolean deposito(double deposito) {
        if(deposito > 0) {
            setSaldoConta(getSaldoConta()+deposito);
            return true;
        } else {
            return false;
        }
    }
    public boolean saque(double valor) {
        if (valor > 0 && valor <= getSaldoConta()) {
            setSaldoConta(getSaldoConta()-valor);
            return true;
        } else {
            return false;
        }
    }
    public boolean transferencia(ContaBancaria destino, double valor) {
        if (saque(valor)) {
            destino.deposito(valor);
            return true;
        } else {
            deposito(valor);
            return false;
        }
    }
}
