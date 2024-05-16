package Senac;


import java.util.HashSet;
public final class Professor  extends PessoaAcademica {

    private HashSet<Disciplina> disciplinasMinistradas = new HashSet<Disciplina>();

    public void aplicarAvaliacao( final Disciplina disciplina,  final String turma) {
        System.out.printf("O professor %s aplicou a prova de %s para a turma %s\n", this.getNome(), disciplina.getNome(), turma);
    }

    public void lancarNota( final AlunoGraduacao aluno,  final Disciplina disciplina,  final Float nota) {
        System.out.printf("O professor %s lançou a nota %f para o aluno %s em %s\n", this.getNome(), nota, aluno.getNome(), disciplina.getNome());
    }

    public void lancarFrequencia(final AlunoGraduacao aluno, final int frequencia,  final Disciplina disciplina) {
        System.out.printf("O professor %s lançou a frequência %d para o aluno %s em %s\n", this.getNome(), frequencia, aluno.getNome(), disciplina.getNome());
    }

    public HashSet<Disciplina> getDisciplinasMinistradas() {
        return disciplinasMinistradas;
    }

    public void addDisciplinasMinistradas(final HashSet<Disciplina> disciplinasMinistradas) {
        for (Disciplina disciplina : disciplinasMinistradas) {
            // Aqui teria uma validacao de erro...
            this.addDisciplinaMinistrada(disciplina);
        }
    }

    public void addDisciplinaMinistrada(final Disciplina disciplina) {
        if (disciplina.getProfessor() == null) {
            disciplina.setProfessor(this);
            this.disciplinasMinistradas.add(disciplina);
            System.out.printf("O professor %s ministrará a disciplina %s\n", this.getNome(), disciplina.getNome());
        } else {
            System.err.printf("Erro: essa disciplina %s já está associada ao professor %s.\n", disciplina.getNome(), disciplina.getProfessor().getNome());
        }
    }

    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", matricula='" + matricula + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", endereco='" + endereco + '\'' +
                ", disciplinasMinistradas=" + disciplinasMinistradas +
                '}';
    }

    public Professor(final String nome,  final String cpf, final String matricula,  final String telefone,  final String email, final String endereco, final HashSet<Disciplina> disciplinasMinistradas) {
        super(nome, cpf, matricula, telefone, email, endereco);
        this.addDisciplinasMinistradas(disciplinasMinistradas);
    }

    public Professor(final String nome,  final String cpf, final String matricula, final String telefone,  final String email, final String endereco, final Disciplina disciplinaMinistrada) {
        super(nome, cpf, matricula, telefone, email, endereco);
        this.addDisciplinaMinistrada(disciplinaMinistrada);
    }
    public Professor(final String nome,  final String cpf,  final String matricula,  final String telefone,  final String email,  final String endereco) {
        super(nome, cpf, matricula, telefone, email, endereco);
    }

    public Professor() {
        super();
    }
}