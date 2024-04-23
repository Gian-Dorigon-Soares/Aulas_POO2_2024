package bancoDeDados.Model;

public class Cliente {
    private int id;
    private int idade;
    private String nome;
    private String sexo;
    private Cidade cidade;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Cidade getCidade() {
        return cidade;
    }

    public void setCidade(Cidade cidade) {
        this.cidade = cidade;
    }

    public Cliente(int id, int idade, String nome, String sexo, Cidade cidade) {
        this.id = id;
        this.idade = idade;
        this.nome = nome;
        this.sexo = sexo;
        this.cidade = cidade;
    }

    public Cliente() {
        this.id = -1;
        this.idade = -1;
        this.nome = "";
        this.sexo = "";
        this.cidade = new Cidade();
    }

    @Override
    public String toString() {
        return "Cliente{" + "id=" + id + ", idade=" + idade + ", nome='" + nome + ", sexo='" + sexo + ", cidade=" + cidade + '}';
    }
}
