public class Aluno extends Usuario{
    private String matricula;

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
}