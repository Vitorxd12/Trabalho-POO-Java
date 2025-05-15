public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

//        TODO:
//        - Verificar validade de códigos. TECH: REGEX
//        - Gerar novos códigos PADRÃO: VIS-AAA9999-X (X equivale a soma dos 4 num mod 10) quando os códigos disponíveis se acabarem.
//        - Classes: CodigoVisitante / GerenciadorCodigos

        // Exemplo de uso da classe CodigoVisitante
        CodigoVisitante codigo1 = new CodigoVisitante("VIS-AAA9999-5");
        System.out.println(codigo1);


    }
}