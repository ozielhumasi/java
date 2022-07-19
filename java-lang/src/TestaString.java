public class TestaString {

    public static void main(String[] args) {
        String palavra = "fj11";
        palavra = palavra.toUpperCase()
                .replace("1", "2");
        System.out.println(palavra);

        String nome1 = new String("Oziel");
        String nome2 = new String("Oziel");

        if(nome1 == nome2){
            System.out.println("Nomes iguais");
        } else {
            System.out.println("Nomes diferentes");
        }

        if(nome1.equals(nome2)){
            System.out.println("Nomes iguais");
        } else {
            System.out.println("Nomes diferentes");
        }
    }
}
