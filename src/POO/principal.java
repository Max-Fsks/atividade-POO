package POO;

public class principal {

    public static void main(String[] args) {

        Geladeira geladeira = new Geladeira(200, 70, 600, 2, "preto");

        geladeira.ImprimirDadosGeladeira();

        Microondas microondas = new Microondas("branco", 500, 40, 50, 2);

        microondas.ImprimirDadosMicroondas();
    }
}
