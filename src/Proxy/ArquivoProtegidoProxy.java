package Proxy;

import Auditoria.AuditoriaListener;
import Compose.Arquivo;
import Compose.ItemSistema;

import java.util.ArrayList;
import java.util.List;

public class ArquivoProtegidoProxy implements ItemSistema {

    private Arquivo arquivo;
    private List<AuditoriaListener> observadores = new ArrayList<>();

    public ArquivoProtegidoProxy(Arquivo arquivo) {
        this.arquivo = arquivo;
    }

    private void notificarObservadores(String usuario, boolean sucesso) {
        for (AuditoriaListener obs : observadores) {
            obs.registrarEvento(usuario, arquivo.nome, sucesso);
        }
    }

    public void adicionarObservador(AuditoriaListener observador) {
        observadores.add(observador);
    }

    @Override
    public void ler(String usuario) {
        if(usuario == null) {
            return;
        } else if (usuario.equals("ADMIN")) {
            notificarObservadores(usuario, true);
            arquivo.ler(usuario);
        }else {
            notificarObservadores(usuario, false);
            System.out.println("Access denied");
        }
    }
}
