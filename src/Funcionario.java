public class Funcionario {
    //VARIAVEIS
    private int mat;
    private String nome;

    //CONSTRUTOR
    public Funcionario(int mat, String nome){
        this.setMat(mat);
        this.setNome(nome);
    }
    //GET E SET
    public int getMat() {
        return mat;
    }

    public void setMat(int mat) {
        this.mat = mat;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    //TOSTRING
    @Override
    public String toString(){
        return "mat: " + this.mat + "\n" + "nome: " + this.nome;
    }
}
