package Senac;



public class Disciplina {
    private String nome;
    private String codigo;
    private Professor professor;

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(final Professor professor) {
        this.professor = professor;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome( final String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo( final String codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        if (professor != null) {
            return "Disciplina{" +
                    "nome='" + nome + '\'' +
                    ", codigo='" + codigo + '\'' +
                    ", professor=" + professor.getNome() +
                    '}';
        } else {
            return "Disciplina{" +
                    "nome='" + nome + '\'' +
                    ", codigo='" + codigo + '\'' +
                    ", professor=" +
                    '}';
        }
    }

    public Disciplina(final String nome,  final String codigo, final Professor professor) {
        this.setProfessor(professor);
        this.setNome(nome);
        this.setCodigo(codigo);
    }

    public Disciplina(final String nome, final String codigo) {
        this.setNome(nome);
        this.setCodigo(codigo);
    }

    public Disciplina() {}
}