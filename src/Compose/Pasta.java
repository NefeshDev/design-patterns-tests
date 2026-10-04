package Compose;

import java.util.ArrayList;
import java.util.List;

public class Pasta implements ItemSistema {
    private List<ItemSistema> arquivos = new ArrayList<>();
    public String nome;

    public Pasta( String nome) {
        this.nome = nome;
    }

    @Override
    public void ler(String usuario) {
        System.out.println("📁 Abrindo pasta: " + nome);
        for (ItemSistema arquivo : arquivos) {
            arquivo.ler(usuario);
        }
    }

    public void adicionarArquivo(ItemSistema arquivo) {
        arquivos.add(arquivo);
    }
}