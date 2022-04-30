package Exemplos.exemplo1;

public class EstudantePos extends Estudante {

    private String dissertacao, orientador;

    public EstudantePos(String nome, String email, String telefone, int ra, String curso, String turma, String orientador, String dissertacao){

        super(nome, email, telefone, ra, curso, turma);
        this.orientador = orientador;
        this.dissertacao = dissertacao;

    }

    public String toString(){

        return super.toString() + " Orientador: " + orientador + " Dissertação: " + dissertacao;
    }
    
}
