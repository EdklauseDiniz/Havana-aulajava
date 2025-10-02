package model;

public class Aluno extends Usuario{
    private String matricula;
    private int ano_conclusao_fundamental;
    
    public Aluno(String nome, String cpf, String email_pessoal, String matricula){
        super(nome, cpf, email_pessoal);
        this.matricula = matricula;
    }

    public String getMatricula(){
        return this.matricula;
    }

    public void setMatricula(String matricula){
        this.matricula = matricula;
    }

    public int getAno_conclusao_fundamental(){
        return this.ano_conclusao_fundamental;
    }

    public void setAno_conclusao_fundamental(int ano_conclusao_fundamental){
        this.ano_conclusao_fundamental = ano_conclusao_fundamental;
    }
}