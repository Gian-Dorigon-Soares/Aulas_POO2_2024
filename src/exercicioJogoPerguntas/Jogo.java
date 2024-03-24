package exercicioJogoPerguntas;

import javax.swing.*;
import java.io.*;
import java.util.Random;

public class Jogo {
    public static void main(String[] args) {
        String[] PerguntasSelecionadas = setupPerguntas();
        String[] RegistroPartida = new String[5];
        Jogador j = new Jogador();
        j.setNome(JOptionPane.showInputDialog(null, "Ensira o seu nome"));
        for (int i = 0; i <= 4; i++) {
            String questao = "Pergunta nrº"+(i+1)+"\n" +
                    PerguntasSelecionadas[i].substring(0,PerguntasSelecionadas[i].indexOf(','));
            String respostaJogador;
            int a = JOptionPane.showConfirmDialog(null,questao,"Questão"+(i+1),JOptionPane.YES_NO_OPTION);
            if (a == JOptionPane.YES_OPTION) {
                respostaJogador = "verdadeiro";
            } else {
                respostaJogador = "falso";
            }
            String respostaPergunta = PerguntasSelecionadas[i].substring(PerguntasSelecionadas[i].indexOf(",")+1);
            if (respostaJogador.equalsIgnoreCase(respostaPergunta)) {
                j.setPontos(j.getPontos()+1);
            }
            RegistroPartida[i] = PerguntasSelecionadas[i] + " - Resposta Jogador: " + respostaJogador;
        }
        JOptionPane.showMessageDialog(null, "Pontuação "+j.getPontos());
        try {
            File ArquivoRegistroPartida = new File(j.getNome() + ".txt");
            if (ArquivoRegistroPartida.exists() == false) {
                ArquivoRegistroPartida.createNewFile();
                FileWriter fw = new FileWriter(ArquivoRegistroPartida, true);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write("Jogador: "+j.getNome()+" Pontuação: "+j.getPontos());
                bw.newLine();
                for (int i = 0; i <= 4; i++) {
                    bw.write(RegistroPartida[i]);
                    bw.newLine();
                }
                bw.close();
                fw.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static String[] setupPerguntas() {
        String[] Perguntas = new String[20];
        String[] PerguntasSelecionadas = new String[5];
        try {
            FileReader fr = new FileReader("perguntas.txt");
            BufferedReader br = new BufferedReader(fr);
            String linha;
            int contador = 0;
            while ((linha = br.readLine())!= null) {
                Perguntas[contador] = linha;
                contador++;
            }
            for (int i = 0; i <= 4; i++) {
                Random r = new Random();
                PerguntasSelecionadas[i] = Perguntas[r.nextInt(20)];
            }
            br.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return PerguntasSelecionadas;
    }
}
