public class main {
    public static void main(String[] args) {
        Aluno aluno; 
        aluno = new Aluno("Jose", "1234567890", "pp2@gmail.com", "TDS12070");
        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Cpf: " + aluno.getCpf());
        System.out.println("Email Pessoal: " + aluno.getEmail_pessoal());
        System.out.println("Matrícula: " + aluno.getMatricula());
    }
}
