import java.util.ArrayList;
import java.util.List;

public class ListaFuncionario {
    //VARIAVEIS
    private List<Funcionario> funcionarios;

    //CONSTRUTOR
    public ListaFuncionario(){
        this.funcionarios = new ArrayList<>();
    }

    //METODOS AUXILIARES
    private boolean find(int mat, String nome) {
        boolean resp = false;
        if (!funcionarios.isEmpty()) {
            for (Funcionario func : funcionarios) {
                if (func.getMat()==mat && func.getNome().equals(nome)) {
                    resp = true;
                }
            }
        }
        return resp;
    }

    private int findIndex(int mat, String nome) {
        int resp = -1;
        int i=0;
        if (!funcionarios.isEmpty()) {
            for (Funcionario func : funcionarios) {
                if (func.getMat()==mat && func.getNome().equals(nome)) {
                    resp = i;
                }
                i++;
            }
        }
        return resp;
    }

    //CRUD
    public boolean create(int mat, String nome){
        boolean resp = false;
        //INSERINDO NA LISTA GLOBAL DE FUNCIONARIOS
        if (GloblalVariableFuncionario.read(mat,nome)==null) {
            GloblalVariableFuncionario.insertFuncionario(mat,nome);
            //INSERINDO NA LISTA LOCAL DE FUNCIONARIOS
            resp = funcionarios.add(new Funcionario(mat, nome));
            System.out.println("Funcionario criado com sucesso");
        }else{
            System.out.println("Funcionario existente em outro departamento");
        }
        return resp;
    }

    public Funcionario read(int mat, String nome){
        Funcionario alt = null;
        if (find(mat,nome)){
            int i = findIndex(mat,nome);
            alt = funcionarios.get(i);
        }
        return alt;
    }

    public boolean update(int mat,String nome,int matNovo,String nomeNovo){
        boolean resp = false;
        //ALTERANDO NA LISTA GLOBAL DE FUNCIONARIOS
        if (GloblalVariableFuncionario.read(mat,nome)!=null) {
            GloblalVariableFuncionario.updateFuncionario(mat,nome,matNovo,nomeNovo);
            //ALTERANDO NA LISTA LOCAL DE FUNCIONARIOS
            funcionarios.set(funcionarios.indexOf(new Funcionario(mat,nome)), new Funcionario(matNovo,nomeNovo));
            resp = true;
            System.out.println("Funcionario alterado com sucesso");
        }else{
                System.out.println("Funcionario existente em outro departamento");
        }
        return resp;
    }

    public boolean delete(int mat, String nome){
        boolean resp = false;
        //ALTERANDO NA LISTA GLOBAL DE FUNCIONARIOS
        if (GloblalVariableFuncionario.read(mat,nome)!=null){
            GloblalVariableFuncionario.deleteFuncionario(mat,nome);
            resp = funcionarios.remove(new Funcionario(mat,nome));
            System.out.println("Funcionario alterado com sucesso");
            resp = true;
        }else{
            resp = false;
            System.out.println("Funcionario não existe");
        }
        return resp;
    }

    //TOSTRING
    @Override
    public String toString(){
        String resp = "\n" + "--------------------";
        for(Funcionario f: funcionarios){
            resp = f.toString();
            resp = resp + "\n";
        }
        resp = resp + "--------------------";
        return resp;
    }
}
