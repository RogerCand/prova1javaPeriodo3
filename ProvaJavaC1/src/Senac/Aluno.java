package Senac;



import java.util.HashSet;

public abstract class Aluno extends  PessoaAcademica{
    protected Float duracaoDoCurso; // Anos
    protected HashSet<Disciplina> disciplinasInscrito = new HashSet<Disciplina>();

    public Float getDuracaoDoCurso() {
        return duracaoDoCurso;
    }

    public HashSet<Disciplina> getDisciplinasInscrito() {
        return disciplinasInscrito;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "duracaoDoCurso=" + duracaoDoCurso +
                ", disciplinasInscrito=" + disciplinasInscrito +
                ", nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", matricula='" + matricula + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }

    public void inscreverEmDisciplinas(final HashSet<Disciplina> disciplinas) {
        for (Disciplina disciplina : disciplinas) {
            // Ocorreria uma validação aqui
            inscreverEmDisciplina(disciplina);
            System.out.printf("O aluno %s se inscreveu na disciplina: %s\n", this.getNome(), disciplina.getNome());
        }
    }

    public void inscreverEmDisciplina(final Disciplina disciplina) {
        disciplinasInscrito.add(disciplina);
        System.out.printf("O aluno %s se inscreveu na disciplina: %s\n", this.getNome(), disciplina.getNome());
    }

    public void solicitarBoleto() {
        System.out.printf("A mensalidade é 900R$");
    }

    public void solicitarHistorico() {
        for (Disciplina disciplina : disciplinasInscrito) {
            System.out.printf("Nota na disciplina %s: 10\n", disciplina.getNome()); // Não tá implementado o sistema de notas...
        }
    }

    public Aluno(final String nome, final String cpf,final String matricula, final String telefone, final String email, final String endereco) {
        super(nome, cpf, matricula, telefone, email, endereco);
    }
    public Aluno(final String nome, final String cpf, final String matricula,final String telefone, final String email, final String endereco, final HashSet<Disciplina> disciplinas) {
        super(nome, cpf, matricula, telefone, email, endereco);
        this.inscreverEmDisciplinas(disciplinas);
    }
    public Aluno() {
        super();
    }
}