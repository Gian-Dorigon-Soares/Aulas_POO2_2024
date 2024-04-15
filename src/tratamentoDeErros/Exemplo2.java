package tratamentoDeErros;

public class Exemplo2 {
    public static void main(String[] args) {
        try {
            Dado d = new Dado();
            d.lerNumero();
            System.out.println(d.numero);
        } catch (NumberFormatException e) {
            System.out.println("erro na clase main");
        }
    }
}


