public class Teste {
    public static void main(String args[]){
        //VARIAVEIS
        ListaDepartamento departamentos = new ListaDepartamento();
        Departamento ti = new Departamento(1,"TI");
        Departamento rh = new Departamento(2,"RH");
        Departamento auxDep = null;
        ListaFuncionario auxFunc = null;
        //CRIA DEPARTAMENTOS
        departamentos.create(ti.getCod(),ti.getNome());
        departamentos.create(rh.getCod(),rh.getNome());
        //CRIA FUNCIONARIOS
        //------------Funcionario 1----------------//
        auxDep = departamentos.read(ti);
        auxFunc = auxDep.getFuncionarios();
        auxFunc.create(1,"Rodrigo");
        departamentos.update(auxDep,new Departamento(auxDep.getCod(),auxDep.getNome(),auxFunc));
        //------------Funcionario 2----------------//
        auxDep = departamentos.read(rh);
        auxFunc = auxDep.getFuncionarios();
        auxFunc.create(2,"Bruno");
        departamentos.update(auxDep,new Departamento(auxDep.getCod(),auxDep.getNome(),auxFunc));
        //------------Funcionario 3----------------//
        auxDep = departamentos.read(rh);
        auxFunc = auxDep.getFuncionarios();
        auxFunc.create(1,"Rodrigo");
        departamentos.update(auxDep,new Departamento(auxDep.getCod(),auxDep.getNome(),auxFunc));
        //------------Funcionario 4----------------//
        auxDep = departamentos.read(rh);
        auxFunc = auxDep.getFuncionarios();
        auxFunc.create(1,"Rodrigo");
        departamentos.update(auxDep,new Departamento(auxDep.getCod(),auxDep.getNome(),auxFunc));
        //------------Funcionario 5----------------//
        auxDep = departamentos.read(ti);
        auxFunc = auxDep.getFuncionarios();
        auxFunc.create(2,"Bruno");
        departamentos.update(auxDep,new Departamento(auxDep.getCod(),auxDep.getNome(),auxFunc));

    }
}
