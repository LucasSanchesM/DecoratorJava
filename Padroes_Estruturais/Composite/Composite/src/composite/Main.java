package composite;

public class Main {
    public static void main(String[] args) {
        //Irei fazer um sistema de departamentos de uma empresa onde tenho um departamento principal Senior
        // e um subdepartamento de juniors que esta inserido dentro do senior
        Empregado seniorDev1 = new Desenvolvedor("Joao", 2000);
        Empregado seniorDev2 = new Desenvolvedor("Carlos", 2000);
        //Crio dois seniors chamados joao e carlos
        DepartamentoA departamentoSenior = new DepartamentoA("Departamento Senior");
        //crio o departamento, se for observar o tipo aceigto na lista de funcionarios
        departamentoSenior.adicionarEmpregado(seniorDev1);
        departamentoSenior.adicionarEmpregado(seniorDev2);
        
        Empregado juniorDev1 = new Desenvolvedor("Enzo", 1600);
        Empregado juniorDev2 = new Desenvolvedor("Miguel",1600);
        DepartamentoA departamentoJunior = new DepartamentoA("Departamento Junior");
        departamentoJunior.adicionarEmpregado(juniorDev1);
        departamentoJunior.adicionarEmpregado(juniorDev2);
        
        departamentoSenior.adicionarEmpregado(departamentoJunior);
        
        System.out.println(departamentoSenior.getDescricao());
        System.out.println(departamentoJunior.getSalario());
    }
    
}
