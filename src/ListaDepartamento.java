import java.util.ArrayList;
import java.util.List;

public class ListaDepartamento {
    //VARIAVEIS
    private List<Departamento> departamentos;

    //CONSTRUTOR
    public ListaDepartamento(){
        departamentos = new ArrayList<>();
    }

    //METODOS AUXILIARES
    private boolean find(int cod, String nome) {
        boolean resp = false;
        if (!departamentos.isEmpty()) {
            for (Departamento dep : departamentos) {
                if (dep.getCod() == cod && dep.getNome().equals(nome)) {
                    resp = true;
                }
            }
        }
        return resp;
    }

    private int findIndex(int cod, String nome) {
        int resp = -1;
        int i=0;
        if (!departamentos.isEmpty()) {
            for (Departamento dep : departamentos) {
                if (dep.getCod() == cod && dep.getNome().equals(nome)) {
                    resp = i;
                }
                i++;
            }
        }
        return resp;
    }
    //CRUD
    //CREATE
    public boolean create(int cod, String nome){
        departamentos.add(new Departamento(cod,nome));
        System.out.println("Departamento criado com sucesso");
        return true;
    }

    public boolean create(int cod, String nome, ListaFuncionario funcionarios){
        departamentos.add(new Departamento(cod,nome, funcionarios));
        System.out.println("Departamento criado com sucesso");
        return true;
    }
    //READ
    public Departamento read(Departamento departamento){
        Departamento alt = null;
        if (find(departamento.getCod(),departamento.getNome())){
            alt = departamento;
        }
        return alt;
    }

    //UPDATE
    public boolean update(Departamento antigo, Departamento novo){
        boolean resp = false;
        if (find(antigo.getCod(),antigo.getNome())){
            departamentos.set(findIndex(antigo.getCod(),antigo.getNome()), novo);
            resp = true;
            System.out.println("Departamento alterado com sucesso");
        }else{
            System.out.println("Departamento não existe");
        }
        return resp;
    }

    //DELETE
    public boolean delete(Departamento departamento){
        boolean resp = false;
        if (find(departamento.getCod(),departamento.getNome())){
            resp = departamentos.remove(departamento);
            System.out.println("Departamento deletado com sucesso");
        }else{
            System.out.println("Departamento não existe");
        }
        return resp;
    }

    //TOSTRING
    @Override
    public String toString(){
        String resp = "\n" + "--------------------";
        for(Departamento d: departamentos){
            resp = d.toString();
            resp = resp + "\n";
        }
        resp = resp + "--------------------";
        return resp;
    }
}
