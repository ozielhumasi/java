//
public class DesafioOpcional1 {

    public static void main(String[] args) {
       /* (Opcional) Escreva um método que usa os métodos charAt e length de
       uma String para imprimí-la caractere caractere, com cada caractere em uma
       linha diferente.
        */
        String texto = "Macacos gostam de voar pela cidade";
        for (int i = 0; i < texto.replace(" ", "").length(); i++)
            System.out.println(texto.replace(" ", "").charAt(i));

    }
}
