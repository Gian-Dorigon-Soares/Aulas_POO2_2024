package exercicio_file;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Random;

public class Leitura_e_Escrita {
    public static void main(String[] args) {
        String menu = "1 Escrever\n" +
                "2 Ler\n\n" +
                "3 Sair";
        int op = 0;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));
            if (op == 1) {
                escrever();
            }

            if (op == 2) {
                ler();
            }

        } while (op != 3);
    }

    public static void escrever () {
        try {
            FileWriter fw = new FileWriter("Sorteiro.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            for (int i = 0; i < 10; i++) {
                Random r = new Random();
                bw.append(r.nextInt(1000)+"\n");
            }
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void ler () {
        try {
            FileReader fr = new FileReader("Sorteiro.txt");
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            while((linha = br.readLine())!= null) {
                System.out.println(linha);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
