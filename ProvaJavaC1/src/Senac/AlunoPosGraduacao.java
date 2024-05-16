package Senac;



final public class AlunoPosGraduacao extends Aluno{
    public AlunoPosGraduacao(String nome, String cpf, String matricula, String telefone, String email, String endereco) {
        super(nome, cpf, matricula, telefone, email, endereco);
        this.duracaoDoCurso = 1F;
        Disciplina tcc = new Disciplina("Trabalho de conclusão curso", "09");
        this.inscreverEmDisciplina(tcc);
    }

    public AlunoPosGraduacao() {
        super();
        this.duracaoDoCurso = 1F;
        Disciplina tcc = new Disciplina("Trabalho de conclusão curso", "09");
        this.inscreverEmDisciplina(tcc);
    }

    @Override
    public void inscreverEmDisciplina(final Disciplina disciplina) {
        if ("PI".equalsIgnoreCase(disciplina.getNome())) {
            System.err.printf("O aluno %s não pode se inscrever na disciplina %s\n", this.getNome(), disciplina.getNome());
        } else {
            super.inscreverEmDisciplina(disciplina);
        }
    }
}