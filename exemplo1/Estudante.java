package Exemplos.exemplo1;

public class Estudante extends pessoa {

    private String curso, turma;
    private int ra;

    public Estudante(){}

    public Estudante(String nome, String email, String telefone, int ra, String curso, String turma){

        super(nome, email, telefone);
        this.ra = ra;
        this.curso = curso;
        this.turma = turma;
    }

    
    public String toString(){

        return super.toString() + " RA: " + ra + " Curso: " + curso + " Turma: " + turma;
    }
    
}
