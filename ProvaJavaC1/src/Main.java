import Senac.Professor;
import Senac.Disciplina;
import Senac.AlunoGraduacao;
import Senac.AlunoPosGraduacao;

public class Main {
    public static void main(String[] args) {
        Disciplina disciplinaJS = new Disciplina("JS", "06");
        Professor Lauro = new Professor("Lauro", "12345678901", "MAT1002", "21941253652", "laurin@example.com", "Tijuca", disciplinaJS);
        AlunoGraduacao Jemerson = new AlunoGraduacao("Jermerson", "21936982147", "MAT157", "987654321", "jamer@example.com", "Barra");
        AlunoPosGraduacao Fernanda = new AlunoPosGraduacao("Fernanda", "21945878965", "MAT168", "21975241524", "fernanda@example.com", "Copacabana");
        Professor Breno = new Professor();

        Breno.setNome("Breno");
        Breno.setCpf("52365248510");
        Breno.setMatricula("MAT1001");
        Breno.setTelefone("21985246325");
        Breno.setEmail("breno@hotmail.com");
        Breno.setEndereco("Vila Isabel");

        Jemerson.inscreverEmDisciplina(disciplinaJS);
        Disciplina ProgCpp = new Disciplina("Java", "01");
        Breno.addDisciplinaMinistrada(ProgCpp);
        Lauro.aplicarAvaliacao(disciplinaJS, "Módulo 3");


        Lauro.lancarNota(Jemerson, disciplinaJS, 10f);
        Lauro.lancarFrequencia(Jemerson, 95, disciplinaJS);

        System.out.println("\n\n\n");

        System.out.println(disciplinaJS);
        System.out.println(Lauro);
        System.out.println(Breno);
        System.out.println(Jemerson);
        System.out.println(Fernanda);
    }
}