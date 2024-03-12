package exercicio_banco;

import exercicio_banco.test.ContaBancariaTest;

import java.util.ArrayList;

public class Banco {
    private ArrayList <ContaBancaria> Contas = new ArrayList<>();

    public ArrayList<ContaBancaria> getContas() {
        return Contas;
    }

    public void setContas(ContaBancaria conta) {
        Contas.add(conta);
    }

    public Banco(ArrayList<ContaBancaria> contas) {
        Contas = contas;
    }

    public Banco() {
    }

    public String listaContas() {
        String retorno = "";
        for (ContaBancaria contaBancaria : getContas()) {
            retorno += contaBancaria.getNumeroConta() + " - "+ contaBancaria.getSaldoConta()+"\n";
        }
        return retorno;
    }
}
