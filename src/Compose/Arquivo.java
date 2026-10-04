package Compose;

public class Arquivo implements ItemSistema {
    public String nome;

    public Arquivo(String nome) {
        this.nome = nome;
    }

    @Override
    public void ler(String usuario) {
        System.out.println("Lendo arquivo: " + this.nome);
    }
}
