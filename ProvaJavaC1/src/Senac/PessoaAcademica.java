package Senac;



public abstract class PessoaAcademica {
    protected String nome;
    protected String cpf;

    protected String matricula;
    protected String telefone;
    protected String email;
    protected String endereco;

    public String getNome() {
        return nome;
    }

    public void setNome(final String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(final String cpf) {
        this.cpf = cpf;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(final String matricula) {
        this.matricula = matricula;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(final String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(final String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(final String endereco) {
        this.endereco = endereco;
    }

    public PessoaAcademica( final String nome,  final String cpf,  final String matricula, final String telefone,  final String email,  final String endereco) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setMatricula(matricula);
        this.setTelefone(telefone);
        this.setEmail(email);
        this.setEndereco(endereco);
    }

    public PessoaAcademica() {}

    @Override
    public String toString() {
        return "PessoaAcademica{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", matricula='" + matricula + '\'' +
                ", telefone='" + telefone + '\'' +
                ", email='" + email + '\'' +
                ", endereco='" + endereco + '\'' +
                '}';
    }
}