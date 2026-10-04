package FactoryPattern;

import Auditoria.AuditoriaLog;
import Compose.Arquivo;
import Compose.ItemSistema;
import Compose.Pasta;
import Proxy.ArquivoProtegidoProxy;

public class FilesFactory {
    private final AuditoriaLog auditoriaCompartilhada;

    public FilesFactory(AuditoriaLog auditoria) {
        this.auditoriaCompartilhada = auditoria;
    }

    public ItemSistema criarArquivoNormal (String nomeArquivo) {
        return new Arquivo(nomeArquivo);
    }

    public Pasta criarPasta (String nomePasta) {
        return new Pasta(nomePasta);
    }

    public ItemSistema criarArquivoSecreto (String nomeArquivo) {
        return new ArquivoProtegidoProxy(new Arquivo(nomeArquivo));
    }

}
