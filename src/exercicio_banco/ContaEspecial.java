package exercicio_banco;

public class ContaEspecial extends ContaBancaria {
    private double limite;

    public double getLimite() {
        return limite;
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }

    public ContaEspecial(int numeroConta, double saldoConta, double limite) {
        super(numeroConta, saldoConta);
        setLimite(limite);
    }

    public ContaEspecial() {
        super();
        setLimite(0.0);
    }

    @Override
    public boolean saque (double valor) {
        if (valor > getLimite()) {
            return false;
        } else {
            if (valor > 0 && valor <= getSaldoConta()) {
                setSaldoConta(getSaldoConta() - valor);
                return true;
            } else {
                return false;
            }
        }
    }
}
