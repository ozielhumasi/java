public class DesafioOpcional2 {

    static void inverterFrase(String frase){
        String resultado = "";
        for(int i = frase.length()-1; i >= 0; i--){
            resultado += frase.charAt(i);
        }
        System.out.println(resultado);

    }

    public static void main(String[] args) {
    /* (Opcional) Reescreva o método do exercício anterior, mas modificando-o
     para que imprima a String de trás para a frente e em uma linha só.
      Teste-a para "Socorram-me, subi no ônibus em Marrocos"
       e "anotaram a data da maratona"
     */
        String frase1 = "Socorram-me, subi no ônibus em Marrocos";
        String frase2 = "anotaram a data da maratona";

        DesafioOpcional2.inverterFrase(frase2); 




    }
}
