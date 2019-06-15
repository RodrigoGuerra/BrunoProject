public class Departamento {
    //VARIAVEIS
    private int cod;
    private String nome;
    private ListaFuncionario funcionarios;

    //CONSTRUTOR
    public Departamento(int cod, String nome, ListaFuncionario funcionarios){
        this.cod=cod;
        this.nome=nome;
        this.funcionarios=funcionarios;
    }

    public Departamento(int cod, String nome){
        this.cod=cod;
        this.nome=nome;
        this.funcionarios= new ListaFuncionario();
    }

    //GET E SET
    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ListaFuncionario getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(ListaFuncionario funcionarios) {
        this.funcionarios = funcionarios;
    }

    //TOSTRING
    @Override
    public String toString(){
        return "cod: " + this.cod + "\n" + "nome: " + this.nome + "\n" + "funcionarios: " + this.funcionarios.toString();
    }
}
