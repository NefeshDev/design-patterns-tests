package Auditoria;

public class AuditoriaLog implements AuditoriaListener {
    @Override
    public void registrarEvento(String usuario, String arquivo, boolean sucesso) {
        String status = sucesso ? "SUCESSO" : "NEGADO";
        System.out.println("[AUDITORIA] O usuário " + usuario + " tentou ler o arquivo " + arquivo + " -> Status: " + status);
    }
}