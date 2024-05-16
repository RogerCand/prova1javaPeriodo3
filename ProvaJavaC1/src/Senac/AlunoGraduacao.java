package Senac;


final public class AlunoGraduacao extends Aluno {
    public AlunoGraduacao(final String nome, final String cpf, final String matricula, final String telefone,  final String email,  final String endereco) {
        super(nome, cpf, matricula, telefone, email, endereco);
        this.duracaoDoCurso = 2.5F;
        Disciplina pi = new Disciplina("Projeto integrador", "06");
        this.inscreverEmDisciplina(pi);
    }

    public AlunoGraduacao() {
        super();
        this.duracaoDoCurso = 2.5F;
        Disciplina pi = new Disciplina("Projeto integrador", "06");
        this.inscreverEmDisciplina(pi);
    }

    @Override
    public void inscreverEmDisciplina(final Disciplina disciplina) {
        if ("TCC".equalsIgnoreCase(disciplina.getNome())) {
            System.err.printf("O aluno %s não pode se inscrever na disciplina %s\n", this.getNome(), disciplina.getNome());
        } else {
            super.inscreverEmDisciplina(disciplina);
        }
    }

}