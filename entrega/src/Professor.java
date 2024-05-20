public class Professor {

    private String name;
    private String disciplina;
    private String email;

    public Professor(String name, String disciplina, String email) {
        this.name = name;
        this.disciplina = disciplina;
        this.email = email;
    }

    public String getName() {
        return name;
    }public void setName(String name) {
        this.name = name;
    }
    public String getDisciplina() {
        return disciplina;
    }public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    public String getEmail() {
        return email;
    }public void setEmail(String email) {
        this.email = email;
    }
}
