package Exemplos.exemplo1;

public class pessoa {

    private String nome, email, telefone;

    public pessoa(){}

    public pessoa(String nome, String email, String telefone){

        this.nome = nome;
        this.email = email;
        this.telefone = telefone;

    }

    public void setNome() {

        this.nome = nome;
        
    }

    public String getNome() {

        return nome;
        
    }

    public void setEmail() {

        this.email = email;
        
    }

    public String getEmail() {

        return email;
        
    }

    public void setTelefone() {

        this.telefone = telefone;
        
    }

    public String getTelefone() {

        return telefone;
        
    }

    @Override
    public String toString(){

        return "Nome: " + nome + " Email: " + email + " Telefone: " + telefone;
    }
    
}
