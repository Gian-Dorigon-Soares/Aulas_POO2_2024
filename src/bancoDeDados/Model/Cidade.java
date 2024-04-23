package bancoDeDados.Model;

public class Cidade {
    private int id;
    private String nome;
    private String uf;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public Cidade(int id, String nome, String uf) {
        this.id = id;
        this.nome = nome;
        this.uf = uf;
    }

    public Cidade() {
        this.id = -1;
        this.nome = "";
        this.uf = "";
    }

    @Override
    public String toString() {
        return "Cidade{" +
                "id=" + id +", nome=" + nome +", uf=" + uf + '}';
    }
}
