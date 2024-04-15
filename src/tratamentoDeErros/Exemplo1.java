package tratamentoDeErros;

import javax.swing.*;

public class Exemplo1 {
    public static void main(String[] args) {
        try {
            int n = Integer.parseInt(JOptionPane.showInputDialog("Ensira a quantidade de numeros"));
            if (n%2 != 0) {
                throw new Exception("Apenas numeros pares");
            }
            int vetor[] = new int[n];
            for (int i = 0; i < n; i++) {
                vetor[i] = i * i;
            }
            int indice = Integer.parseInt(JOptionPane.showInputDialog("Digite o indice que quer ver"));
            System.out.println(vetor[indice]);
        } catch (NumberFormatException nufe) {
            System.out.println("Numero invalido");
        } catch (NegativeArraySizeException nase) {
            System.out.println("Tamanho do array não pode ser negativo");
        } catch (ArrayIndexOutOfBoundsException aiobe) {
            System.out.println("Indice invalido");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
