public class Produto {

    int id;
    String nome;
    float preco;

    public Produto(int id, String nome){
        this.id = id;
        this.nome = nome;
    }

    @Override
    public boolean equals(Object obj) {
        if(this.nome == null) {
            return false;
        }
        if (!(obj instanceof Produto)){ // Se o obj ñ for um Produto, então false;
            return false;
        }
        Produto produto = (Produto) obj;
        if(this.nome == ((Produto) obj).nome &&
        this.id == ((Produto) obj).id){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return ("[Nome: " + this.nome + " Id : " + this.id + "]");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }


}
