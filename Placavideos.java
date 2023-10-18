package entities;

public class Placavideos {
    private String nome;
    private int quantidade;

    public Placavideos(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void imprimirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Quantidade: " + quantidade);
    }
}