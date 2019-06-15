import java.util.ArrayList;
import java.util.List;

public class GloblalVariableFuncionario {
    //VARIAVEIS
    private static List<Funcionario> globalFuncionarios = new ArrayList<>();

    //GET E SET
    public static List<Funcionario> getGlobalFuncionarios() {
        return globalFuncionarios;
    }

    public static void setGlobalFuncionarios(List<Funcionario> globalFuncionarios) {
        GloblalVariableFuncionario.globalFuncionarios = globalFuncionarios;
    }

    //METODOS AUXILIARES
    private static boolean find(int mat, String nome) {
        boolean resp = false;
        if (!globalFuncionarios.isEmpty()) {
            for (Funcionario func : globalFuncionarios) {
                if (func.getMat()==mat && func.getNome().equals(nome)) {
                    resp = true;
                }
            }
        }
        return resp;
    }

    private static int findIndex(int mat, String nome) {
        int resp = -1;
        int i=0;
        if (!globalFuncionarios.isEmpty()) {
            for (Funcionario func : globalFuncionarios) {
                if (func.getMat()==mat && func.getNome().equals(nome)) {
                    resp = i;
                }
                i++;
            }
        }
        return resp;
    }

    //CRUD
    public static void insertFuncionario(int mat, String nome){
        globalFuncionarios.add(new Funcionario(mat,nome));
    }

    public static void updateFuncionario(int mat, String nome, int matNovo, String nomeNovo){
        if (find(mat,nome));
            globalFuncionarios.set(findIndex(mat,nome),new Funcionario(matNovo,nomeNovo));
    }
    public static void deleteFuncionario(int mat, String nome){
        if (!globalFuncionarios.isEmpty()&&globalFuncionarios.contains(new Funcionario(mat,nome)));
            globalFuncionarios.remove(new Funcionario(mat,nome));
    }
    public static Funcionario read(int mat, String nome){
        Funcionario alt = null;
        if (find(mat,nome)){
            alt = new Funcionario(mat,nome);
        }
        return alt;
    }

    //TOSTRING
    @Override
    public String toString(){
        String resp = "\n" + "--------------------";
        for(Funcionario f: globalFuncionarios){
            resp = f.toString();
            resp = resp + "\n";
        }
        resp = resp + "--------------------";
        return resp;
    }

}
