package exercicioJogoPerguntas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Arquivo {
    private ArrayList<Pergunta> Perguntas;

    public ArrayList<Pergunta> getPerguntas() {
        return Perguntas;
    }

    public void setPerguntas(ArrayList<Pergunta> perguntas) {
        Perguntas = perguntas;
    }

    public void lerAquivo() {
        try {
            FileReader fr = new FileReader("perguntas.txt");
            BufferedReader br = new BufferedReader(fr);
            String linha = "";
            while ((linha = br.readLine())!= null) {
                Perguntas.add(new Pergunta(linha));
            }
            br.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public ArrayList<Pergunta> sorteiaRodada(int qtd) {
        ArrayList<Pergunta> sorteadas = new ArrayList<>();
        Collections.shuffle(Perguntas);
        for(int i=0; i < qtd; i++) {
            sorteadas.add(Perguntas.get(i));
        };
        return sorteadas;
    }
    public int calculaPontuacao(ArrayList<Resposta> respostas) {
        int ponto = 0;
        for (Resposta r : respostas) {
            if(r.correcao().equals("acerto")) {
                ponto++;
            }
        }
        return ponto;
    }
    public void apuraçãoResultados (ArrayList<Resposta> respostas) {
        try {
            FileWriter fw = new FileWriter("respostas.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            int cont = 1;
            for (Resposta r : respostas) {
                bw.append(cont++ +","+ r.getPerguntaSelecionada().getPergunta()+" - "+r.correcao()+"\n");
            }
            bw.close();
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}