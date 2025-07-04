public class Usuario {
    private String nome;
    private String cpf;
    private int idade;
    private String email_pessoal;
    private String email_institucional;
    private String senha;

    public Usuario(String nome, String cpf, String email_pessoal){
        this.nome = nome;
        this.cpf = cpf;
        this.email_pessoal = email_pessoal;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if (!nome.isBlank()) {
            this.nome = nome;
        }
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        if (!cpf.isBlank()) {
            this.cpf = cpf;
        }
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        }
    }
}