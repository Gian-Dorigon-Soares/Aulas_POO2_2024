package leitura_arquivo;

import exercicio_banco.ContaBancaria;
import exercicio_banco.ContaPoupanca;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class ArquivoContas {
    public static void main(String[] args) {
        ArrayList<ContaBancaria> contas = new ArrayList<>();
        try {
            FileReader fr = new FileReader("contas.csv");
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            while ((linha=br.readLine())!=null) {
                String v[] = linha.split(",");
                int nr = Integer.parseInt(v[1]);
                double saldo = Double.parseDouble(v[2]);
                if (v[0].equals("0")) {
                    contas.add(new ContaBancaria(nr, saldo));
                } else if (v[0].equals("1")) {
                    contas.add(new ContaPoupanca(nr, saldo));
                } else if (v[0].equals("2")) {
                    double limite = Double.parseDouble(v[3]);
                    contas.add(new ContaPoupanca(nr, saldo));
                }
            }
            br.close();
            fr.close();
            String retorno = "";
            for (ContaBancaria conta : contas) {
                retorno += conta.getNumeroConta()+" - "+ conta.getSaldoConta()+"\n";
            }
            System.out.println(retorno);
        } catch (Exception e) {
           e.printStackTrace();
        }
    }
}
