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

    public ContaEspecial(double limite) {
        super
        setLimite(0.0);
    }
}
