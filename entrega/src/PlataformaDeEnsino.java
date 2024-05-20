import java.util.ArrayList;
import java.util.List;

public class PlataformaDeEnsino {
    List<Aluno> alunos=new ArrayList<Aluno>();
    List<Professor> professores=new ArrayList<Professor>();
    List<Disciplina> disciplinas=new ArrayList<Disciplina>();

    public List<Aluno> getAlunos() {
        return alunos;
    }
    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
    public List<Professor> getProfessores() {
        return professores;
    }
    public void setProfessores(List<Professor> professores) {
        this.professores = professores;
    }
    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }
    public void setDisciplinas(List<Disciplina> disciplinas) {
        this.disciplinas = disciplinas;
    }

}
