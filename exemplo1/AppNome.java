package Exemplos.exemplo1;

public class AppNome {

    public static void main(String[] args) {

        pessoa p = new pessoa("Marcos", "marcos@gmail", "123456789");
        Estudante e = new Estudante("Matheus", "matheus@gmail", "987896589", 111223, "CC", "Turma 2");
        EstudantePos ep = new EstudantePos("João", "joão@gmail", "894488946", 341412, "CC", "Turma 2", "Roberto", "Computação");

        System.out.println(p);
        System.out.println(e);
        System.out.println(ep);


    }
    
}
