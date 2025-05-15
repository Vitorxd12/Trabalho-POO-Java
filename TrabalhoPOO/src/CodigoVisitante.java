import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CodigoVisitante {
    private String codigo;
    private boolean usado = false;

    public CodigoVisitante(String codigo) {
        this.codigo = codigo;

        if (!validarCodigo(codigo)) {
            System.out.println("Formato inválido: " + codigo);
        } else {
            this.setUsado(true);
            System.out.println("Código válido: " + codigo + " O código foi usado com sucesso!!");
        }

    }

    @Override
    public String toString() {
        return "CodigoVisitante{" +
                "codigo='" + codigo + '\'' +
                ", usado=" + usado +
                '}';
    }

    public static boolean validarCodigo(String codigo) {
        String regex = "^[A-Z]{3}-[A-Z]{3}[0-9]{4}-[0-9]$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(codigo);
        return matcher.matches();
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public boolean isUsado() {
        return usado;
    }

    public void setUsado(boolean usado) {
        this.usado = usado;
    }
}
