import java.util.List;

public class AppPlataformaDeEnsino {
    public static void main(String[] args) {

        // Criando alguns alunos
        Aluno aluno1 = new Aluno("Carlos Silva", "RA12345", "carlos.silva@example.com");
        Aluno aluno2 = new Aluno("Maria Oliveira", "RA54321", "maria.oliveira@example.com");

        // Criando algumas disciplinas
        Disciplina disciplina1 = new Disciplina("Matemática", "Engenharia");
        Disciplina disciplina2 = new Disciplina("História", "Humanas");

        // Criando alguns professores
        Professor professor1 = new Professor("Dr. João", "Matemática", "joao@example.com");
        Professor professor2 = new Professor("Dra. Ana", "História", "ana@example.com");

        // Criando uma instância da PlataformaDeEnsino
        PlataformaDeEnsino plataforma = new PlataformaDeEnsino();

        // Adicionando alunos à plataforma
        plataforma.getAlunos().add(aluno1);
        plataforma.getAlunos().add(aluno2);

        // Adicionando disciplinas à plataforma
        plataforma.getDisciplinas().add(disciplina1);
        plataforma.getDisciplinas().add(disciplina2);

        // Adicionando professores à plataforma
        plataforma.getProfessores().add(professor1);
        plataforma.getProfessores().add(professor2);

        System.out.println("\n***************Início AppPlataformaDeEnsino*************\n");

        // Listando todos os alunos
        List<Aluno> alunos = plataforma.getAlunos();
        System.out.println("Alunos cadastrados: " + alunos.size());
        for (Aluno aluno : alunos) {
            System.out.println("Nome: " + aluno.getNome() + ", RA: " + aluno.getRa() + ", Email: " + aluno.getEmail());
        }

        // Listando todas as disciplinas
        List<Disciplina> disciplinas = plataforma.getDisciplinas();
        System.out.println("\nDisciplinas cadastradas: " + disciplinas.size());
        for (Disciplina disciplina : disciplinas) {
            System.out.println("Nome: " + disciplina.getNome() + ", Curso: " + disciplina.getCurso());
        }

        // Listando todos os professores
        List<Professor> professores = plataforma.getProfessores();
        System.out.println("\nProfessores cadastrados: " + professores.size());
        for (Professor professor : professores) {
            System.out.println("Nome: " + professor.getName() + ", Disciplina: " + professor.getDisciplina() + ", Email: " + professor.getEmail());
        }

        System.out.println("\n****************************************************\n");
    }
}
