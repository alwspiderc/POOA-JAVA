package br.ucsal;

public class Consumidor {
    
    private Long id;
    private String nome;
    private String sobrenome;
    private String cidade;
    private String rua;

    public Consumidor() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    @Override
    public String toString() {
        return "Consumidor [id=" + id + ", nome=" + nome + ", sobrenome=" + sobrenome + ", cidade=" + cidade + ", rua="
                + rua + "]";
    }

    
    
}
