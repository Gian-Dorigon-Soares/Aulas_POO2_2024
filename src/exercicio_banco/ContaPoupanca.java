package exercicio_banco;

import java.time.LocalDate;

public class ContaPoupanca extends ContaBancaria {
    private int saquesMes = 5;
    private int mesUltimoSaque;

    public void setSaquesMes(int saquesMes) {
        this.saquesMes = saquesMes;
    }

    public int getSaquesMes() {
        return saquesMes;
    }

    public int getMesUltimoSaque() {
        return mesUltimoSaque;
    }

    public void setMesUltimoSaque(int mesUltimoSaque) {
        this.mesUltimoSaque = mesUltimoSaque;
    }

    public ContaPoupanca(int numeroConta, double saldoConta) {
        super(numeroConta, saldoConta);
    }

    public ContaPoupanca() {
        super();
    }

    @Override
    public boolean saque(double valor) {
        LocalDate hoje = LocalDate.now();
        if (getSaquesMes() <= 0 && hoje.getMonthValue() == mesUltimoSaque) {
            return false;
        } else {
            if (valor > 0 && valor <= getSaldoConta()) {
                setSaldoConta(getSaldoConta() - valor);
                setSaquesMes(getSaquesMes() - 1);
                setMesUltimoSaque(hoje.getMonthValue());
                return true;
            } else {
                return false;
            }
        }
    }
}
