package model;
import java.util.List;

public class Turma {
    private String nome;
    private String sala;
    private String horario_inicio;
    private String horario_fim;
    private List<Professor> professores;
    private Disciplina disciplina;

    public void addProfessor(Professor professores){
        this.professores.add(professores);
    }
    
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSala() {
        return this.sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public String getHorario_inicio() {
        return this.horario_inicio;
    }

    public void setHorario_inicio(String horario_inicio) {
        this.horario_inicio = horario_inicio;
    }

    public String getHorario_fim() {
        return this.horario_fim;
    }

    public void setHorario_fim(String horario_fim) {
        this.horario_fim = horario_fim;
    }

    public List<Professor> getProfessores() {
        return this.professores;
    }

    public void setProfessores(List<Professor> professores) {
        this.professores = professores;
    }

    public Disciplina getDisciplina() {
        return this.disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }
}
