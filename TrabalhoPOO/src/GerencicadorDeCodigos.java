import java.util.Random;

public class GerencicadorDeCodigos {

    public static void gerarNovoCodigo() {
        StringBuilder codigo = new StringBuilder("VIS-");
        Random rand = new Random();
        String Char = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < 3; i++) {
            codigo.append(Char.charAt(rand.nextInt(Char.length())));
        }
        int soma = 0;
        for (int i = 0; i < 4; i++) {
            int digito = rand.nextInt(10);
            codigo.append(digito);
            soma += digito;
        }
        int digitoVerificador = soma % 10;
        codigo.append('-');
        codigo.append(digitoVerificador);
        System.out.println(codigo);
    }
}
