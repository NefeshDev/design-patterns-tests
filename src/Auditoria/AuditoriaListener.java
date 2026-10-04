package Auditoria;

public interface AuditoriaListener {
    void registrarEvento(String usuario, String arquivo, boolean sucesso);
}
