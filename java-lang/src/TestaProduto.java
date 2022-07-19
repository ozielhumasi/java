public class TestaProduto {

    public static void main(String[] args) {
        Produto p1 = new Produto(1, "Bicicleta");
        Produto p2 = new Produto(1, "Motocicleta");

        // codePointCount() method;
        System.out.println(p2.getNome().codePointCount(0, p2.getNome().length()));

        //concat() method;
        System.out.println(p1.getNome().concat(p2.getNome()));

        //contains() method;
        String nome = "   Marcos Almeida    ";
        System.out.println(nome.contains("Alme"));

        //trim() method;
        System.out.println(nome.trim());

        System.out.println(p2.toString());
    }
}
