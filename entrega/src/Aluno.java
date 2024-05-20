public class Aluno {

    private String nome;
    private String ra;
    private String email;

    public Aluno(String nome, String ra, String email) {
        this.nome = nome;
        this.ra = ra;
        this.email = email;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getRa() {
        return ra;
    }
    public void setRa(String ra) {
        this.ra = ra;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    
}
